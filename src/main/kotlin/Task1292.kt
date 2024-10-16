fun zemleryiki(N: Int): Pair<Int, Int> {
    var minTime = 0
    var zemleriiki = N
    while (zemleriiki > 1) {
        zemleriiki = (zemleriiki + 1) / 2
        minTime++
    }

    val maxTime = N - 1

    return Pair(minTime, maxTime)
}

fun main() {
    val N = readLine()!!.toInt()

    val (minTime, maxTime) = zemleryiki(N)
    println("$minTime $maxTime")
}