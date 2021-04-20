/**
 * A fórmula para calcular a área de uma circunferência é:
 * area = π . raio2.
 * Considerando para este problema que π = 3.14159:
 *
 * - Efetue o cálculo da área, elevando o valor de raio
 * ao quadrado e multiplicando por π.
 *
 * Entrada
 * A entrada contém um valor de ponto flutuante (dupla precisão),
 * no caso, a variável raio.
 *
 * Saída
 * Apresentar a mensagem "A=" seguido pelo valor da variável area,
 * conforme exemplo abaixo, com 4 casas após o ponto decimal.
 * Utilize variáveis de dupla precisão (double).
 * Como todos os problemas, não esqueça de imprimir
 * o fim de linha após o resultado, caso contrário,
 * você receberá "Presentation Error".
 *
 * Exemplos de Entrada
 * 2.00
 * A=12.5664
 * 100.64
 *
 * Exemplos de Saída
 * A=31819.3103
 * 150.00
 * A=70685.7750
 */

package one.digitalinnovation.solucionandoproblemasemkotlin

import kotlin.math.pow

fun Double.format(digits: Int) = "%.${digits}f"
    .format(this)
    .replace(',', '.')

fun main(args: Array<String>) {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * raio.pow(2)

    println("A=${area.format(4)}")

}