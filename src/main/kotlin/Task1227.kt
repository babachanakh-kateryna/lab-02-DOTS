import kotlin.math.sqrt
/**
 * Task with ID 1227
 */
fun mainTask1227() {
    val input = readlnOrNull()?.toIntOrNull() ?: return

    var i = 2
    var dmax: Int? = null
    val d = sqrt(input.toDouble()).toInt() + 2

    while (i < d) {
        if (input % i == 0) {
            dmax = input / i
            break
        }
        i += 1
    }

    if (dmax != null) {
        println(dmax)
    } else {
        println(1)
    }
}
