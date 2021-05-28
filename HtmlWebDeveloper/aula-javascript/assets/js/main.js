/*
var nome = "Diansley Fernandes de Lima";
var idade = 31;
alert("Bem vindo " + nome);
console.log(nome);
console.log(idade);



var frase = "Uberlândia é o melhor time do mundo"
console.log(frase.replace("Uberlândia", "Vasco"))
console.log(frase.toUpperCase())



var lista = ["maça", "pera", "laranja"];
lista.push("uva")
console.log(lista[1]); //lista na posição 1
console.log(lista); //imprimir lista
console.log(lista.length); //tamanho da lista
console.log(lista.reverse()); //reverso da lista
console.log(lista.toString()); //converter para string
console.log(lista.join(" - ")); //substituir as vírgulas por "-"



//dicionário
var fruta = {nome:"maça", cor:"vermelha"}
console.log(fruta);
console.log(fruta.nome);
console.log(fruta.cor);



//lista - dicionário
var frutas = [{nome:"maça", cor:"vermelha"}, {nome:"uva", cor:"verde"}]
console.log(frutas);
console.log(frutas[1].nome);
console.log(frutas[1].cor);



//condicional
var minhaIdade = prompt("Qual sua idade?")
if(minhaIdade >= 18) {
    alert("Maior de idade")
} else {
    alert("menor de idade")}



//Estrutura de repetição
var count = 0;
while (count <= 5) {
    console.log(count);
    count++; //count = count + 1;
}



var contador
for (contador=5; contador >= 0; contador--) {
    alert(contador);
}




var data = new Date();
alert(data);
alert("O mês atual é " + (data.getMonth()+1));
alert("A hora atual é  " + data.getHours() + ":" + data.getMinutes() + " hs");



function soma(n1, n2) {
    return n1 + n2;
}
alert(soma(5, 10));



function setReplace(frase, nome, novo_nome) {
    return frase.replace(nome, novo_nome);
}
alert(setReplace("Vai Uberlândia", "Uberlândia", "Vasco"))



function validaIdade(idade) {
    var validar;
    if (idade >= 18) {
        validar = true
    } else {
        validar = false
    }
    return validar;
}
var idade = prompt("Qual a sua idade?");
console.log(validaIdade(idade));

*/


function clicou() {
    //alert("Obrigado por clicar");
    document.getElementById("agradecimento").innerHTML = "<b>Obrigado por clicar</b>";
}


function irParaOutraPagina() {
    window.open("https://digitalinnovation.one/sign-in");
}


function trocar(elemento) {
    //document.getElementById("mouse-move").innerHTML = "Obrigado por passar o mouse";
    elemento.innerHTML = "Obrigado por passar o mouse";
}


function voltar(elemento) {
    //document.getElementById("mouse-move").innerHTML = "Passe o mouse aqui!";
    elemento.innerHTML = "Passe o mouse aqui!";
}


function load() {
    alert("Página carregada!")
}


function funcaoChange(elemento) {
    console.log(elemento.value)
}