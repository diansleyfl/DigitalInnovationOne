package one.digitalinnovation.introducaoprogramacaokotlin

import java.util.Scanner

fun main(args: Array<String>) {

    val entrada = Scanner(System.`in`)
    val numero = entrada.nextInt()

    for (i in 1..numero step 2) {
        println(i)
    }

}