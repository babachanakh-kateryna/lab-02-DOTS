/**
 * Task with ID 1292
 */
fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    val minTime = n.toString(2).length - 1
    val maxTime = n - Integer.bitCount(n)

    println("$minTime $maxTime")
}