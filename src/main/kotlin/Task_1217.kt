package org.example

fun mainTask1217() {
    val n = readLine()?.toIntOrNull() ?: return

    for (i in n downTo 1) {
        println("0 ".repeat(i).trim())
    }
}