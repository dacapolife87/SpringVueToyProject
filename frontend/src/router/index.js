import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '../components/HelloWorld'
import HelloVueWorld from '../components/HelloVueWorld'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/vue',
      name: 'HelloWorld',
      component: HelloWorld
      // children: [
      //   {
      //     path: 'hellovue',
      //     name: 'HelloVueWorld',
      //     component: HelloVueWorld
      //   }
      // ]
    },
    {
      path: '/hellovue',
      name: 'HelloVueWorld',
      component: HelloVueWorld
    }
  ]
})
