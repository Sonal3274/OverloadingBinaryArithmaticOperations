data class Vector(var x: Int, var y: Int) {
    operator fun plusAssign(other: Vector) {
        x += other.x
        y += other.y
    }

}

fun main() {
    var v1 = Vector(1, 2)
    var v2 = Vector(3, 4)

    v1 += v2
    println("v1 = $v1")

}
