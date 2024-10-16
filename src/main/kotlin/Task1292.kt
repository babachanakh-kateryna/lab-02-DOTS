fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    var minTime = 0
    var maxTime = 0
    var remaining = n

    while (remaining > 1) {
        minTime++
        remaining /= 2
    }

    remaining = n
    while (remaining > 0) {
        maxTime++
        remaining -= maxTime
    }

    println("$minTime $maxTime")
}
