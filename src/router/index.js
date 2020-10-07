import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
  
    component: function () {
      return import('../views/telaInicial.vue')
    } 
  },
  /*---------------------------------------------------------------------------------------------------------*/
  {
    path: '/adm',
    name: 'Adm',
    
    component: function () {
      return import('../views/Adm.vue')
    } 
  },


  {
    path: '/',
    name: 'Adm',
    
    component: function () {
      return import('../views/Adm.vue')
    }  
  },
  /*---------------------------------------------------------------------------------------------------------*/

  {
    path: '/cadastroTor',
    name: 'cadastroTor',
    
    component: function () {
      return import('../views/cadastroTor.vue')
    } 
  },


  {
    path: '/',
    name: 'cadastroTor',
    
    component: function () {
      return import('../views/cadastroTor.vue')
    } 
  },
  /*---------------------------------------------------------------------------------------------------------*/ 
  {
    path: '/cadJogador',
    name: 'cadJogador',
    
    component: function () {
      return import('../views/cadJogador.vue')
    } 
  },


  {
    path: '/',
    name: 'cadJogador',
    
    component: function () {
      return import('../views/cadJogador.vue')
    } 
  },
  /*---------------------------------------------------------------------------------------------------------*/
  {
    path: '/listaDeJogadores',
    name: 'listaDeJogadores',
    
    component: function () {
      return import('../views/listaDeJogadores.vue')
    } 
  },


  {
    path: '/',
    name: 'listaDeJogadore',
    
    component: function () {
      return import('../views/listaDeJogadores.vue')
    } 
  },

  /*---------------------------------------------------------------------------------------------------------*/
  {
    path: '/jogadoresPub',
    name: 'jogadoresPub',
    
    component: function () {
      return import('../views/jogadoresPub.vue')
    } 
  },


  {
    path: '/',
    name: 'jogadoresPub',
    
    component: function () {
      return import('../views/jogadoresPub.vue')
    } 
  },

  /*---------------------------------------------------------------------------------------------------------*/
  {
    path: '/listTorcedores',
    name: 'listTorcedores',
    
    component: function () {
      return import('../views/listTorcedores.vue')
    } 
  },


  {
    path: '/',
    name: 'listTorcedores',
    
    component: function () {
      return import('../views/listTorcedores.vue')
    } 
  },

  /*---------------------------------------------------------------------------------------------------------*/

  

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
