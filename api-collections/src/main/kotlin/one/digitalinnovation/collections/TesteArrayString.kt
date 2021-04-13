package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Tereza"
    nomes[1] = "Maria"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("============")

    nomes.sort()
    nomes.forEach { println(it) }

    println("============")

    val carros = arrayOf("Fusca", "Chevete", "Monza", "Gol")
    carros.sort()
    carros.forEach { println(it) }

}