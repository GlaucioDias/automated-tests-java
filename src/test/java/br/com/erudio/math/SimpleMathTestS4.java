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
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Math operations in SimpleMath class")
class SimpleMathTestS4 {
	SimpleMath math;
	
	@BeforeEach
	void setup() {
		math = new SimpleMath();
	}
	
	@DisplayName("Test 6.2 / 2 = 3.1")
	@ParameterizedTest
	@MethodSource()
	void testDivision(double firstNumber, double secondNumber, double expected) {
		System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
		Double actual = math.div(firstNumber, secondNumber);
		
		assertEquals(expected, actual, 2D, () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2D, actual);
		assertNotNull(actual);
	}
	
	public static Stream<Arguments> testDivision() {
		return Stream.of(
				Arguments.of(6.2D, 2D, 3.1D),
				Arguments.of(71D, 14D, 5.07D),
				Arguments.of(18.3D, 3.1D, 5.90D)
		);
	}
}
