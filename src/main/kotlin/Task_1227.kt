package org.example

fun mainTask1227() {
    val n = readLine()?.toIntOrNull() ?: return

    for (d in (n / 2) downTo 1) {
        if (n % d == 0) {
            println(d)
            break
        }
    }
}