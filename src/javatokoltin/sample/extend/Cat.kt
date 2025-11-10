package javatokoltin.sample.extend

class Cat(
    species: String
) : Animal(species, 4) { // extends 대신 " : " 사용하여 상속한다.
    override fun move() {
        println("고양이가 걸어다닙니다.")
    }
}