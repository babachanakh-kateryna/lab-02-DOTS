import java.math.BigInteger

/**
 * Task with ID 1299
 */
fun countNumbers(M: Int, N: Int): BigInteger {
    if (M > N) return BigInteger.ZERO

    val lower = BigInteger.TEN.pow(M - 1)  // 10^(M-1)
    val upper = BigInteger.TEN.pow(N) // 10^N
    return upper.subtract(lower)
}
fun mainTask1299() {
    val input = readLine()!!
    val (M, N) = input.split(" ").map { it.toInt() }
    println(countNumbers(M, N))
}