import org.junit.jupiter.api.Assertions
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test

/**
 * Tests for Task 1285
 */
class TestTask1285 {
    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1285
        mainTask1285()

        // Check the result
        Assertions.assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test01_Example1() {
        // Input data
        val input = "0\n0\n0\n0\n1\n0\n"
        // Expected output
        val expectedOutput = "1 4"
        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Example2() {
        // Input data
        val input = "1\n0\n-1\n0\n1\n0\n-1\n0\n1\n"
        // Expected output
        val expectedOutput = "2 2"
        runTest(input, expectedOutput)
    }

    @Test
    fun test03_Example3() {
        // Input data
        val input = "1\n-1\n1\n1\n-1\n"
        // Expected output
        val expectedOutput = "0 0"
        runTest(input, expectedOutput)
    }
}