import Vue from 'vue'
import Router from 'vue-router'
import MainVue from '../components/main/Main'
import HelloWorld from '../components/HelloWorld'
import HelloVueWorld from '../components/HelloVueWorld'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Main',
      component: MainVue
    },
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
