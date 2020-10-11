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
                    <li v-for="cadJogador in cadJogadors" :key="cadJogador.cpf">{{ cadJogador }}</li> 
                    <li id="nomeCadastro">CADASTRO DE JOGADOR</li><br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;Nome:&nbsp;</label>
                        <input type="text" size="33" id="nome" v-model= "nome" name="cadJogador" max="100"> 
                        
                        <label for="CPF">&nbsp;&nbsp;&nbsp;CPF:&nbsp;</label>
                        <input type="text" size="10" id="cpf" v-model= "cpf" name="cadJogador" max="100"> 

                        <label for="name">&nbsp;&nbsp;&nbsp;Nascimento:&nbsp;</label>
                        <input type="date" size="10" id="nascimento" v-model= "nascimento" name="cadJogador" max="100"> 

                    </li>
                    <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;End:&nbsp;</label>
                        <input type="text" size="33" id="end" v-model= "end" name="cadJogador" max="100"> 
                        
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nº:&nbsp;</label>
                        <input type="number" size="1" id="nº" v-model= "num" name="cadJogador" max="100"> 

                        <label for="name">&nbsp;Bairro:&nbsp;</label>
                        <input type="text" size="10" id="bairro" v-model= "bairro" name="cadJogador" max="100"> 

                        <label for="name">Cidade:&nbsp;</label>
                        <input type="text" size="12" id="cidade" v-model= "cidade" name="cadJogador" max="100"> 

                    </li>
                   <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cep:&nbsp;</label>
                        <input type="number" size="24" id="cep" v-model= "cep" name="nameA" max="31"> 
                        
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tel:&nbsp;</label>
                        <input type="text" size="17" id="tel" v-model= "telefone" name="nameA" max="31"> 

                        <label for="name">&nbsp;Email:&nbsp;</label>
                        <input type="email" size="27" id="email" v-model= "email" name="nameA" max="31"> 

                    </li>
                        <br><br>
                    <li>
                        <label for="name">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Posição:&nbsp;</label>
                        <select id="posicao" v-model= "posicao">
                             <option value="Goleiro">Goleiro</option>
                             <option value="Zagueiro">Zagueiro</option>
                             <option value="Lateral-Dir">Lateral-Dir</option>
                             <option value="Lateral-Esq">Lateral-Esq</option>
                             <option value="Meia">Meia</option>
                             <option value="Atacante">Atacante</option>
                            </select>
                        
                        <label for="salario">&nbsp;Salario R$:&nbsp;</label>
                        <input type="text" size="8" id="salario" v-model= "salario" name="nameA" max="31"> 

                        <label for="contrato">&nbsp;Contrato até:&nbsp;</label>
                        <input type="date" size="7" id="contrato" v-model= "contrato" name="nameA" max="31"> 

                        <label for="status">&nbsp;Status:&nbsp;</label>                        
                        <select id="status" v-model= "status">
                             <option value="disponivel">Disponivel</option>
                             <option value="dpmedico">Dep. Medico</option>
                             <option value="suspenso">Suspenso</option>     
                        </select> 

                    </li>
                    <br><br><br>
                   
                    <li id="posiBotao">
                        <input type="reset" id="botao_clear" value="CORRIGIR">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="button" id="botao_add" value="SALVAR" @click="checkForm"> &nbsp;&nbsp;
                        <input type="button" id="botao_amd" value="VOLTAR para ADM" onclick="window.location='adm'">
                    </li>
    
                </ul>
            </form>
            
        </div>
</div>
  
</template>

<script>
export default {
    name: "cadJogador",

    data() {
        return{
            cadJogador: {},
            cadJogadors: [],
            nome: null,
            cpf: null,
            nascimento: null,
            end: null,
            num: null,
            bairro: null,
            cidade: null,
            cep: null,
            telefone: null,
            email: null, 
            posicao: null,
            salario: null,
            contrato: null,
            status: null
            
            
        };
    },

    methods: {
        checkForm: function () {
            this.cadJogadors = [];

            /* NOME */
            if(!this.nome){
                alert("Nome obrigatório");
                return false;
            
            }else if(this.nome.length < 3){
                alert("Nome com menos de 3 letras é inválido!");
                return false;
            }
            
            /* CPF */
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

            /* NASCIMENTO */
            if (!this.nascimento) {
                alert("A data de nascimento é obrigatória!");
                return false;
            } else{
                
                let hoje = new Date();
                let verificaData = new Date(this.nascimento);
                if(verificaData > hoje){
                    alert("Você não nasceu no futuro!");
                    return false;
                }
            }

            /* ENDERECO */
            if(!this.end){
                alert("Endereço obrigatório");
                return false;
            }

            /* NUMERO */
            if(!this.num){
                alert("Número obrigatório");
                return false;
            }else if(this.num < 1){
                alert("Número não é válido!");
                return false;
            }

            /* BAIRRO */
            if(!this.bairro){
                alert("Bairro obrigatório");
                return false;
            }

            /* CIDADE */
            if(!this.cidade){
                alert("Cidade obrigatória");
                return false;
            }

            /* CEP */
            if(!this.cep){
                alert("Cep obrigatório");
                return false;
            } else if(this.cep.length < 8 || this.cep.length > 8){
                alert("Cep Inválido!");
                return false;
            }

            /* TELEFONE */
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


            /* EMAIL */
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

            /* POSICAO */
            if(!this.posicao){
                alert("Posição obrigatória!");
                return false;
            }

            /* SALARIO */
            if(!this.salario){
                alert("Salário obrigatório");
                return false;
            } else if(this.salario < 0){
                alert("Salário Inválido!");
                return false;
            }
            

            /* CONTRATO */
            if (!this.contrato) {
                alert("A data de contrato é obrigatória!");
                return false;
            } else{
                
                let hoje = new Date();
                let verificaData = new Date(this.contrato);
                if(verificaData < hoje){
                    alert("Não é possível fazer contrato para o passado!");
                    return false;
                }
            }


            /* STATUS */
            if(!this.status){
                alert("Status obrigatório!");
                return false;
            }

            window.location="listaDeJogadores";

        },
    }

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
