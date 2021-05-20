/* Conversão Simples de Base
Neste problema você é solicitado a escrever um simples programa de conversão de base.
A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada.
Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa.
O valor hexadecimal inicia sempre com “0x” ou também,
é aquele valor cuja segunda casa contém a letra 'x'.

Entrada
A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última,
contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231.
A última linha contém um número negativo que não deve ser processado,
indicando o encerramento do programa.

Saída
Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída.
Número hexadecimal deve ser precedido na saída por '0x' (zero xis).
 */

package one.digitalinnovation.praticandoprogramacaoemkotlin

fun main(args: Array<String>) {

    val patternHexadecimal = """0x.*""".toRegex()
    val patternHex = """[a-zA-Z].*""".toRegex()
    val totalList = mutableListOf<String>()
    var value = true

    while(value) {
        val numeroDigitado = readLine()!!.toString()


        //Se o número for decimal
        if (!numeroDigitado.contains(patternHexadecimal)
            && numeroDigitado.toInt() > 0
            && numeroDigitado.toInt() < Integer.MAX_VALUE) {

                val n = numeroDigitado.toInt()
                val decimal = Integer.toHexString(n).toUpperCase()
                val fullDecimal = "0x$decimal"

            totalList.add(fullDecimal)
        }

        if(numeroDigitado == "-1") {
            value = false
        }


        //Se o número for hexadecimal
        if (numeroDigitado.contains(patternHexadecimal)
            && numeroDigitado.contains(patternHex)) {
                val remove = numeroDigitado.removeRange(0,2)
                val result: Int = remove.toInt(16)
                totalList.add(result.toString())
        }
    }

    for (i in totalList){
        println(i)
    }
}