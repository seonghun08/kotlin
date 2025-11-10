package javatokoltin.lesson14

fun main() {

}

fun handleCountry(county: Country) {
    when (county) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}