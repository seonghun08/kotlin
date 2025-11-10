fun main() {
    fun validateScoreIsNotNegative(score: Int) {
        // if (score < 0) {
        //     throw IllegalArgumentException(
        //         "${score}는 0보다 작을 수 없습니다.")
        // }
        if (score !in 0..100) {
            throw IllegalArgumentException(
                "${score}의 범위는 0부터 100입니다.")
        }
    }

    // Kotlin은 if-else를 expression으로 사용할 수 있기 때문에 삼항 연산자가 없다.
    // ex) Java: return score >= 50 ? "P" : "F";
    fun getPassOrFail(score: Int): String {
        return if (score >= 50) {
            "P"
        } else {
            "F"
        }
    }

    fun getGrade(score: Int): String {
        return if (score >= 90) {
            "A"
        } else if (score >= 80) {
            "B"
        } else if (score >= 70) {
            "C"
        } else {
            "D"
        }
    }

    // Kotlin은 Switch-Case 문 대신 when이 있다.
    fun getGradeWithSwitch(score: Int): String {
        // return when (score / 10) {
        //     9 -> "A"
        //     8 -> "B"
        //     7 -> "C"
        //     else -> "D"
        // }
        return when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "D"
        }
    }

    fun startsWithA(obj: Any): Boolean {
        return when (obj) {
            is String -> obj.startsWith("A")
            else -> false
        }
    }

    fun judgeNumber(number: Int) {
        when (number) {
            1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
            else -> println("1, 0, -1이 아닙니다.")
        }
    }

    fun judgeNumber2(number: Int) {
        when {
            number == 0 -> println("주어진 숫자는 0입니다.")
            number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
            else -> println("주어진 숫자는 홀수입니다.")
        }
    }
}