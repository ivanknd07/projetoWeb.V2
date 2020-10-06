<template>

<div>
    <img id="planoFundo" src="@/assets/Imagens/torcedorF.jpg" alt="falha...">

        <ul  id="nomeTimeCadJogador">
            <li> 
                <h6>
                    TOP TEAM FUTEBOL CLUB
                </h6>  
            </li>
        </ul>

        <ul id="escudoCadJogador">                 
            <li id="escudoCadJogador"> <img src="@/assets/Imagens/2.png" alt="falha"> </li>                 
      </ul>

       


        <div id="cadastroJog">
            <form >
                <ul >
                    <li id="nomeCadastro">CADASTRO DE JOGADOR</li><br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;Nome:&nbsp;</label>
                        <input type="text" size="33" id="nome" name="cadJogador" max="100"> 
                        
                        <label for="CPF">&nbsp;&nbsp;&nbsp;CPF:&nbsp;</label>
                        <input type="text" size="10" id="cpf" name="cadJogador" max="100"> 

                        <label for="name">&nbsp;&nbsp;&nbsp;Nascimento:&nbsp;</label>
                        <input type="date" size="10" id="nascimento" name="cadJogador" max="100"> 

                    </li>
                    <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;End:&nbsp;</label>
                        <input type="text" size="33" id="end" name="cadJogador" max="100"> 
                        
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nº:&nbsp;</label>
                        <input type="text" size="1" id="nº" name="cadJogador" max="100"> 

                        <label for="name">&nbsp;Bairro:&nbsp;</label>
                        <input type="text" size="10" id="bairro" name="cadJogador" max="100"> 

                        <label for="name">Cidade:&nbsp;</label>
                        <input type="text" size="12" id="cidade" name="cadJogador" max="100"> 

                    </li>
                   <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cep:&nbsp;</label>
                        <input type="text" size="24" id="cep" name="nameA" max="31"> 
                        
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tel:&nbsp;</label>
                        <input type="text" size="17" id="tel" name="nameA" max="31"> 

                        <label for="name">&nbsp;Email:&nbsp;</label>
                        <input type="email" size="27" id="email" name="nameA" max="31"> 

                    </li>
                        <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Posição:&nbsp;</label>
                        <select id="posicao">
                             <option value="Goleiro">Goleiro</option>
                             <option value="Zagueiro">Zagueiro</option>
                             <option value="Lateral-Dir">Lateral-Dir</option>
                             <option value="Lateral-Esq">Lateral-Esq</option>
                             <option value="Meia">Meia</option>
                             <option value="Atacante">Atacante</option>
                            </select>
                        
                        <label for="salario">&nbsp;Salario R$:&nbsp;</label>
                        <input type="text" size="8" id="salario" name="nameA" max="31"> 

                        <label for="contrato">&nbsp;Contrato até:&nbsp;</label>
                        <input type="date" size="7" id="contrato" name="nameA" max="31"> 

                        <label for="status">&nbsp;Status:&nbsp;</label>                        
                        <select id="status">
                             <option value="disponivel">Disponivel</option>
                             <option value="dpmedico">Dep. Medico</option>
                             <option value="suspenso">Suspenso</option>     
                        </select> 

                    </li>
                    <br><br><br>
                   
                    <li id="posiBotao">
                        <input type="reset" id="botao_clear" value="CORRIGIR">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="button" id="botao_add" value="SALVAR" onclick="cadastraJogador(nome, cpf, nascimento, end, nº, bairro, cidade, cep, tel,
                        email, posicao, salario, contrato, status)"> &nbsp;&nbsp;
                        <input type="button" id="botao_amd" value="VOLTAR para ADM" onclick="window.location='adm.html' ">
                    </li>
    
                </ul>
            </form>
            
        </div>
</div>
  
</template>

<script>
export default {
    name: "cadJogador",

}
</script>

<style>
#planoFundo{
    
    margin:0px;
    padding: 0px;
    position: absolute;    
    
    position: absolute;
    height:800px; /*ALTURA*/
    min-width: 150%;/*LARGURA*/ 
    margin-left:-100%;
}

#nomeTimeCadJogador{
    margin-left: 37%;/*MARGEM ESQUERDA*/
    width: 100 px;/*ALTURA*/
    height: 100px;/*LARGURA*/
    margin-top: 1%;
    color:black;
    font-size: 20px;
    position:absolute;
    list-style: none;/*Tira o ponto da lista*/
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#escudoCadJogador{
    margin-left: 37%;/*MARGEM ESQUERDA*/
    margin-top: 20px; /*MARGEM EM CIMA*/
    width: 5%;  /*LARGURA*/
    height: 2%;/*ALTURA*/  
    position: absolute;
} 
img{
    width: 150px;
    height: 150px;
    object-fit: fill;
}

#nomeCadastro{
    margin-left: 0%;
    text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/ 
}

#cadastroJog ul{/*CONFIGURANDO A LISTA*/
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    display:ruby;
    position: absolute;        
    top: 30%;
    
    border: solid 1px;
    border-color:orangered;    
    margin: 2%;
    padding: 2%;
    margin-left: 17%;
    background-color:lightsteelblue;
}

#posiBotao{
    margin-left: 0%;
    margin-top: -4%;
    padding: 1%;
}
#posiBotao :hover {
    background-color: green;
    color: white;
    
}

</style>