<template>
  <div>
      <img id="planoFundo" src="@/assets/Imagens/planoHistoria.jpg" alt="falha...">

    <ul  id="nomeTimeCadJogador">
        <li>
           <h6> TOP TEAM FUTEBOL CLUB </h6> 
       </li>
    </ul>

    <ul id="escudoCadJogador">                 
        <li id="escudoCadJogador"> <img id="img" src="@/assets/Imagens/2.png" alt="falha"> </li>                 
  </ul>
      <div id="container">
        <p id="texto">
          TOP TEAM e um time de futebol da primeira divisão da UFC,
          fundado em 16 DE dezembro de 1954, seu atual presidente e o
          Sr. JOSE JOÃO RAIMUNDO, em sua galeria de títulos tem: 
          5 jogos escolares, 3 regionais e 2 nacionais.
          Atualmente tem como treinador o Holandês Frank R U,
          em seu plantel contem 30 jogadores de várias posições,
          salários e nacionalidades. E todo ano acontece reformulações, 
          atletas e profissionais da comissão técnica que se transfere 
          para outros clubes, novos atletas que são contratados. 
        </p>  
      </div>
       <li id="botaovoltar" >
        <input type="button" id="botao_amd" class="botaovoltar" value="INICIO" onclick="window.location='http://localhost:2002' ">
       </li>
  </div>
</template>

<script>
export default {
    name: "historia"

}
</script>

<style>
    #planoFundo{
    position: absolute;
    height:650px; /*ALTURA*/
    min-width: 150%;/*LARGURA*/ 
    margin-left:-100%;
     
    box-sizing: content-box;
}

#nomeTimeCadJogador{
    margin-left: 37%;/*MARGEM ESQUERDA*/
    width: 100 px;/*ALTURA*/
    height: 300px;/*LARGURA*/
    margin-top: 3%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#escudoCadJogador{
    margin-left: 35%;/*MARGEM ESQUERDA*/
    margin-top: 29px; /*MARGEM EM CIMA*/
    width: 30px;  /*LARGURA*/
    height: 10px;/*ALTURA*/  
    position: absolute;

    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
}

#img{
     width: 150px;
     height: 150px;
     object-fit: fill;
     margin-left: 130%;
}

#container{
    border: 5px solid black;
    min-height: 35%;/*ALTURA MINIMA*/
    text-align: center;
    width: 88%;/*LARGURA*/
    position: absolute;
    box-sizing: content-box; 
    margin-left: 5%;
    margin-top: 17%;
}

#texto {
    margin-top: 5% ;
    text-align: justify;
    font-size: 16px;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/  

}
p {
    margin-left: auto;
    margin-right: auto;
    width: 70em
}

.botaovoltar{
    position: absolute;
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    margin-left: -47%;
    margin-top: 1%;
    border-radius: 10px;

    
    
    background-color:orangered;
    border-color: orangered;
    cursor: pointer;
    
}

.botaovoltar:hover {
    background-color:blue;
    color:white;
    border-radius: 10px;
    border-color: white;

}
</style>