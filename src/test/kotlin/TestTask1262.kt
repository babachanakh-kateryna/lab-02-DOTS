import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.*

/**
 * Tests for Task 1262.
 */
class TestTask1262 {
    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1262
        mainTask1262()

        // Check the result, replacing line separators and trimming whitespace
        Assertions.assertEquals(
            expectedOutput.replace("\r\n", "\n").trim(),
            outputStream.toString().replace("\r\n", "\n").trim()
        )
    }

    @Test
    fun test01_Triangle_N7() {
        //  Input data
        val input = "7"
        // Expected output
        val expectedOutput = """
           1
                     1 1 1
                   1 1 1 1 1
                 1 1 1 1 1 1 1
               1 1 1 1 1 1 1 1 1
             1 1 1 1 1 1 1 1 1 1 1
           1 1 1 1 1 1 1 1 1 1 1 1 1
        """.trimIndent()

        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Triangle_N3() {
        //  Input data
        val input = "3"
        // Expected output
        val expectedOutput = """
           1
             1 1 1
           1 1 1 1 1
        """.trimIndent()

        runTest(input, expectedOutput)
    }
}