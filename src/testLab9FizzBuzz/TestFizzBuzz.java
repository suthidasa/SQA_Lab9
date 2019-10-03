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
	void test_point_is_1_result_is_1() {
		String result = testFizzBuzz.CalculateNumber(1);
		assertEquals("1", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC02")
	void test_point_is_2_result_is_2() {
		String result = testFizzBuzz.CalculateNumber(2);
		assertEquals("2", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC03")
	void test_point_is_3_result_is_3() {
		String result = testFizzBuzz.CalculateNumber(3);
		assertEquals("Fizz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC04")
	void test_point_is_4_result_is_4() {
		String result = testFizzBuzz.CalculateNumber(4);
		assertEquals("4", result);		
	}

}
