/**
 * Task with ID 1217
 */
fun mainTask1217() {
    val n = readlnOrNull()?.toIntOrNull() ?: return

    for (i in n downTo 1) {
        println("0 ".repeat(i).trim())
    }
}