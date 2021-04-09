package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val diansley = Pessoa(nome = "Diansley Fernandes", cpf = "123.456.789-10")
    println(diansley.nome)
    println(diansley.cpf)

    val jether = Funcionario(nome="Jether Rodrigues", cpf = "999.999.999-99", salario = BigDecimal.valueOf(2000.00))
    println(jether.nome)
    println(jether.cpf)
    println(jether.salario)
}