package javatokoltin.lesson20

import javatokoltin.lesson19.Person

class Lesson20 {
}

fun main() {

}

fun printPerson(person: Person) {
    person.let {
        println(it.name)
        println(it.age)
    }
}
