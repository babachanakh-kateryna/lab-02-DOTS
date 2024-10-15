import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.*

/**
 * Tests for Task 1263
 */
class TestTask1263 {

    private fun runTest(input: String, expectedOutput: String) {
        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1263
        mainTask1263()

        // Check the result, replacing line separators and trimming whitespace
        assertEquals(expectedOutput.replace("\r\n", "\n").trim(), outputStream.toString().replace("\r\n", "\n").trim())
    }

    @Test
    fun test01_Triangle_N2() {
        //  Input data
        val input = "2"
        // Expected output
        val expectedOutput = """
           *
           * * *
        """.trimIndent()

        runTest(input, expectedOutput)
    }

    @Test
    fun test02_Triangle_N3() {
        //  Input data
        val input = "3"
        // Expected output
        val expectedOutput = """
            *
            * ${'$'} *
          * * * * *
        """.trimIndent()

        runTest(input, expectedOutput)
    }

    @Test
    fun test03_Triangle_N5() {
        //  Input data
        val input = "5"
        // Expected output
        val expectedOutput = """
            *
              * ${'$'} *
            * ${'$'} ${'$'} ${'$'} *
          * ${'$'} ${'$'} ${'$'} ${'$'} ${'$'} *
        * * * * * * * * *
        """.trimIndent()

        runTest(input, expectedOutput)
    }
}
