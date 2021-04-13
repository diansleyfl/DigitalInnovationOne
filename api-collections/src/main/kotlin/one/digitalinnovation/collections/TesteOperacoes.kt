package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4300.0, 2000.00)

    for (salario in salarios) {
        println(salario)
    }

    println("==========================")

    salarios.sort()
    for (salario in salarios) {
        println(salario)
    }

    println("==========================")

    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    println("==========================")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it)}
}