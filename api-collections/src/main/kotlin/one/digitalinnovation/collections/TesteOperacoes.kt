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
    //Refatorando código anterior, que está depreciado
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("==========================")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it)}

    println("==========================")

    //Contar quantos salários estão entre a faixa de 2000 e 5000
    println(salarios.count {it in 2000.0..5000.0})

    println("==========================")

    //Verificar se existe algum salário igual ao informado e retorna ele
    println(salarios.find {it == 2250.0})
    println(salarios.find {it == 500.0})

    println("==========================")

    //Verificar se existe algum salário igual ao informado e retorna boolean
    println(salarios.any {it == 2250.0})
    println(salarios.any {it == 500.0})

}