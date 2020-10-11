<template>

 <div class="container-fluid">

<!----------------------------------------------------------------------------------------------------------------->
  <div class="row" style="background-color: cornflowerblue">

  <div class="col-sm-12"> <h6 id="nomeTimeCadJogador"> TOP TEAM FUTEBOL CLUB </h6> </div>
  
  <router-link id="texDec" class="botaovoltar col-sm-1" to="/"> INICIO </router-link>

  </div> 
<!----------------------------------------------------------------------------------------------------------------->
 <div class="row" style="background-color: cornflowerblue">
     
  <div class="col-sm-12"><img id="escudoCadJogador" src="@/assets/Imagens/2.png" alt="falha"></div>

  </div>

<!----------------------------------------------------------------------------------------------------------------->
    
  <div class="row">

  <div class="col-sm-12" style="background-color:white" id="nomeTimeCadJogador">   </div>

  </div> 

<!----------------------------------------------------------------------------------------------------------------->

  <div class="row">

  <div class="col-sm-12" style="background-color:white" id="nomeTimeCadJogador"> JOGOS ESCOLARES  </div>

  </div> 

<!----------------------------------------------------------------------------------------------------------------->
<div class="row" style="background-color: cornflowerblue"> 

  <div class="col-sm-2">
      <img id="galeria" src="@/assets/imagensConq/tacaEscolar.png" alt="Card image">
      <h6 class="card-title"> Campeão 2014</h6>   
 </div>

 <div class="col-sm-2">
      <img id="galeria" src="@/assets/imagensConq/tacaEscolar.png" alt="Card image">
      <h6 class="card-title"> Campeão 2016</h6>   
 </div>

 <div class="col-sm-2">
      <img id="galeria" src="@/assets/imagensConq/tacaEscolar.png" alt="Card image">
      <h6 class="card-title"> Campeão 2017</h6>   
 </div>

 <div class="col-sm-2">
      <img id="galeria" src="@/assets/imagensConq/tacaEscolar.png" alt="Card image">
      <h6 class="card-title"> Campeão 2018</h6>   
 </div>

 <div class="col-sm-2">
      <img id="galeria" src="@/assets/imagensConq/tacaEscolar.png" alt="Card image">
      <h6 class="card-title"> Campeão 2020</h6>   
 </div>
 
</div> 

<!----------------------------------------------------------------------------------------------------------------->
  <div class="row" style="background-color: cornflowerblue">

  <div class="col-sm-12" style="background-color:white" id="nomeTimeCadJogador"> JOGOS REGIONAIS </div>

  </div>
<!----------------------------------------------------------------------------------------------------------------->
  <div class="row" style="background-color: cornflowerblue">

  <div class="col-sm-4">
      <img id="galeria" src="@/assets/imagensConq/trofeuRegional.png" alt="Card image">
      <h6 class="card-title"> Campeão 2015</h6>   
  </div>

  <div class="col-sm-4">
      <img id="galeria" src="@/assets/imagensConq/trofeuRegional.png" alt="Card image">
      <h6 class="card-title"> Campeão 2017</h6>   
  </div>

  <div class="col-sm-4">
      <img id="galeria" src="@/assets/imagensConq/trofeuRegional.png" alt="Card image">
      <h6 class="card-title"> Campeão 2019</h6>   
  </div>

  </div>

<!----------------------------------------------------------------------------------------------------------------->
   <div class="row" style="background-color: cornflowerblue">

  <div class="col-sm-12" style="background-color:white" id="nomeTimeCadJogador"> JOGOS NACIONAIS </div>

  </div>

<!----------------------------------------------------------------------------------------------------------------->
    <div class="row" style="background-color: cornflowerblue">

    <div class="col-sm-6">
      <img id="galeria" src="@/assets/imagensConq/TrofeuNacional.png" alt="Card image">
      <h6 class="card-title"> Campeão 2016</h6>   
    </div>

    <div class="col-sm-6">
      <img id="galeria" src="@/assets/imagensConq/TrofeuNacional.png" alt="Card image">
      <h6 class="card-title"> Campeão 2019</h6>   
    </div>

    </div>
<!----------------------------------------------------------------------------------------------------------------->
    

</div>
   
</template>

<script>
export default {
    name: "conquistas"

}
</script>

<style>
#planoFundo{
    position: absolute;
    height:800px; /*ALTURA*/
    min-width: 180%;/*LARGURA*/ 
    margin-left:-100%;
     
    box-sizing: content-box;
}
#nomeTimeCadJogador{
    color:black;
    font-size: 20px;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#escudoCadJogador{
  
     width: 100px;
     height: 100px;
     object-fit: fill;
}

#galeria{
    width: 100px;
     height: 100px;
     object-fit: fill;

}

#jogoEscolares{
    margin-left: 41%;/*MARGEM ESQUERDA*/
    width: 100 px;/*ALTURA*/
    height: 300px;/*LARGURA*/
    top: 35%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 

}

#card_1{
    border: 1px, solid, black;
    
    margin-left: -750%;
    margin-top: 5%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
  
}

#card_2{
    border: 1px, solid, black;
  /*  height: 200px;
    width: 200px;*/
    margin-left: -550%;
    margin-top: -121%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
   
}
#card_3{
    border: 1px, solid, black;
  /*  height: 200px;
    width: 200px;*/
    margin-left: -350%;
    margin-top: -120%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
   
}

#card_4{
    border: 1px, solid, black;
  /*  height: 200px;
    width: 200px;*/
    margin-left: -160%;
    margin-top: -120%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
   
}

#card_5{
    border: 1px, solid, black;
  /*  height: 200px;
    width: 200px;*/
    margin-left: 15%;
    margin-top: -120%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
   
}
#card{
    width: 400px;
}

#img{
     width: 150px;
     height: 150px;
     object-fit: fill;
     margin-left:0%;
}



/*======================================= CONFIGURANO A GALERIA REGIONAL ======================================== */

#galeriaRegional{
    display:inline-block;
    margin-left: 57%;
    margin-top: 3%;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: relative;

}

#jogosRegionais{
    margin-left: 41%;/*MARGEM ESQUERDA*/
    width: 100 px;/*ALTURA*/
    height: 300px;/*LARGURA*/
    top: 75%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

.botaovoltar{
    
    border-radius: 10px;
    width: 10px;/*ALTURA*/
    height: 25px;/*LARGURA*/
    
    
    background-color:orangered;
    border-color: orangered;
    color:black;
    cursor: pointer;
    
}

.botaovoltar:hover {
    background-color:blue;
    color:white;
    border-radius: 10px;
    border-color: white;

}
a:link
{
text-decoration:none;/*PARA REMOVER O SUBLINHADO DOS LINKS*/
color: black;
}

</style>
