package org.example

import kotlin.math.sqrt

fun main() {
    val n = readLine()?.toIntOrNull() ?: return
    val sqrtN = sqrt(n.toDouble()).toInt()

    for (d in sqrtN downTo 1) {
        if (n % d == 0) {
            if (d != n) {
                println(n / d)
            } else {
                println(d)
            }
            return
        }
    }
}
