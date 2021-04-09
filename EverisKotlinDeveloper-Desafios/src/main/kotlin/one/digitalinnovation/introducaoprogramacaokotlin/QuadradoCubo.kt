package one.digitalinnovation.introducaoprogramacaokotlin

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