fun main() {

    // 1. 향상된 for 문
    val numbers: List<Long> = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    // 2. for 문
    for (i in 1..3) {
        println(i)
    }

    // 3. 내려가는 for 문
    for (i in 3 downTo 1) {
        println(i)
    }

    // 4. 2칸씩 올라가는 경우
    for (i in 1..5 step 2) {
        println(i)
    }

    // 5. while
    // Java의 do-while과도 문법이 동일하다.
    var i = 1;
    while (i <= 3) {
        println(i)
        i++
    }
}