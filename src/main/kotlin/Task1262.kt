/**
 * Task with ID 1262
 */
fun mainTask1262() {
    val n = readLine()?.toIntOrNull() ?: return

    for (i in 0 until n) {
        print(" ".repeat((n - i - 1) * 2))
        println("1 ".repeat(2 * i + 1).trim())
    }
}
