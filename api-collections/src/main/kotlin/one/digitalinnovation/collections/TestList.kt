package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println("$it"+"\n")}

    println("==========================")
    println(funcionarios.find {it.nome == "Maria"})

    println("==========================")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println("$it"+"\n")}

    println("==========================")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println("$it"+"\n")}

    println("==========================")

}



data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String = """
        Nome:       $nome
        Salário:    $salario
    """.trimIndent()
}