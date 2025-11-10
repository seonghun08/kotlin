package kotlininaction

class Main {
}

fun main() {
//    println("Hello world!")
//    println(max(1, 2))

//    val input = readln()
//    val name = if (input.isNotBlank()) input else "Kotlin"
//    // val name = input.ifBlank { "Kotlin" }
//    println("Hello $name!")

    val rectangle = Rectangle(100, 100)
    println(rectangle.isSquare) // true
}

//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}
fun max(a: Int, b: Int): Int = if (a > b) a else b

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() = height == width
}
