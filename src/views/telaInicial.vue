<template>
  
  <div id="App">
      <img id="planoFundo" src="@/assets/Imagens/campo.jpg" alt=" falha..">
    <div class="container">
     
      <div class="row"><!-- LINHA 2-->
                    <div class="col-md-8 divMenuNav">
                        <h6 id="nomeTime">&nbsp;&nbsp;&nbsp;TOP TEAM FUTEBOL CLUB</h6>  
                        <img id="escudo" src="@/assets/Imagens/2.png" alt="falha..."><br> 
                        <ul class="list-group list-group-horizontal divlistaMenu">  
                           <a href="cadastroTor.html"><li id="divlistaMenu">&nbsp;&nbsp;&nbsp;&nbsp;SEJA TORCEDOR </li></a>                        
                            <a href=""><li id="divlistaMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;HISTORIA</li></a> 
                            <a href=""><li id="divlistaMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CONQUISTAS</li></a> 
                        </ul>
                    </div>
                </div>

                <br>

                <ul class="list-group list-group-vertical divLateral">   
                                <li id="nomeMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MENU</li>              
                                <a id="texDec" href="listJogadoresPub.html"><li id="itensMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                 &nbsp;&nbsp;&nbsp; JOGADORES </li></a>
                                <a id="texDec" href=""><li id="itensMenu">&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;COMISSÃO TECNICA</li></a>
                                <a id="texDec" href=""><li id="itensMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;DIRETORIA</li></a>             
                                <a id="texDec" href=""><li id="itensMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PATROCINADORES</li></a>
                              
                                <br><br>

                                <form name= "envio">
                                <li id="Login"><!--LOGIN-->
                                    
                                    <label for="email">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    Email:&nbsp;</label>                    
                                    <input type="text" size="21" id="email" placeholder=" xxxx@xxxx.xxx "><br>
                                
                                    <label for="senha">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                     &nbsp;&nbsp; Senha:&nbsp;</label>                    
                                    <input type="text" size="20" id="senha">
                                </li>

                                <li id="botaoRecSenha"><br><br>                
                                    <input type="button" class="btn-sm" id="cad" value="Recuperar Senha">
                                </li>
                
                                <li id="botaoacesso"><br><br> 

                                    <input type="button" class="btn-sm" id="aces" value="Acesso" onclick="validacao(form)">
                                </li> 

                                </form> 

                          <ul class="list-group-vertical divAncora">   
                                <li id="nomeMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Acesse</li>   

                                <a id="texDec" href="https://globoesporte.globo.com/" target="_blank"><li id="itensAcesso">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                 &nbsp;&nbsp;Globo Esporte</li></a>

                                <a id="texDec" href="https://globoesporte.globo.com/cartola-fc/" target="_blank"><li id="itensAcesso">&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cartola</li></a> 

                               <a id="texDec" href="https://www.foxsports.com.br/br/" target="_blank"><li id="itensAcesso">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Fox Sport</li></a>   

                                <a id="texDec" href="https://www.espn.com.br/" target="_blank"><li id="itensAcesso">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Espn</li></a>       

                         </ul>

                         <ul>
                             
                         </ul>

                         <ul id="rodapepagina">                
                                 <li id="rodapesite">
                                           www.topteamoficial.com.br
                                 </li>
                          </ul>
          
                        </ul>
    </div>

  </div>

</template>

<script>
export default {
    name: "telaInicial",

}
</script>

<style>
#planoFundo{
    position: absolute;
    height:1100px; /*ALTURA*/
    min-width: 150%;/*LARGURA*/ 
    margin-left:-100%;
     
    box-sizing: content-box;
}   
.container {
    border: 3px solid yellowgreen;
    min-height: 1000px;/*ALTURA MINIMA*/
   /* min-width: 80%;*/
   width: 100%;/*LARGURA*/
   /* height: 1248px;/*ALTURA*/
}
#nomeTime{/*CONFIGURAÇÃO DO NOME */
    margin-left: 52%;/*MARGEM ESQUERDA*/
    width: 300px;/*LARGURA*/
    height: 100px;/*ALTURA*/
    margin-top: 2%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/
}

#escudo{
    margin-left: 50%;
    margin-top: 5%;
    width: 30%;/* LARGURA*/
}

/*-------------------------------- DIV MENU NAV (SEJA SORCIO / HISTORIA / CONQUISTAS)--------------------------------*/

.divlistaMenu {
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: absolute;      
    top: 100%;
    margin-left: 70%;  
}

#divlistaMenu{
    display:inline-block;
    border-radius: 5px;          
    background-color:orange;/*COR DE FUNDO*/
    border-color: darkslateblue;
    margin: 15px;
    height: 27px;/*ALTURA*/
     width: 150px; /*LARGURA*/
    cursor: pointer;/*PRA APARECER A MÃO DO MOUSE*/   
    color: black;   
}
#divlistaMenu:hover{
    background-color: white;
    border-bottom:solid 5px;
    border-color: orange;
}

/*------------------------------------------------- DIV MENU LATERAL-----------------------------------------------*/
.divLateral{
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: absolute;      
    top: 50px;
    margin-left: 5%;   
    margin-top: 18%;
    padding:3px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    height: 350px;/*ALTURA*/
    width:  290px; /*LARGURA*/
    background-color:black;
}

#nomeMenu{
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    color: chartreuse;
    margin-top: 5%;
    margin:5px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    font-family: "arial";
    font-size: 18px;
    color:white; 
    border-bottom:solid 2px;
    border-color: orange;
    color:orange;
    width: 75%;
    margin-left: 35px;
}

