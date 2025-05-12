package lesson12

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }
        override fun fly() {
            println("fly")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}