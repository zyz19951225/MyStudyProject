import axios from 'axios'
// axios 配置
axios.defaults.timeout = 5000;
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
axios.defaults.baseURL = 'http://localhost:8001';

axios.interceptors.request.use((config) => {
  if (config.method === 'get') {
    // config.data = qs.stringify(config.data);
    config.data = JSON.stringify(config.data);
  }
  return config;
},(error) =>{
  return Promise.reject(error);
});

//返回状态判断
axios.interceptors.response.use((res) =>{
  if(!res.data){	//这里根据接口返回的实际情况来写
    //这里是接口异常，可以统一弹窗提示错误信息
    //ElementUI.Message.error(res.data.message);
    return Promise.reject(res);
  }
  return res;
}, (error) => {
  //404等问题可以在这里处理
  return Promise.reject(error);
});


// POST
export function post(api, params) {
  return new Promise((resolve, reject) => {
    params = JSON.stringify(params);
    axios.post(api, params)
      .then((response) => {
        resolve(response.data);
      }, (err) => {
        reject(err);
      })
      .catch((error) => {
        reject(error);
      });
  });
}


//GET
export function get(api, data) {
  return new Promise((resolve, reject) => {
    axios.get(api, { params: data })
      .then((response) => {
        resolve(response.data);
      }, (err) => {
        reject(err);
      })
      .catch((error) => {
        reject(error);
      });
  });
}

export default {
 get,
 post

}

