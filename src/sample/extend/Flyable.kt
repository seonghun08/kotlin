package sample.extend

interface Flyable {

    fun fly()

    // default 생략이 가능
    fun act() {
        println("fly")
    }
}