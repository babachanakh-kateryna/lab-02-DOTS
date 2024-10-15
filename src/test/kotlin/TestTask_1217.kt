import org.example.mainTask1217
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Tests for Task 1217.
 */
class TestTask_1217 {

    @Test
    fun testTask() {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // input data
        val input = "3"
        System.setIn(input.byteInputStream())

        // Run the specific main function for Task 1217
        mainTask1217()

        // expected output
        val expectedOutput = """
            0 0 0
            0 0
            0
        """.trimIndent()

        // compare the result
        assertEquals(expectedOutput.replace("\r", ""), outputStream.toString().replace("\r", "").trim())
    }
}
