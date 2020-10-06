<template>
  <div>
    teste
     <img id="planoFundo" src="@assets/aImagens/torcedorF.jpg" alt="falha...">

    <ul  id="nomeTimeCadJogador">
        <li> TOP TEAM FUTEBOL CLUB </li>
    </ul>

    <ul id="escudoCadJogador">                 
        <li id="escudoCadJogador"> <img src="Imagens/2.png" alt="falha"> </li>                 
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
        <input type="button" id="botao_amd" value="INICIO" onclick="window.location='telaInicial.html' ">
    </li>
      
  </div>
</template>

<script>
export default {
  name: "listJogadoresPub",

}
</script>

<style>

</style>