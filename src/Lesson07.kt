import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

    fun parseIntOrThrow(
        str: String
    ): Int {
        return try {
            str.toInt() // 기본형 타입 변환은 toType()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(
                "주어진 ${str}(은)는 숫자가 아닙니다.")
        }
    }

    fun parseIntOrNull(
        str: String
    ): Int? {
        return try {
            str.toInt() // 기본형 타입 변환은 toType()
        } catch (e: NumberFormatException) {
            null
        }
    }

    // JavaFilePrinter -> KotlinFilePrinter
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/sample.txt")

        BufferedReader(FileReader(file))
            .forEachLine { println(it) }
    }

    // Kotlin은 try with resources 구문이 없다.
    // 대신 use 라는 inline 확장 함수를 사용해야 한다.
    fun readFile(
        path: String
    ) {
        BufferedReader(FileReader(path)).use { reader ->
            reader.forEachLine { println(it) }
        }
    }
}