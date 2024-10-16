
import java.math.BigInteger

fun countNumbers(M: Int, N: Int): BigInteger {
    val lower = BigInteger.TEN.pow(M - 1)  // 10^(M-1)
    val upper = BigInteger.TEN.pow(N)      // 10^N
    return upper.subtract(lower)
}

fun main() {
    val input = readLine()!!
    val (M, N) = input.split(" ").map { it.toInt() }
    println(countNumbers(M, N))
}
