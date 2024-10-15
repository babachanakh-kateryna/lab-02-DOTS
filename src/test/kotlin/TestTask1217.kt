import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Tests for Task 1217.
 */
class TestTask1217 {

    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1217
        mainTask1217()

        // Check the result
        assertEquals(expectedOutput.replace("\r", ""), outputStream.toString().replace("\r", "").trim())
    }

    @Test
    fun test01_N3() {
        // input data
        val input = "3"

        // expected output
        val expectedOutput = """
            0 0 0
            0 0
            0
        """.trimIndent()

        runTest(input, expectedOutput)
    }

    @Test
    fun test02_N5() {
        // input data
        val input = "5"

        // expected output
        val expectedOutput = """
            0 0 0 0 0
            0 0 0 0
            0 0 0
            0 0
            0
        """.trimIndent()

        runTest(input, expectedOutput)
    }

    @Test
    fun test03_N1() {
        // input data
        val input = "1"

        // expected output
        val expectedOutput = """
            0
        """.trimIndent()

        runTest(input, expectedOutput)
    }
}
