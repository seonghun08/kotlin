package javatokoltin.sample

// Kotlin은 default class가 public 임으로 생략 가능하다.
class KotlinPerson(
    // val name: String,
    name: String,
    var age: Int = 1 // age를 생략하고, default 값으로 생성할 수 있다.
) {
    var name: String = name
        get() = field.uppercase() // backing field
        set(value) {
            field = value.uppercase()
        }

    // fun getUppercaseName(): String = name.uppercase()
    val uppercaseName: String
        get() = name.uppercase()

    // 검증 로직? 초기화된 시점에 할 수 있다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // "var age: Int = 1" 위 필드에서 대체 가능
    // constructor(name: String) : this(name, 1)

    // fun isAdult(): Boolean {
    //     return age >= 20
    // }

    // Custom getter
    // 객체의 속성이라면, custom getter 추천, 그렇지 않다면 함수(fun isAdult()...)
    val isAdult: Boolean
        get() = age >= 20

    // val isAdult: Boolean
    //     get() {
    //         return age >= 20
    //     }
}