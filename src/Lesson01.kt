import Lesson01.Person

fun main() {

    var num1 = 10L
    val num2 = 10L // final

    var num3: Long = 1_000L
    val person = Person("hun")

    // Kotlin null 사용을 위해서는 타입 뒤 "?" 붙어주어야 한다.
    var numNull: Long? = 1_000L
    numNull = null
}