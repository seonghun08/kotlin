import sample.Person

/**
 * Kotlin Null 다루는 방법
 */
fun main() {
    val s1 = "Aaa"
    val s2 = "Baa"

    println(startsWithA1(s1))
    println(startsWithA1(s2))
    println(startsWithA2(s1))
    println(startsWithA2(s2))
    println(startsWithA3(s1))
    println(startsWithA3(s2))

    val s3: String? = "ABC"
    // println(s3.length) null이 가능한 경우 null 반환될 수 있도록 명시해야한다.
    println(s3?.length) // Save Call

    val s4: String? = null
    // null 반환될 경우 null 대신 값을 치환할 수 있다.
    println(s4?.length ?: 0) // Elvis 연산자 ?:

    println(startsWithNotNullA(s3))
    println(startsWithNotNullA(null)) // NPE 발생

    // Kotlin은 Java의 Annotation을 이해한다.
    // @Nullable 일 경우 컴파일 오류가 발생하는 것을 볼 수 있다.
    val person = Person("hun")
    startWithA(person.name())
}

// null이 들어올 수 있도록 타입 뒤 ?를 붙인다.
fun startsWithA1(s: String?): Boolean {
    // if (s == null) {
    //     throw IllegalArgumentException("null")
    // }
    // return s.startsWith("A")
    return s?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA1Kotlin(s: String?): Boolean = s?.startsWith("A")
    ?: throw IllegalArgumentException("null")

fun startsWithA2(s: String?): Boolean? {
    // if (s == null) {
    //     return null
    // }
    // return s.startsWith("A")
    return s?.startsWith("A")
}

fun startsWithA3(s: String?): Boolean {
    // if (s == null) {
    //     return false;
    // }
    // return s.startsWith("A");
    return s?.startsWith("A") ?: false
}

/**
 * 파리미터에 null이 들어올 수 있다고 해도 실제 값은 null이 들어오지 않은 경우
 * 아래와 같이 !!를 명시해주면 된다.
 * 단, null이 들어올 경우 NPE가 발생되기 때문에 정말 확실한 경우에 만 사용해야한다.
 */
fun startsWithNotNullA(s: String?): Boolean {
    return s!!.startsWith("A")
}

fun startWithA(s: String): Boolean {
    return s.startsWith("A")
}
