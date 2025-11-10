package javatokoltin

import javatokoltin.sample.JavaMoney
import javatokoltin.sample.KotlinMoney

/**
 * 단항 연산자: ++, --
 * 산술 연산자: +, -, *, /, %
 * 산술 대입 연산자: +=, -=, /=, %=
 * 논리 연산자: &&, ||, !
 * Kotlin은 Java와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo를 호출 해줍니다.
 */
fun main() {
    val m1 = JavaMoney(2_000L)
    val m2 = JavaMoney(1_000L)

    if (m1 > m2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    } else if (m1.compareTo(m2) == 0) {
        println("Money1이 Money2보다 금액이 동일합니다.")
    } else {
        println("Money1이 Money2보다 금액이 작습니다.")
    }

    val m3 = m1
    val m4 = JavaMoney(2000L)

    // Kotlin은 동일성에 ===를 사용, 동등성에 ==를 호출한다.
    // 즉, ==를 사용하면 간접적으로 equals를 호출해준다.
    // = 이 하나 더 붙으면 주소까지 같은 지 완전 비교하자라는 의미로 이해하면 좋다.
    println(m1 === m3)
    println(m2 === m3)
    println(m3 == m4) // @equals, @hashCode override

    // operator 함수를 사용하면 + 로 바꿔도 동일하게 적용된다.
    val km1 = KotlinMoney(1_000)
    val km2 = KotlinMoney(2_000)
    println(km1.plus(km2))
    println(km1 + km2)
}