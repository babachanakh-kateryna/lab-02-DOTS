package org.example

/**
 * Task with ID 1201.
 */
fun main() {
    val n = readLine()?.toIntOrNull() ?: return

    repeat(n) {
        println("Hello!")
    }
}