fun main() {
    val range = 1..10
    if (5 in range) {
        println("5 is in the range")
    } else {
        println("5 is not in the range")
    }

    val list = listOf(1, 2, 3, 4, 5)
    if (3 in list) {
        println("3 is in the list")
    } else {
        println("3 is not in the list")
    }

    for (i in 1..10) {
        println(i)
    }

    if (6 !in list) {
        println("6 is not in the list")
    }
}
