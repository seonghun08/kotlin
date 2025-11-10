package javatokoltin.lesson15

fun main() {
    /** Array */
    val arr = arrayOf(100, 200)
    arr.plus(300)

    for (i in arr.indices) {
        println("$i ${arr[i]}")
    }
    for ((idx, value) in arr.withIndex()) {
        println("$idx $value")
    }

    /** List */
    val numbers = listOf(100, 200)
    // numbers.add() compile error
    // val emptyList = emptyList<Int>()

    println(numbers[0]) // 100

    for (number in numbers) {
        println(number)
    }
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    /** Mutable(가변) List */
    val mutableNumbers = mutableListOf(100, 200) // ArrayList 구현
    mutableNumbers.add(300)

    for (number in mutableNumbers) {
        println(number)
    }
    for ((idx, value) in mutableNumbers.withIndex()) {
        println("$idx $value")
    }

    /** Set */
    val setNumbers = setOf(100, 200)
    val mutableSetNumbers = mutableSetOf(100, 200) // LinkedHashSet 구현
    mutableSetNumbers.add(100)

    for (number in setNumbers) {
        println(number)
    }
    for ((idx, value) in setNumbers.withIndex()) {
        println("$idx $value")
    }

    /** Map */
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // val mapOf = mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }
    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}