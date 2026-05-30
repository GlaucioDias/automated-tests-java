package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Math operations in SimpleMath class")
class SimpleMathTestS4 {
	SimpleMath math;
	
	@BeforeEach
	void setup() {
		math = new SimpleMath();
	}
	
	@DisplayName("Test double subtraction [firstNumber, secondNumber, expected]")
	@ParameterizedTest
	@CsvFileSource(resources = "/testDivision.csv")
	void testDivision(double firstNumber, double secondNumber, double expected) {
		System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
		Double actual = math.div(firstNumber, secondNumber);
		
		assertEquals(expected, actual, 2D, () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}

}
