package kotlininaction

import java.util.TreeMap
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.iterator

class IteratingOverMaps {
}

fun main() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = c.code.toString(radix = 2)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

     val list = listOf("10", "11", "1001")
     for ((index, element) in list.withIndex()) {
         println("$index: $element")
     }
}
