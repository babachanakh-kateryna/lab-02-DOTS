import java.math.BigInteger

fun countNumbers(M: Int, N: Int): BigInteger {
    val lower = BigInteger.TEN.pow(M - 1)  // 10^(M-1)
    val upper = BigInteger.TEN.pow(N)      // 10^N
    return upper - lower
}

fun main() {
    val inputs = mutableListOf<Int>()
    while (inputs.size < 2) {
        val input = readLine()!!.trim()
        if (input.contains(" ")) {
            inputs.addAll(input.split(" ").map { it.toInt() })
        } else {
            inputs.add(input.toInt())
        }
    }

    val (M, N) = inputs
    println(countNumbers(M, N))
}