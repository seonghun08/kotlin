package javatokoltin

import javatokoltin.sample.KotlinPerson


fun main() {
    val num1 = 3
    val num2 = 3L
    println(num1 + num2) // num1이 long 타입으로 자동 변환

    val num3 = 5
    println(num1 / num3) // int 타입끼리 연산 시: 0
    println(num1 / num3.toDouble()) // 하나라도 double 타입인 경우 double 연산: 0.6

    val num4: Int? = 3
    // val num5: Long = num4.toLong() 컴파일 오류
    val num5: Long = num4?.toLong() ?: 0

    val print = print(KotlinPerson("hun", 20))
    println(print)

    val name = "hun"
    val trimIndent = """
        A: 10,
        B: 90,
        C: ${name},
    """.trimIndent()
    println(trimIndent)

    // String indexing
    // Java의 경우 문자열의 특정 문자를 가져오기 위해선 다음과 같이 사용한다.
    // String str = "ABC";
    // char ch = str.charAt(1);
    val str = "ABC"
    val ch = str[1] // B
    println(ch)
}

/**
 * Java: Object <=> Kotlin: Any
 * Java의 Primitive(ex int, byte, ..) Type은 최상위 객체가 Object가 아님
 * Kotlin은 Java와 다르게 모든 Primitive Type의 최상의 타입도 Any이다.
 */
fun printAgeIfPerson(o: Any) {
    // Java: instanceof <=> Kotlin: is
    if (o is KotlinPerson) {
        // Java: (Person) o <=> Kotlin: o as Person
        // Kotlin은 타입을 추론하기 때문에 캐스팅을 하지 않아도 된다. (스마트 캐스트)
        // val person = o as Person
        val person = o
        println(person.age)
    }
}

/**
 * is: 객체가 특정 타입인지 확인, 반환 값 Boolean
 * as: 객체를 특정 타입으로 변환, 타입 변환이 실패하면 예외를 발생
 *     단, as? 일 경우 null 반환
 * is는 타입을 검사, as는 타입을 변환한다.
 */
fun printAgeIfPersonNull(o: Any?) {
//    val person = o as? Person
    val person = o as? KotlinPerson
    println(person?.age)
}

fun printAgeIsNotPerson(o: Any): Boolean {
    // Java: !(o instanceof Person(_, _));
    return o !is KotlinPerson
}

// String interpolation
fun print(o: Any?): String? {
    if (o is KotlinPerson) {
        // return "사람의 이름은 ${o.name}이고 나이는 ${o.age}세 입니다."
        return "사람의 이름은 ${o.name}이고 나이는 ${o.age}세 입니다."
    }
    // if (o is Person) {
    //     val name = o.name
    //     val age = o.age
    //     return "사람의 이름은 $name 이고 나이는 $age 세 입니다."
    // }
    return null
}