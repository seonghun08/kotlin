package javatokoltin

fun main() {
    repeat("Hello world")
    repeat("Hello world", 3, true)

    // 이름 있는 argument (parameter)
    // 특정 default parameter를 쓰고, 다른 parameter는 바꾸고 싶을 때 사용한다.
    repeat("Hello world", 3, false)
    repeat("Hello world", useNewLine = false)

    // named argument
    // builder를 직접 만들지 않고 builder의 장점을 가질 수 있다.
    printNameAndGender(
        name = "hun",
        gender = "남성"
    )

    // Java 함수를 가져다 쓸 때는 named argument를 쓸 수 없다.
    // JavaToKoltin.Lesson08().JavaToKoltin.repeat(s = "hello") compile error
    Lesson08().repeat("hello")

    // Kotlin 가변인자 사용법 (vararg var: Type)
    printAll("A", "B", "C")

    val arr = arrayOf("A", "B", "C")
    // JavaToKoltin.printAll(arr) compile error
    // Kotlin은 배열을 가변인자에 넣을 때 * 를 붙여줘야 한다.
    // spread 연산자를 통해 배열 안에 있는 값을 마치 , 를 쓰는 것처럼 꺼내준다.
     printAll(*arr)
}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a
    else b
}

// Kotlin은 if 문이 Expression 이기 때문에 = 으로 변환 가능하다.
// 또한 값이 추론되기 때문에 함수 뒤 ": Int"를 생략할 수 있다.
fun max2(a: Int, b: Int) = if (a > b) a else b

fun max3(a: Int, b: Int) =
    when {
        a > b -> a
        else -> b
    }


fun repeat(
    s: String,
    n: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..n) {
        when (useNewLine) {
            true -> println(s)
            else -> print(s)
        }
    }
}

fun printNameAndGender(
    name: String,
    gender: String
) {
    println(name)
    println(gender)
}

// Java: method(String... strings)
// Kotlin: fun(vararg strings: String)
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}