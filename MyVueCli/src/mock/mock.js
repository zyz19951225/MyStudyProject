// const Mock =require('mockjs');//获取mockjs插件.这种方式也可以
import Mock from 'mockjs'

const Random =Mock.Random;
const produceData=function(opt){
  console.log('opt:',opt); //这里注意：不能用加号代替逗号，即不能写成：console.log('opt:'+opt);
  let articles=[];
  for(let i=0;i<1;i++){
    let newArticleObject={
      code:"200",
      name:Random.cname(), //随机生成一个中文名
      email:Random.email(), //随机生成一个电子邮件
      date:Random.date()+' ' +Random.time() //随机生成日期和时间
    }
    articles.push(newArticleObject);
    console.log(articles)
  }
  return{
    data:articles
  }
}

var data = Mock.mock({
   code:200,
  'list|1-3': [{// 属性 list 的值是一个数组，其中含有 1 到 10 个元素
    'id|+1': 1, // 属性 id 是一个自增数，起始值为 1，每次增 1
    'name|1':"吴小明",  //字符串
    "city": {
      'number|1':"03443",
      'cityname|1':"北京"
    }
  }]
})
Mock.mock('https://localhost:8009/user',/post|get/i,produceData); //当post或get请求到/user路由时，mock会拦截请求并返回
 //Mock.mock('https://localhost:8009/user',data); //这种方式就只能用post请求,注意post要加引号
