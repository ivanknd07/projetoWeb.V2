<template>
  <div>
     <img id="planoFundo" src="@/assets/Imagens/torcedorF.jpg" alt="falha...">

    <ul  id="nomeTimeCadJogador">
        <li>
           <h6> TOP TEAM FUTEBOL CLUB </h6> 
       </li>
    </ul>

    <ul id="escudoCadJogador">                 
        <li id="escudoCadJogador"> <img id="img" src="@/assets/Imagens/2.png" alt="falha"> </li>                 
  </ul>
    <table class= "container" id="table"> 
        <tr>
            <th> Nome </th>
            <th> Nascimento </th>
            <th> Endereco </th>
            <th> BAIRRO </th>
            <th> cidade </th>
            <th> posicao </th>
            <th> contrato </th>
            <th> status </th>
        </tr>
    </table>
    <li id="botaovoltar" >
        <input type="button" id="botao_amd" class="botaovoltar" value="INICIO" onclick="window.location='http://localhost:2002' ">
    </li>
      
  </div>
</template>

<script>
export default {
  name: "jogadoresPub",

}
</script>

<style>
#planoFundo{
    position: absolute;
    height:1100px; /*ALTURA*/
    min-width: 149%;/*LARGURA*/ 
    margin-left:-100%;
     
    box-sizing: content-box;
}

#nomeTimeCadJogador{
    margin-left: 37%;/*MARGEM ESQUERDA*/
    width: 250px;/*ALTURA*/
    height: 300px;/*LARGURA*/
    margin-top: 1%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#escudoCadJogador{
    margin-left: 35%;/*MARGEM ESQUERDA*/
    margin-top: 15px; /*MARGEM EM CIMA*/
    width: 30px;  /*LARGURA*/
    height: 10px;/*ALTURA*/  
    position: absolute;
}

#img{
     width: 150px;
     height: 150px;
     object-fit: fill;
     margin-left:150%;
}

table{
    background-color: antiquewhite;
    position: absolute;
    height: 5%;
    text-align: center;
    margin-top:200px;
    width: 100%;
    left: 7%;
    margin-left: 1px;
    margin-right: 8px;

}

table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}

th, td {
    padding: 5px;
}

td {
    max-width: 50px;
    overflow: hidden;
    text-overflow: ellipsis;

}

.botaovoltar{
    position: absolute;
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    margin-left: -50%;
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