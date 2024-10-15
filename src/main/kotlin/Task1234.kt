/**
 * Task with ID 1234
 */
fun mainTask1234() {
    var oddCount = 0
    while (true) {
        val number = readlnOrNull()?.toIntOrNull() ?: break
        if (number == 0) break
        if (number % 2 != 0) {
            oddCount++
        }
    }
    println(oddCount)
}
