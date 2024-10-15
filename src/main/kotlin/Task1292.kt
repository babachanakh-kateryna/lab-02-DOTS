import kotlin.math.ceil
import kotlin.math.log2

/**
 * Task with ID 1292
 */
fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    val maxTime = ceil(log2(n.toDouble())).toInt()

    var minTime = 0
    var remaining = n
    while (remaining > 1) {
        remaining /= 2
        minTime++
    }

    println("$minTime $maxTime")
}