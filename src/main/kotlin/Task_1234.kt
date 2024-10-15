package org.example

fun mainTask1234() {
    var oddCount = 0
    while (true) {
        val number = readLine()?.toIntOrNull() ?: break
        if (number == 0) break
        if (number % 2 != 0) {
            oddCount++
        }
    }
    println(oddCount)
}
