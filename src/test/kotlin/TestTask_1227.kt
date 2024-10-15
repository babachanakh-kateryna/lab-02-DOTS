
import org.example.mainTask1227
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * Tests for Task 1227
 */
class TestTask_1227 {

    @Test
    fun test01_Divisor100() {
        // Input data
        val input = "100"

        // Expected output
        val expectedOutput = "50"

        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1227
        mainTask1227()

        // Check the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test02_Divisor49() {
        // Input data
        val input = "49"

        // Expected output
        val expectedOutput = "7"

        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1227
        mainTask1227()

        // Check the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun test03_Divisor37() {
        //  Input data
        val input = "37"

        // Expected output
        val expectedOutput = "1"

        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1227
        mainTask1227()

        // Check the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }

    @Test
    fun testDivisorForLargeNumber() {
        //  Input data
        val input = "2147483647"
        // Expected output
        val expectedOutput = "1"

        // Prepare input data
        System.setIn(ByteArrayInputStream(input.toByteArray()))

        // Intercept the output
        val outputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(outputStream))

        // Run the main function for Task 1227
        mainTask1227()

        // Check the result
        assertEquals(expectedOutput, outputStream.toString().trim())
    }
}
