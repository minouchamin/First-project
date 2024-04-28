package bmt;

import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

//import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("5\n3\n+\n".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        System.setIn(inContent);
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(System.in);
    }

    @Test
    public void testAdditionOperation() {
        double num1 = 5.0;
        double num2 = 3.0;
        double expectedResult = 8.0;

        Calculator calculator = new Calculator();
        double actualResult = calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult, 0.0001); // 0.0001 is the delta for double comparison
    }

}
