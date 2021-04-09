package one.digitalinnovation.introducaoprogramacaokotlin

/** Desafio
Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X,
inclusive X, se for o caso. **/

import java.util.Scanner

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)
    val numero = entrada.nextInt()

    for (i in 1..numero step 2) {
        println(i)
    }

}