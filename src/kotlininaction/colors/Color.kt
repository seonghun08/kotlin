package kotlininaction.colors

import kotlininaction.colors.Color.*

enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    val rgb: Int
        get() = (r * 256 + g) * 256 + b

    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(BLUE.rgb) // 255
    GREEN.printColor() // GREEN is 65280

    println(getMnemonic(BLUE)) // Battle
    // println(getWarmthFromSensor())
    println(getWarmthFromSensor2())
    println(mix(YELLOW, RED))
    // println(mix(BLUE, RED))
}

fun getMnemonic(color: Color): String =
    when (color) {
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun measureColor() = ORANGE
fun getWarmthFromSensor(): String {
    return when (val color = measureColor()) {
        RED, ORANGE, YELLOW -> "warm (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold (blue = ${color.b})"
    }
}

fun measureColor2() = ORANGE
fun getWarmthFromSensor2(): String {
    return when (val color = measureColor()) {
        RED, ORANGE, YELLOW ->
            "warm (red = ${color.r})"
        GREEN ->
            "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET ->
            "cold (blue = ${color.b})"
    }
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

// 인자 없이 사용
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) -> ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
        (c1 == BLUE && c2 == YELLOW) -> GREEN

        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE) -> INDIGO

        else -> throw Exception("Dirty color")
    }