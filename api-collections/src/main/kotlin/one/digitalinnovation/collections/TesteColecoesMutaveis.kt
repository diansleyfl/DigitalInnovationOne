package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println("$it \n") }

    println("=======================")

    funcionarios.add(pedro)
    funcionarios.forEach { println("$it \n") }

    println("=======================")

    funcionarios.remove(joao)
    funcionarios.forEach { println("$it \n") }

    println("=======================")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println("$it \n") }
    println("=======================")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println("$it \n") }

    println("=======================")
    funcionariosSet.remove(pedro)
    funcionariosSet.forEach { println("$it \n") }
}