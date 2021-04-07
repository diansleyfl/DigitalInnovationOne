package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Diansley"
    var cpf: String = "092.985.646-51"
}

fun main(){
    val diansley = Pessoa()

    println(diansley.nome)
    println(diansley.cpf)
}