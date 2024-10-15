package org.example

fun main() {
    val n = readLine()?.toLongOrNull() ?: return
    if (n <= 1) {
        println(n)
        return
    }

    var largestDivisor = 1L

    for (i in n / 2 downTo 1) {
        if ((n % i).toInt() == 0) {
            largestDivisor = i
            break
        }
    }
    println(largestDivisor)
}
