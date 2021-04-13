package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        print("$valor ")
    }
    println("\n" + "===============================")

    values.forEach {
        print("$it ")
    }
    println("\n" + "===============================")

    values.forEach {valor ->
        print("$valor ")
    }
    println("\n" + "===============================")

    for(index in values.indices) {
        print(values[index])
    }
    println("\n" + "===============================")

    values.sort()
    for(valor in values) {
        print("$valor ")
    }
    println("\n" + "===============================")




}