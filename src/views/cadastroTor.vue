<template>
  <div>
       <img id="planoFtorcedor" src="@/assets/Imagens/torcedorF.jpg" alt="falha">
            <div id= "formularioT">
            <form>
                <ul>
                    <li id="bemvindo">
                         SEJA BEM VINDO TORCEDOR
                    </li>
                    <li v-for="cadastroTor in cadastroTors" :key="cadastroTor.cpf">{{ cadastroTor }}</li> 
                       
                            <br><br>
                            <li>
                                <label for="name">&nbsp;&nbsp;&nbsp;Nome:&nbsp;</label>
                                <input type="text" size="33" id="nome" v-model= "nome" name="nameA" max="31" >
                                <label for="sexo">&nbsp;&nbsp;Sexo:</label>
                                <select id = "sexo" v-model= "sexo">
                                    <option value="masculino">Masculino</option>
                                    <option value="feminino">Feminino</option>                            
                                </select>
                                <label for="data">D.N:&nbsp;</label>
                                <input type="date" size="12" id="data" v-model= "data" name="data" max="31">
                            </li>
                            <br><br>
                            <li>
                            <label for="CPF">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; CPF:&nbsp;&nbsp;&nbsp;</label>
                            <input type="text" size="25" id="cpf" v-model= "cpf" name="CPF" max="31">
                            <label for="email">&nbsp;Email:</label>
                            <input type="text" size="15" id="email" v-model= "email" name="email" max="31">
                            <label for="tel">&nbsp;&nbsp;&nbsp;&nbsp;Tel:&nbsp;</label>
                            <input type="text" size="17" id="telefone" v-model= "telefone" name="telefone" max="31" placeholder="(xx)xxxxxxxxx">
                            </li>
                            <br><br>
                            <li>
                                <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;End:&nbsp;</label>
                                <input type="text" size="24" id="endereco" v-model= "endereco" name="endereco" max="31">
                                <label for="name">&nbsp;Bairro:&nbsp;</label>
                                <input type="text" size="15" id="bairro" v-model= "bairro" name="bairro" max="31">
                                <label for="name">Cidade:</label>
                                <input type="text" size="14" id="cidade" v-model= "cidade" name="cidade" max="31">
                            </li>
                            <br><br>
                            <li id="posiBotao">
                                <!--<input type="button" id="botaoVoltar" value="VOLTAR" onclick="window.location='telaInicial.html'">
                                <a href="inicio"></a>-->
                                <input type="reset" id="botao_clear" value="CORRIGIR">
                            </li>   
                    
                        <input type="button" id="botao_add" value="SALVAR" @click="checkForm" > 
                        
                    

                </ul>
                
            </form>
            
        </div>
        
        
       
            
            
        
        
  </div>
</template>

<script>
export default {
    name: "cadastroTor",

    data() {
        return{
            cadastroTor: {},
            cadastroTors: [],
            nome: null,
            sexo: null,
            data: null,
            cpf: null,
            email: null,
            telefone: null,
            endereco: null,
            bairro: null,
            cidade: null
        };
    },

    methods: {
        checkForm: function () {
            this.cadastroTors = [];


            if(!this.nome){
                alert("Nome obrigatório");
                return false;
            
            }else if(this.nome.length < 3){
                alert("Nome com menos de 3 letras é inválido!");
                return false;
            }
            if(!this.sexo){
                alert("Sexo obrigatório");
                return false;
            }
             
            if (!this.data) {
                alert("A data de nascimento é obrigatória!");
                return false;
            } else{
                
                let hoje = new Date();
                let verificaData = new Date(this.data);
                if(verificaData > hoje){
                    alert("Você não nasceu no futuro!");
                    return false;
                }
            }
            if (!this.cpf) {
                alert("O CPF é obrigatório!");
                return false;
            } else {
                var verificaCpf = this.cpf;
                var soma;
                var resto;
                soma = 0;
                
                if (verificaCpf.length > 11 || verificaCpf.length < 11 ) {
                    alert("CPF invalido!");
                    return false;
                }

                if (verificaCpf == "00000000000"){ 
                    alert("CPF invalido!");
                    return false;
                    
                }

                for (var i=1; i<=9; i++) 
                    soma = soma + parseInt(verificaCpf.substring(i-1, i)) * (11 - i);
                resto = (soma * 10) % 11;

                if ((resto == 10) || (resto == 11))  
                    resto = 0;
                
                if (resto != parseInt(verificaCpf.substring(9, 10)) ){
                    alert("CPF invalido!");
                    return false;
                    
                }

                soma = 0;
                for (var x=1; x <= 10; x++) 
                    soma = soma + parseInt(verificaCpf.substring(x-1, x)) * (12 - x);
                resto = (soma * 10) % 11;

                if ((resto == 10) || (resto == 11))  
                    resto = 0;
                
                if (resto != parseInt(verificaCpf.substring(10, 11) ) ){
                alert("CPF invalido!");
                    return false;
                    
                } 
            }

            if (!this.email) {
                alert("O e-mail é obrigatório!");
                return false;
            } else {
                if(this.email.indexOf("@") == -1 || this.email.indexOf(".") == -1 
                    || this.email == "" || this.email.indexOf("@.") != -1) {
                    alert("O e-mail é inválido!");
                    this.email.focus();
                    return false;
                }              
            }    

            if(!this.telefone) {
                alert("Telefone obrigatório!");
                return false;
            } else{
                if(this.telefone.length < 13 || this.telefone.length > 13){
                    alert("Telefone inválido");
                    return false;
                }

                else if (this.telefone.indexOf("()") != -1) {
                    alert("Telefone inválido!");
                    return false;
                }   
            }

            if(!this.endereco){
                alert("Endereço obrigatório");
                return false;
            }
            if(!this.bairro){
                alert("Bairro obrigatório");
                return false;
            }
            if(!this.cidade){
                alert("Cidade obrigatória");
                return false;
            }
            window.location="/";
        },
    }
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
