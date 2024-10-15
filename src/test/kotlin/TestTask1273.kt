
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Tests for Task 1273
 */
class TestTask1273 {
    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1227
        mainTask1273()

        // Check the result
        Assertions.assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test01_Factorial_5() {
        val input = "5"
        val expectedOutput = "2"

        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Factorial_10() {
        val input = "10"
        val expectedOutput = "8"

        runTest(input, expectedOutput)
    }

    @Test
    fun test03_Factorial_100() {
        val input = "100"
        val expectedOutput = "4"

        runTest(input, expectedOutput)
    }

}