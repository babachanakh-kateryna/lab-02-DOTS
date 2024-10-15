/**
 * Task with ID 1263
 */
fun mainTask1263() {
    val n = readlnOrNull()?.toIntOrNull() ?: return

    for (i in 0 until n) {
        print("  ".repeat(n - i - 1))

        if (i == 0) {
            println("*")
        } else if (i == n - 1) {
            println("* ".repeat(2 * n - 1).trim()) // last row
        } else {
            print("*")  // left
            print(" $".repeat(2 * i - 1))  // $
            println(" *")  // right
        }
    }
}
