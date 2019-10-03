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
	void test_point_is_3_result_is_Fizz() {
		String result = testFizzBuzz.CalculateNumber(3);
		assertEquals("Fizz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC04")
	void test_point_is_4_result_is_4() {
		String result = testFizzBuzz.CalculateNumber(4);
		assertEquals("4", result);		
	}

	@Test
	@DisplayName("Test CalculateNumber using TC05")
	void test_point_is_5_result_is_Buzz() {
		String result = testFizzBuzz.CalculateNumber(5);
		assertEquals("Buzz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC06")
	void test_point_is_6_result_is_Fizz() {
		String result = testFizzBuzz.CalculateNumber(6);
		assertEquals("Fizz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC07")
	void test_point_is_7_result_is_7() {
		String result = testFizzBuzz.CalculateNumber(7);
		assertEquals("7", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC08")
	void test_point_is_8_result_is_8() {
		String result = testFizzBuzz.CalculateNumber(8);
		assertEquals("8", result);		
	}

	@Test
	@DisplayName("Test CalculateNumber using TC09")
	void test_point_is_9_result_is_Fizz() {
		String result = testFizzBuzz.CalculateNumber(9);
		assertEquals("Fizz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC10")
	void test_point_is_10_result_is_Buzz() {
		String result = testFizzBuzz.CalculateNumber(10);
		assertEquals("Buzz", result);		
	}
	
	@Test
	@DisplayName("Test CalculateNumber using TC11")
	void test_point_is_11_result_is_Buzz() {
		String result = testFizzBuzz.CalculateNumber(11);
		assertEquals("11", result);		
	}
	@Test
	@DisplayName("Test CalculateNumber using TC12")
	void test_point_is_Buzz_result_is_Fizz() {
		String result = testFizzBuzz.CalculateNumber(12);
		assertEquals("Fizz", result);		
	}
}
