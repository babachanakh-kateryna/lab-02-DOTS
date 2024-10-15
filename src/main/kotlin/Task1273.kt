/**
 * Task with ID 1273
 */
fun mainTask1273() {
    val n = readLine()?.toIntOrNull() ?: return

    var result = 1
    var countTwos = 0
    var countFives = 0

    for (i in 2..n) {
        var num = i

        while (num % 2 == 0) {
            countTwos++
            num /= 2
        }
        while (num % 5 == 0) {
            countFives++
            num /= 5
        }

        result = (result * num) % 10
    }

    for (i in 0 until countTwos - countFives) {
        result = (result * 2) % 10
    }

    if (result == 0) println(1) else println(result)
}
