package sample

fun main() {
    val derived = Derived(10)
    println(derived.num)
}

open class Base(
    open val num: Int = 100 // override 를 하기 위해선 open 을 사용하여 열어줘야 한다. (없을 경우 final)
) {
    init {
        println("Base Class")
        // 하위 클래스에서 override 하고 있는 프로퍼티에 접근하면 안된다.
        // 만약 하위 클래스에서 접근할 경우, 상위 클래스의 init 이 먼저 호출되기 때문에 기본값인 0이 호출된다.
        // 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open 을 피해야 한다.
        println(num)
    }
}

class Derived(
    override val num: Int
) : Base(num) {
    init {
        println("Derived Class")
    }
}

