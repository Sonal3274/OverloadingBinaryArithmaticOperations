class Counter {
    var count = 0
    operator fun unaryPlus() = Counter().apply { count = this@Counter.count + 1 }
    operator fun unaryMinus() = Counter().apply { count = this@Counter.count - 1 }
    override fun toString() = "Counter(count=$count)"
}

fun main() {
    val counter = Counter()
    println(counter.count) // outputs 0
    println(+counter) // outputs 1
    println(counter.count) // outputs 0
    println(-counter) // outputs -1
    println(counter.count) // outputs 0
}
