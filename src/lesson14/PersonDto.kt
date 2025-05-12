package lesson14

fun main() {
    val d1 = PersonDto("전성훈", 10)
    val d2 = PersonDto("전성훈", 10)
    println(d1 == d2) // true, equals() & hashCode()
    println(d1) // toString()
}

// kotlin 에서 dto 같은 클래스를 구현할 때 data 를 붙이면 동일한 기능을 사용할 수 있다.
data class PersonDto(
    private val name: String,
    private val age: Int
)