import kotlin.math.floor
import kotlin.math.log2

/*
Task with ID 1292
 */
fun mainTask1292() {
    val n = readLine()!!.toInt()
    println("${minTime(n)} ${maxTime(n)}")
}

fun maxTime(n: Int): Int {
    return (n + 1) / 2
}

fun minTime(n: Int): Int {
    return floor(log2(n.toDouble() + 1)).toInt()
}
