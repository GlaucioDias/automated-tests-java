package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Math operations in SimpleMath class")
class SimpleMathTest {
	SimpleMath math;
	@BeforeEach
	void setup() {
		math = new SimpleMath();
		
	}

	@Test
	void testSum() {
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
		double expected = 8.2D;
		
		assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSub() {
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sub(firstNumber, secondNumber);
		double expected = 4.2D;
		
		assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}

	@Test
	void testMult() {
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mult(firstNumber, secondNumber);
		double expected = 12.4D;
		
		assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testDiv() {
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.div(firstNumber, secondNumber);
		double expected = 3.1D;
		
		assertEquals(expected, actual, 0.0001, () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testDivByZero() {
		var expectedMessage = "Divisão por zero";
	    ArithmeticException actual =  assertThrows(ArithmeticException.class, () -> {
	        math.div(6.2D, 0D);
	    }, () -> "Dividing by zero did not throw an ArithmeticException!");
	    
	    assertEquals(expectedMessage, actual.getMessage());
	}
	
	@Test
	void testDivWithFirstNumberNaN() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        math.div(Double.NaN, 2D);
	    });
	}
	
	@Test
	void testDivWithSecondNumberNaN() {
		assertThrows(IllegalArgumentException.class, () -> {
			math.div(6.2D, Double.NaN);
		});
	}
	
	@Test
	void testDivWithBothInfinite() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        math.div(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
	    });
	}
	
	@Test
	void testAverage() {
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.avg(firstNumber, secondNumber);
		double expected = 4.1D;
		
		assertEquals(expected, actual, () -> "(" + firstNumber + " + " + secondNumber + ") / 2" + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSquareRoot() {
		double number = 49D;
		Double actual = math.sqrt(number);
		double expected = 7D;
		
		assertEquals(expected, actual, () -> "Square Root of " + number + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	// test[System Under Test (SUT)]_[Condition or State Change]_[Expected Result]
	@Test
	@DisplayName("Test Template")
	@Disabled("This test is a template and should be implemented later.")
	void testABCD_When_XYZ_Should() {
		// Given / Arrange
		// When / Act
		fail();
		// Then / Assert
	}
	

}
