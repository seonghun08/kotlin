package lesson13

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    // 기본적으로 바깥 클래스를 참조하지 않는다.
    // 바깥 클래스를 참조하고 싶다면 inner 키워드를 추가하여 사용한다.
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}