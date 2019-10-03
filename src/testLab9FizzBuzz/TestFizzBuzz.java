package testLab9FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestFizzBuzz {
	
	FizzBuzz testFizzBuzz;
	
	@BeforeEach
	public void setUp() throws Exception {
		testFizzBuzz = new FizzBuzz();
	}

	@Test
	@DisplayName("Test CalculateNumber using TC01")
	void test_point_is_80_result_is_A() {
		String result = testFizzBuzz.CalculateNumber(1);
		assertEquals("1", result);		
	}

}
