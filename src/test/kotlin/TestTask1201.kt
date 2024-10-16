import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.*

/**
 * Tests for Task 1201.
 */
class TestTask1201 {

    @Test
    fun testTask() {
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // input data
        val input = "4"
        System.setIn(input.byteInputStream())

        // Run the main function
        mainTask1201()

        // expected output
        val expectedOutput = "Hello!\nHello!\nHello!\nHello!\n"

        // compare the result, removing possible extra spaces or line breaks
        assertEquals(expectedOutput.replace("\r", ""), outputStream.toString().replace("\r", ""))
    }
}
