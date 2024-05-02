package bmt;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void powerOnCalculator() {
        System.out.println("The calculator is on");
    }

    @After
    public void powerOffCalculator() {
        System.out.println("The calculator is off");
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

    @Test(timeout = 1000)
    public void testAddition() {
    }
}
