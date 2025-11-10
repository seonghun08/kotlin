package javatokoltin.lesson19

import javatokoltin.lesson18.Fruit

class Lesson19 {
}

typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits(
    fruits: List<Fruit>,
    filter: FruitFilter
) {
    //...
}

typealias USGMap = Map<String, UltraSuperGuardianTribe>
data class UltraSuperGuardianTribe(
    val name: String
)

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val person = Person("kotlin", 100)
    val (name, age) = person
    println("이름: $name, 나이: $age")
}