import kotlin.reflect.KProperty

class Example1 {
    var prop: String by Delegate1()

    override fun toString(): String {
        return "Example(prop=$prop)"
    }
}

class Delegate1 {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef has delegated property '${property.name}'"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef has set the value of delegated property '${property.name}' to '$value'")
    }
}

fun main() {
    val e = Example1()
    println(e)

    e.prop = "new value"
    println(e.prop)
}
