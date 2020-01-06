import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import mytest from '@/pages/mytest/mytest'

Vue.use(Router)

export default new Router({
  mode:'history',
  routes: [
    {
      name: 'HelloWorld',
      path: '/a',
      component: () => import('@/pages/mytest/mytest')
    },
    {
      name: 'mytesy',
      path: '/mytest',
      component: HelloWorld
    }
  ]
})
