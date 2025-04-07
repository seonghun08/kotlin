package sample.extend

interface SwimAble {

    val swimAbility: Int
        get() = 3

    // default 생략이 가능
    fun act() {
        println("swim")
    }
}