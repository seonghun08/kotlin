package javatokoltin.sample.extend

class Penguin(
    species: String,
) : Animal(species, 2), SwimAble, Flyable {

    private val wingCount: Int = 2

    // override val swimAbility: Int
    //     get() = 5

    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        // 중복되는 인터페이스를 특정할 때 super<TYPE>.함수 사용
        super<SwimAble>.act()
        super<Flyable>.act()
    }

    override fun fly() {
        // fly
    }
}