#itensMenu{
    margin: 2%;
    height: 25px;/*ALTURA*/
    width: 260px;/**LARGURA*/
    margin-top: 5%;
    margin-left: 5%;
    border: solid 1px;
    color:black;
    background-color:orange;
    cursor: pointer;/*PRA APARECER A MÃO DO MOUSE*/
}
#itensMenu:hover{
    background-color: white;
    border-color: whites;
}
#texDec
 {  
        text-decoration-line: none;/*TIRANDO O SOBRINHADO DO LINK*/
}

#Login{
    display:ruby;
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: absolute;    

    top: 220px;
    left: 6%;
       
    color: orange;
    font-family: Arial, Helvetica, sans-serif;
    size: 10px;
}

#botaoRecSenha{
    list-style: none;/*Tira o ponto da lista*/
    display: ruby;
    position: absolute;
    color:white;    
    margin: 0px;
    left: 15%;
    top: 270px;
    color: white;
    cursor: pointer;
    width: 40px; /*LARGURA*/
    height: 15px;/*ALTURA*/
    border-color: orange;
    font-size: 10px;
}


#botaoacesso{
    position: absolute;
    color:white;  
    list-style: none;/*Tira o ponto da lista*/
    display: ruby;
    margin-left: 64%;
    top: 250px;
    color: black; 
    cursor: pointer;  
    border-width:1px;
    width: 50px; /*LARGURA*/
    height: 10px;/*ALTURA*/
}

/*------------------------------------------------- DIV LINKS DE ACESSO-----------------------------------------------*/
.divAncora{
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: absolute;      
    margin-top: 130%;
    margin-left: 0%;   
    padding: 2px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    height: 350px;/*ALTURA*/
    width:  290px; /*LARGURA*/
    background-color: black;
}

#itensAcesso{
    margin: 15%;
    height: 25px;/*ALTURA*/
    width: 200;/**LARGURA*/
    margin-left: 15%;
    border: solid 1px;
    color:black;
    background-color:orange;
    cursor: pointer;/*PRA APARECER A MÃO DO MOUSE*/
    text-shadow: 1px 1px 1px blue, -1px 1px 1px blue,1px -1px 1px blue,1px 1px 1px blue,
    -1px -1px 1px blue;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}
#itensAcesso:hover{
     background-color: white;
     border-bottom:solid 3px;
     border-color:green;
}
/*--------------------------------------------------- DIV SLIDE-------------------------------------------------------*/
.divSlide{
    list-style: none;/*REMOVENDO OS PONTOS DOS ITENS DA LISTA*/
    position: absolute;      
    margin-top: 165%;
    margin-left: 1200%;   
    padding: 2px;/*ESPAÇAMENTO VERTICAL ENTRE OS ITENS DA LISTA*/
    height: 250x;/*ALTURA*/
    width:  600px; /*LARGURA*/
    border: solid 1px blue;

}
/*------------------------------------ CONFIGURANDO O TITULO E A MATERIA DO SLIDE ----------------------------------*/
#tituloF{
    color:red;
    margin-top: -8%;
    margin-left:-70%;
    width:  600px; /*LARGURA*/
    position: absolute;
}

#paragrafoF{
    color:black;
    margin-top: 0%;
    margin-left:-35%;
    width:  600px; /*LARGURA*/
    position: absolute;
    font-size: 10x;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#tituloMessi{
    color:blue;
    margin-top: -8%;
    margin-left:-70%;
    width:  600px; /*LARGURA*/
    position: absolute;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 

}
#paragrafoMessi{
    color:black;
    margin-top: 0%;
    margin-left:-20%;
    width:  600px; /*LARGURA*/
    position: absolute;
    font-size: 10x;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}
/*------------------------------------------------------------------------------------------------------------*/
#tituloBrasi{
    color: white;
    margin-top: -8%;
    margin-left:-70%;
    width:  600px; /*LARGURA*/
    position: absolute;
    text-shadow: 1px 1px 1px black, -1px 1px 1px black,1px -1px 1px black,1px 1px 1px black,
    -1px -1px 1px black;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 

}
#paragrafoBrasil{
    color:white;
    margin-top: 0%;
    margin-left:-20%;
    width:  600px; /*LARGURA*/
    position: absolute;
    font-size: 8x;
    text-shadow: 1px 1px 1px black, -1px 1px 1px black,1px -1px 1px black,1px 1px 1px black,
    -1px -1px 1px black;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
 

}/*------------------------------------------ CONFIGURANDO O RODAPE DO SITE ----------------------------------------*/

#rodapepagina{/*CONFIGURANDO A LISTA DO RODAPE DA PAGINA*/
    
    height: 150px;/*ALTURA*/
    width:  100%; /*LARGURA*/    
    margin-top: 120%;
    margin-left: 100%;
    list-style: none;/*Tira o ponto da lista*/
   
    
}
#rodapesite {/*CONFIGURANDO UM ITEM DA LSITA*/
    position: absolute;
    height: -6px;
    margin-left: 60%;
    margin-top: 52%;
    color:black;
    font-family: Arial, "Helvetica Neue", Helvetica, sans-serif;
    border: solid 1px;
    border-color:orangered;
    padding: 5px;
    border: size 15px;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orangered;

}
#divNoticias {

  border:solid 1 px crimson;
  height: 50px;
  width: 20px;
}


</style>
