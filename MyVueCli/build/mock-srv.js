'use strict'
const path = require('path')
const express = require("express")
var glob = require('glob')
var app = express();
var fs = require('fs'); //文件模块

const mockPath = '../src/mock';
const json404 = { code: 404, message: '本地数据找不到。' }
const json200 = { code: 200, message: '操作成功。' }

//支持跨域请求配置
var allowCrossDomain = function (req, res, next) {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Methods', 'GET,PUT,POST,DELETE');
  res.header('Access-Control-Allow-Headers', '*');
  // res.header('Access-Control-Allow-Headers', 'X-Requested-With');
  res.header('Access-Control-Allow-Credentials', 'true');
  next();
};
//支持跨域请求
app.use(allowCrossDomain);
// 设置路径匹配
app.use('/', function (req, res) {
  console.log("--------********--------")
  var basePath = path.resolve(__dirname, mockPath);
  var l = req.url.indexOf("?");
  var reqUrl = l == -1 ? req.url : req.url.substring(0, l);
  var mocks = glob.sync(basePath + reqUrl + '.json')
  if (mocks.length) {
    // var json = require(mocks[0]);
    fs.readFile(mocks[0], 'utf-8', function (err, data) {
      if (err) {
        res.send('文件读取失败');
      } else {
        res.send(data);
      }
    });
  } else {
    if (reqUrl.match(/add|save|del|delete|update/)){
      res.json(json200);
    }else{
      res.json(json404);
    }
  }
})

// 端口号
let server = app.listen(8001, function () {
  var host = server.address().address
  var port = server.address().port
  console.log("mock服务，访问地址为 http:%s%s", host, port)
})
