class ComplexNumber(var real: Double, var imag: Double) {

    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real + other.real, imag + other.imag)
    }

}

fun main() {
    val c1 = ComplexNumber(3.0, 4.0)
    val c2 = ComplexNumber(1.0, 2.0)
    val result = c1 + c2
    println("${c1.real} + ${c2.imag}i + ${c2.real} + ${c2.imag}i = ${result.real} + ${result.imag}i")
}
