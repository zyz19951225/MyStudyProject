// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import Index from './index.vue'
import router from '@/router/index'
import store from '@/store/store'
import Vuex from 'vuex'
import axios from '@/axios'
//import '@/mock/mock'
Vue.prototype.$Axios = axios


Vue.use(Vuex)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  store,
  router,
  components: { Index },
  template: '<Index/>'
})
