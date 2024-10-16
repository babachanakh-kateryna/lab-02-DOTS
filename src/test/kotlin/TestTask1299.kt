import org.junit.jupiter.api.Assertions
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test

/**
 * Tests for Task 1299
 */
class TestTask1299 {
    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1285
        mainTask1299()

        // Check the result
        Assertions.assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test01_Example1() {
        // Input data
        val input = "1 2"
        // Expected output
        val expectedOutput = "99"
        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Example2() {
        // Input data
        val input = "1 1"
        // Expected output
        val expectedOutput = "9"
        runTest(input, expectedOutput)
    }

    @Test
    fun test03_Example3() {
        // Input data
        val input = "2 4"
        // Expected output
        val expectedOutput = "9990"
        runTest(input, expectedOutput)
    }
}