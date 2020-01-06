<template>
  <div id="app">
    <div>---------------------router-view-------------------------------</div>
    <router-view></router-view>
    <div>---------------------router-view-------------------------------</div>
    <div>---------------------Component-------------------------------</div>
    <hello-world></hello-world>
    <div>---------------------Component-------------------------------</div>
    <mytest ref="message"></mytest>
    <!--<div v-for="(item,name,index) of mytest">-->
      <!--<textarea>{{item}}.{{name}}.{{index}}</textarea>-->
    <!--</div>-->

    <button @click="getAllData">123</button>
    <input v-model="test">

  </div>
</template>

<script>

import HelloWorld from '@/components/HelloWorld'
import mytest from '@/components/mytest'
import { mapState } from 'vuex'
export default {
  name: 'App',
  components: {
    HelloWorld,
    mytest
  },
  data () {
    return {
      test:"",
      ab: '123',
      mytest:{
        a:"123",
        b:"123"
      }
    }
  },
  computed: mapState([
    'count'
  ]),

    mounted: function () {
      console.log( this.$refs.msg);
      this.$refs.message.getMessage('我是子组件一！')
  },
  methods:{
    getAllData(){
      let _this=this;
      this.$Axios.get('/test')
        .then(res=>{
          console.log("连接成功！");
          console.log("res:",res);
          _this.test=res.data;
          console.log(_this.test)
        })
        .catch(err=>{
          console.log("连接错误："+err);
          console.table(err);
        })
    }
  }


}
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
