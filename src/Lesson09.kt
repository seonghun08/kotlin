import sample.KotlinPerson

fun main() {
    val person = KotlinPerson("hun")
    personToString(person)
    person.age = 10
    personToString(person)


}

fun personToString(person: KotlinPerson) =
    println("name: ${person.name}, age: ${person.age}")
