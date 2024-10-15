package org.example

fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    for (i in 1..n) {
        println("0 ".repeat(i).trim())
    }
}