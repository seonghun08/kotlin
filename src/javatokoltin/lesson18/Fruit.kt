package javatokoltin.lesson18

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
) {

    fun filter(
        fruit: List<Fruit>,
        filter: (Fruit) -> Boolean
    ): List<Fruit> = fruit.filter(filter)
}
