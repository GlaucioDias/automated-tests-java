package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class DemoRepeatedTest {
	SimpleMath math;
	
	@BeforeEach
	void setup() {
		math = new SimpleMath();
	}

	@RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of {totalRepetitions}!")
	@DisplayName("Test Division by zero")
	void testDivByZero(RepetitionInfo repetition, TestInfo testInfo) {
		System.out.println("Repetition Nº " + repetition.getCurrentRepetition() + " of " + repetition.getTotalRepetitions());
		System.out.println("Running " + testInfo.getTestMethod().get().getName());
		
		String expectedMessage = "Divisão por zero";
	    
		ArithmeticException actual =  assertThrows(ArithmeticException.class, () -> {
	        math.div(6.2D, 0D);
	    }, () -> "Dividing by zero did not throw an ArithmeticException!");
	    
	    assertEquals(expectedMessage, actual.getMessage());
	}

}
