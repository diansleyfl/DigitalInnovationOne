package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diansley"

    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInfo() = "$nome CPF: $cpf"
}

fun main(){
    val diansley = Pessoa()

    println(diansley.pessoaInfo())
}