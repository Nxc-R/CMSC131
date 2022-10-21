package tests;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import programs.Utilities;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PublicTests {

	@Test
	public void pubTest01() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String answer = "";
		
		answer = Utilities.getArrayString(new int[] { 10, 20, 30 }, ',');
		
		assertTrue(TestingSupport.isResultCorrect(testName, answer, true));
	}
	
	@Test
	public void pubTest02() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String answer = "";
		int[] data = {10, 30, 7, 5, 9, 60, -1};
		int lowerLimit = 7, upperLimit = 30;
		
		answer = Utilities.getArrayString(data, ',');
		answer += "\n";
		answer += Utilities.getInstances(data, lowerLimit, upperLimit);
		
		assertTrue(TestingSupport.isResultCorrect(testName, answer, true));
	}
	
	@Test
	public void pubTest03() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String answer = "";
		
		int[] data = {10, 30, 7, 5, 9, 60, -1};
		int lowerLimit = 7, upperLimit = 30;
		
		answer = Utilities.getArrayString(data, ',');
		answer += "\n";
		answer += Utilities.getArrayString(Utilities.filter(data, lowerLimit, upperLimit), ',');
		
		assertTrue(TestingSupport.isResultCorrect(testName, answer, true));
	}
	
	@Test
	public void pubTest04() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String answer = "";
		
		int[] data = {10, 30, 7, 5, 9, 60, -1};
		int lowerLimit = 100, upperLimit = 200;
		
		answer = Utilities.getArrayString(data, ',');
		answer += "\n*";
		answer += Utilities.getArrayString(Utilities.filter(data, lowerLimit, upperLimit), ',')+"*";
		
		assertTrue(TestingSupport.isResultCorrect(testName, answer, true));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void pubTest05() {
		int[] data = {10, 30, 7, 5, 9, 60, -1};
		int lowerLimit = 999, upperLimit = 333;
	
		Utilities.filter(data, lowerLimit, upperLimit);
	}
}