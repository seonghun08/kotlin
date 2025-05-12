package lesson11

fun isDirectoryPath(path: String): Boolean =
    path.endsWith("/")

fun isNotEquals(
    s1: String,
    s2: String
): Boolean {
    return s1 != s2
}