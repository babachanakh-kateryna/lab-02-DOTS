/**
 * Task with ID 1262
 */
fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    for (i in 1..n) {
        print(" ".repeat(n - i))
        println("1 ".repeat(i).trim())
    }
}
