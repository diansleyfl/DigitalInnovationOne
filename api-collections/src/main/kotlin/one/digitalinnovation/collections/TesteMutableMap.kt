package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("=======================")

    repositorio.findAll().forEach { print("$it \n\n")}

    println("=======================")

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { print("$it \n\n")}
}