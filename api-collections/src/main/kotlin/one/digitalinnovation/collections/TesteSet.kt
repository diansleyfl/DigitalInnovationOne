package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //UNIÃO DE LISTAS
    val resulUnion = funcionarios1.union(funcionarios2)
    resulUnion.forEach { println("$it \n") }

    println("==========================")

    //SUBTRAÇÃO DE LISTAS
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtratic = funcionarios3.subtract(funcionarios2)
    resultSubtratic.forEach { println("$it \n") }

    println("==========================")

    //INTERCEÇÃO DE LISTAS
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println("$it \n") }

}