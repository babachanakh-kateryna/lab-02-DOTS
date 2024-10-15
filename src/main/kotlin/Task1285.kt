/**
 * Task with ID 1285
 */
fun mainTask1285() {
    var x = 0
    var y = 0
    var direction = 0 // 0 - north, 1 - east, 2 - south, 3 - west

    while (true) {
        val action = readlnOrNull()?.toIntOrNull() ?: break

        when (action) {
            0 -> {
                when (direction) {
                    0 -> y++ // north
                    1 -> x++ // east
                    2 -> y-- // south
                    3 -> x-- // west
                }
            }
            1 -> direction = (direction + 1) % 4 // turn right 
            -1 -> direction = (direction + 3) % 4 // turn left 
        }
    }

    println("$x $y")
}
