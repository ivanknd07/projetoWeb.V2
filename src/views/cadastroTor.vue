<template>
  <div>
       <img id="planoFtorcedor" src="@/assets/Imagens/torcedorF.jpg" alt="falha">
            <div id= "formularioT">
            <form >
                <ul>
                    <li id="bemvindo">
                         SEJA BEM VINDO TORCEDOR
                    </li>
                    <br><br>
                    <li>
                         <label for="name">&nbsp;&nbsp;&nbsp;Nome:&nbsp;</label>
                         <input type="text" size="33" id="nome" name="nameA" max="31">
                         <label for="sexo">&nbsp;&nbsp;Sexo:</label>
                         <select id = "sexo">
                            <option value="masculino">Masculino</option>
                            <option value="feminino">Feminino</option>                            
                           </select>
                         <label for="data">D.N:&nbsp;</label>
                         <input type="date" size="12" id="data" name="data" max="31">
                    </li>
                    <br><br>
                    <li>
                     <label for="CPF">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; CPF:&nbsp;&nbsp;&nbsp;</label>
                     <input type="text" size="25" id="cpf" name="CPF" max="31">
                     <label for="email">&nbsp;Email:</label>
                     <input type="text" size="15" id="email" name="email" max="31">
                     <label for="tel">&nbsp;&nbsp;&nbsp;&nbsp;Tel:&nbsp;</label>
                     <input type="text" size="17" id="telefone" name="telefone" max="31" placeholder="(xx)xxxxxxxxx">
                    </li>
                    <br><br>
                    <li>
                         <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;End:&nbsp;</label>
                         <input type="text" size="24" id="endereco" name="endereco" max="31">
                         <label for="name">&nbsp;Bairro:&nbsp;</label>
                         <input type="text" size="15" id="bairro" name="bairro" max="31">
                         <label for="name">Cidade:</label>
                         <input type="text" size="14" id="cidade" name="cidade" max="31">
                    </li>
                    <br><br>
                    <li id="posiBotao">
                        <!--<input type="button" id="botaoVoltar" value="VOLTAR" onclick="window.location='telaInicial.html'">
                        <a href="inicio"></a>-->
                        <input type="reset" id="botao_clear" value="CORRIGIR">
                        
                     <!--  <input type="button" id="botao_add" value="SALVAR"onclick="validaTorcedor(form)"> -->
                        
                    </li>

                </ul>
                
            </form>
            
        </div>
        
        
       
            
            
        
        
  </div>
</template>

<script>
export default {
    name: "cadastroTor",

}
</script>

<style>
#planoFtorcedor{
    
    margin:0px;
    padding: 0px;
    position: absolute;    
    box-sizing: content-box;
    
    position: absolute;
    height:625px; /*ALTURA*/
    min-width: 150%;/*LARGURA*/ 
    margin-left:-100%;
}


#formularioT ul{/*CONFIGURANDO A LISTA*/
    list-style: none;/*PRA SUMIR COM OS MARCADORES DAS LISTAS*/
    display:ruby;
    position: absolute;        
    top: 15%;
    margin-left: 24%;
    border: solid 1px;
    border-color:blue;    
    padding: 2%;
    background-color:lightsteelblue;
}    

#bemvindo{
    margin-left: 0%;
     text-shadow: 1px 1px 1px orange, -1px 1px 1px orange,1px -1px 1px orange,1px 1px 1px orange,
    -1px -1px 1px orange;/*EFEITO COM SOMBRAS PARA DA O CONTORNO DO NOME DO TIME*/
    
}

</style>