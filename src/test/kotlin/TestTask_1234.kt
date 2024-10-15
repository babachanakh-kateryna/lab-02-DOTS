
import org.example.mainTask1234
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Tests for Task 1234
 */
class TestTask_1234{

    @Test
    fun test1_OK() {
        // input data
        val input = """
            4
            3
            -5
            3
            0
        """.trimIndent()

        // expected output
        val expectedOutput = "3"

        System.setIn(ByteArrayInputStream(input.toByteArray()))

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the specific main function for Task 1234
        mainTask1234()

        // compare the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test02_OK() {
        // input data
        val input = """
            1
            0
            2
            3
            4
            5
        """.trimIndent()
        // expected output
        val expectedOutput = "1"

        System.setIn(ByteArrayInputStream(input.toByteArray()))

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the specific main function for Task 1234
        mainTask1234()

        // compare the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test03_NoOddNumbers() {
        // input data
        val input = """
            2
            4
            6
            0
        """.trimIndent()
        // expected output
        val expectedOutput = "0"

        System.setIn(ByteArrayInputStream(input.toByteArray()))

        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the specific main function for Task 1234
        mainTask1234()

        // compare the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }
}
