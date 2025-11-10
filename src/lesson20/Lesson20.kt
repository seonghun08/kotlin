package lesson20

import lesson19.Person

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
