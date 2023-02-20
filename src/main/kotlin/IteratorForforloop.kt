class MyCollection<T>(private val data: List<T>) : Iterable<T> {
    override fun iterator(): Iterator<T> {
        return data.iterator()
    }
}

fun main() {
    val collection = MyCollection(listOf(1, 2, 3, 4, 5))

    for (item in collection) {
        println(item)
    }
}
