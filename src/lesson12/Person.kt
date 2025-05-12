package lesson12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor (
    var name: String,
    var age: Int
) {
    // 동행 객체 (kotlin 은 static 이 존재 하지 않음)
    companion object Factory : Log {
        // const 를 붙이면 컴파일 시에 변수 할당 (상수)
        // const 를 안 붙이면 런타임 시에 변수 할당
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("log...")
        }
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

// 싱글톤 생성 시 object 만 붙이면 된다.
object Singleton {
    var a: Int = 0
}