package br.com.erudio.math;

public class SimpleMath {

	Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	Double sub(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	Double mult(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	Double div(Double firstNumber, Double secondNumber) {
		if (Double.isNaN(firstNumber) || Double.isNaN(secondNumber)) {
	        throw new IllegalArgumentException("Valores não podem ser NaN");
	    }

	    if (Double.isInfinite(firstNumber) || Double.isInfinite(secondNumber)) {
	        throw new IllegalArgumentException("Valores não podem ser infinitos");
	    }

	    if (secondNumber == 0) {
	        throw new ArithmeticException("Divisão por zero");
	    }

		return firstNumber / secondNumber;
	}

	Double avg(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	Double sqrt(double number) {
		return Math.sqrt(number);
	}

}
