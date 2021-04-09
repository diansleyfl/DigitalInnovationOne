package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val marcos = Gerente(
        nome="Marcos Alexandre",
        cpf = "111.111.111-11",
        salario = 5000.00,
        senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(marcos)

    TesteAutenticacao().autentica(marcos)
}