import Lesson01.Person

fun main() {

    /**
     * 모든 변수는 var & val을 붙여 주어야 한다.
     * var: 변경 가능하다.
     * val: 변경 불가능하다. (Java의 final과 같은 read-only)
     * Kotlin 은 타입을 명시하지 않아도 타입을 추론한다.
     * Primitive Type 과 Reference Type을 구분하지 않아도 된다.
     * 객체 인스턴스화 할 때 new를 붙이지 않아야 한다.
     */
    var num1 = 10L
    val num2 = 10L // final

    var num3: Long = 1_000L
    val person = Person("hun")

    // Kotlin null 사용을 위해서는 타입 뒤 "?" 붙어주어야 한다.
    var numNull: Long? = 1_000L
    numNull = null
}