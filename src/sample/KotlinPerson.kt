package sample

// Kotlin은 default class가 public 임으로 생략 가능하다.
class KotlinPerson(
    val name: String,
    var age: Int = 1 // age를 생략하고, default 값으로 생성할 수 있다.
) {
    // 검증 로직? 초기화된 시점에 할 수 있다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    // "var age: Int = 1" 위 필드에서 대체 가능
    // constructor(name: String) : this(name, 1)
}