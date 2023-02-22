import kotlin.reflect.KProperty

class Sample {
    val props = mutableMapOf<String, String>()

    var prop1: String by ActualDelegates.property()
    var prop2: Int by ActualDelegates.property()

    override fun toString(): String {
        return "Example(props=$props)"
    }
}

class ActualDelegates {
    companion object {
        fun <T> property() = PropertyDelegate<T>()
    }
}

class PropertyDelegate<T> {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        @Suppress("UNCHECKED_CAST")
        return (thisRef as Sample).props[property.name] as T
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        (thisRef as Sample).props[property.name] = value.toString()
    }
}

fun main() {
    val e = Sample()

    e.prop1 = "Hello"
    e.prop2 = 42

    println(e)
}
