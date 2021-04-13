package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(8, 2, 3, 4, 1, 10, 7, 6, 5, 9)

    values.forEach {
        println(it)
    }

    println("=====================")

    values.sort()
    values.forEach {
        println(it)
    }
}