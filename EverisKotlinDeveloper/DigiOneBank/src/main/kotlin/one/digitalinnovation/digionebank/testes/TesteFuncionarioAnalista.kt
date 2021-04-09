package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val jether = Analista(
        nome="Jether Rodrigues",
        cpf = "999.999.999-99",
        salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(jether)
}