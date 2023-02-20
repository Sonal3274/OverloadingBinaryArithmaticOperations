/*
Destructuring declarations in Kotlin allow you to break up an object into its individual components
and assign them to variables in one step.

This is particularly useful when working with collections or other complex objects,
as it can simplify your code and make it more readable.
*/
fun main() {
    val list = listOf("apple", "banana", "cherry")

    for ((index, value) in list.withIndex()) {
        println("$index -> $value")
    }

}
