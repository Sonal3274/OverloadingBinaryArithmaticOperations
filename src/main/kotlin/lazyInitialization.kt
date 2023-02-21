class MyHeavyClass {
    init {
        println("MyHeavyClass instance created")
    }
}

class MyClass {
    val myHeavyObject: MyHeavyClass by lazy {
        println("Initializing myHeavyObject")
        MyHeavyClass()
    }
}

fun main() {
    val myClass = MyClass()
    println("Before accessing myHeavyObject")
    myClass.myHeavyObject
    println("After accessing myHeavyObject")
    myClass.myHeavyObject
}
