<template>
  <div>
      <img id="planoFundoAdm" src="@/assets/Imagens/bola.jpg" alt="falha">  
            <ul id="escudoAdm">                 
                 <li id="escudoAdm"> <img src="@/assets/Imagens/2.png" alt="falha"> </li>                 
           </ul>

            <ul  id="nomeTimeAdm">
                 <li> TOP TEAM FUTEBOL CLUB </li>
           </ul> 

           <ul id="listaMenuAdm">
              <!-- <a href=""><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DIRETORIA</li></a>
               <a href=""><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;COMISSÃO TECNICA</li></a>
               <a href="cadJogador.html"><li id="itemListaAdm">CADASTRO DE JOGADORES</li></a>
               <a href="listJogadores.html"><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;LISTA DE JOGADORES</li></a>
               <a href=""><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FINANÇAS</li></a>
               <a href=""><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                PATROCINADORES</li></a>
               <a href="listTorcedores.html"><li id="itemListaAdm">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TORCEDORES</li></a>
                --> 
                <li id="itemListaAdm">
                    <router-link id="texDec" to="/"> D I R E T O R I A </router-link>
                </li>

                <li id="itemListaAdm">
                   <router-link id="texDec" to="/comissaoTecnica"> COMISSÃO TECNICA </router-link>
                </li>

                <li id="itemListaAdm">
                    <router-link id="texDec" to="/cadJogador"> CADASTRAR JOGADORES </router-link>
                </li>

                <li id="itemListaAdm">
                    <router-link id="texDec" to="/listaDeJogadores"> J O G A D O R E S </router-link>
                </li>

                <li id="itemListaAdm">
                    <router-link id="texDec" to="/"> F I N A N Ç A S </router-link>
                </li>

                <li id="itemListaAdm">
                    <router-link id="texDec" to="/patrocinadores"> P A T R O C I N A D O R E S </router-link>
                </li>

           </ul>
           <ul id="listaBotaoSair">
              <!-- <a href="telaInicial.html"><li id="itemSair"> &nbsp;&nbsp;Sair </li></a>-->
               <li id="itemSair">
                    <router-link id="texDecc" to="/telaInicial"> Sair </router-link>
                </li>

           </ul>
  </div>
</template>

<script>
export default {
    name: "Adm",

}
</script>

<style>
#escudoAdm {
    margin-left: -10px;/*MARGEM ESQUERDA*/
    margin-top: 2px; /*MARGEM EM CIMA*/
    width: 30px;  /*LARGURA*/
    height: 10px;/*ALTURA*/  
    position: absolute;
}

#planoFundoAdm {
   position: absolute;
    height:1100px; /*ALTURA*/
    min-width: 150%;/*LARGURA*/ 
    margin-left:-100%;
    /*box-sizing: content-box;*/
} 

#listaAdm{
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    display:inline-block;
    position: absolute;        
    top: 20%;
    left: 30%px;        
    margin: 2%;
    padding: 2%;
    margin-left: 25%;
    
}

#nomeTimeAdm {
    margin-left: 250px;/*MARGEM ESQUERDA*/
    width: 100 px;/*ALTURA*/
    height: 300px;/*LARGURA*/
    margin-top: 1%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/   

}

#listaMenuAdm{
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    display:inline-block;
    position: absolute;        
    top: 5%;
    left: 75%;
    height: 298px;/*ALTURA*/
    width:  300px; /*LARGURA*/  
    margin: 2%;
    padding: 0%;   
}

#itemListaAdm{
    margin:25px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    font-family: "arial";
    font-size: 15px;
    color:black;
    border:solid 1px;
    border-radius: 1px;
    background-color:orangered;;
    border-color:orange;
    margin-left: 40px;
    cursor: pointer;
    margin: 12%;
    text-decoration:none;
}

a:link
{
text-decoration:none;/*PARA REMOVER O SUBLINHADO DOS LINKS*/
color: black;
}

#texDec
 {  
        text-decoration-line: none;/*TIRANDO O SOBRINHADO DO LINK*/
        color: black;
        text-shadow: 1px 1px 1px blue, -1px 1px 1px blue,1px -1px 1px blue,1px 1px 1px blue,
        -1px -1px 1px blue;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/
}

#texDecc
 {  
        text-decoration-line: none;/*TIRANDO O SOBRINHADO DO LINK*/
        color: black;
 }       

#itemListaAdm:hover{
    background-color:white;
    color:black;
}

#listaBotaoSair {
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    display:inline-block;
    position: absolute;        
    top: -50px;
    left: 84%;
    height: 298px;/*ALTURA*/
    width:  150px; /*LARGURA*/  
    margin: 2%;
    padding: 2%;
}

#itemSair{
    margin:25px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    font-family: "arial";
    font-size: 20px;
    color:black;
    border:solid 1px;
    border-radius: 10px;
    background-color:orangered;
    border-color:white;
    margin-left: 40px;
    cursor: pointer;
    margin: 12%;
}

#itemSair:hover{
    background-color:blue;
    color:white;

}

</style>