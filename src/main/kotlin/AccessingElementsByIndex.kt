fun main() {
    // create an array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // access an element by index using get() method
    val element = numbers.get(2)  // access element at index 2
    println("Element at index 2: $element")  // prints "Element at index 2: 3"

    // modify an element by index using set() method
    numbers.set(3, 6)  // set the value of element at index 3 to 6
    println("Modified array: ${numbers.contentToString()}") // prints "Modified array: [1, 2, 3, 6, 5]"
}
