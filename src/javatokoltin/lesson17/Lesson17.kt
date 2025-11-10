package javatokoltin.lesson17

class lesson17 {
}

/** Kotlin의 람다 사용법 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_100),
        Fruit("사과", 1_200),
        Fruit("포도", 1_500),
        Fruit("포도", 1_500),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다 함수 생성 방법
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple2 = { f: Fruit -> f.name == "사과" }

    // 람다를 호출하는 방법
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    val results = filterFruits(fruits, isApple)

    // 익명 함수기 때문에 바로 넣어줄 수도 있음
    // val results2 = filterFruits(fruits, { f: Fruit -> f.name == "사과" })

    // 들어가는 함수는 따로 빼서 가독성을 좋게 만들 수도 있음
    // val results2 = filterFruits(fruits) { f -> f.name == "사과" }

    // 파라미터가 하나인 경우 it 을 써서 더 줄일 수 있음
    val results2 = filterFruits(fruits) { it.name == "사과" }

    for (item in results) {
        println("name: ${item.name}, price: ${item.price}")
    }
}

/**
 * Java는 함수가 2급 시민이지만
 * Kotlin은 함수가 1급 시민이며, 변수처럼 파라미터에 넣을 수 있다.
 */
private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}