package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diansley"

    var cpf: String = "123.456.789-10"
    private set
}

fun main(){
    val diansley = Pessoa()

    println(diansley.nome)
    println(diansley.cpf)
}