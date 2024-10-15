package org.example

/**
 * Task with ID 1201.
 */
fun mainTask1201() {
    val n = readLine()?.toIntOrNull() ?: return

    repeat(n) {
        println("Hello!")
    }
}