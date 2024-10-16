import org.junit.jupiter.api.Assertions
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.Test

/**
 * Tests for Task 1292
 */
class TestTask1292 {
    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1292
        mainTask1292()

        // Check the result
        Assertions.assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test01_Example1() {
        // Input data
        val input = "2"
        // Expected output
        val expectedOutput = "1 1"
        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Example1() {
        // Input data
        val input = "5"
        // Expected output
        val expectedOutput = "2 3"
        runTest(input, expectedOutput)
    }


}