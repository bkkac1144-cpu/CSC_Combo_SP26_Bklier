import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Calculator_test {
private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	@DisplayName ("Addition test")
	void test() {
		int result = calculator.add(5, 3);
		assertEquals(result, 7,"\n~Add not working properly~\n");
	}
	@Test
	@DisplayName("Multiplication test.")
	void MultiplicationTest() {
		int result = calculator.multiply(2, 3);
		assertEquals(result, 7, "\n~Multiplier not working properly");
	}
}
