package one.digitalinnovation.introducaoprogramacaokotlin

/** Desafio
Você terá o desafio de escrever um programa
que leia um valor inteiro N (1 < N < 1000).
Este N é a quantidade de linhas de saída
que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido. **/

import java.util.Scanner

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)
    val linhas = entrada.nextInt()

    for (i in 1..linhas step 1) {
        val quadrado = (i * i)
        val cubo = (i * i * i)

        println("$i $quadrado $cubo")
    }
}