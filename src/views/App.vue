<template>
  <div id="app">
    
    
    <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div>
  
   <!-- <router-view/>-->
  <telaInicial> </telaInicial>
  <Adm> </Adm>
 
 
    
  </div>
</template>

<script>
import telaInicial from './views/telaInicial.vue'
import Adm from'./views/Adm.vue'
import teste from './components/teste.vue'


export default {
  name: "App",

  components: {
    telaInicial,
    Adm
    
  },
  
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
