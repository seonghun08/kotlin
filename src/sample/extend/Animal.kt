package sample.extend

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 프로퍼티를 override 할 때 open 을 붙여야 한다.
) {
    abstract fun move()
}