package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import programs.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StudentTests {

	@Test
	public void testinggetArrayString() {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		String expected = "10]20]7]9]8]6";
		String result = Utilities.getArrayString(testArr, ']');
		assertEquals(expected, result);
	}
	@Test
	public void testinggetInstances () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int instances = 3;
		int result = Utilities.getInstances(testArr, 9, 30);
		assertEquals(instances, result);
	}
	@Test
	public void testinggetInstances02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int instances = 0;
		int result = Utilities.getInstances(testArr, 50, 50);
		assertEquals(instances, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testinggetInstances03 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
	    Utilities.getInstances(testArr, 50, 40);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testinggetInstances04 () {
	    Utilities.getInstances(null, 50, 60);
	}
	@Test
	public void testingfilter () {
		int [] testArr = new int [] {10, 30, 7, 5, 9, 60, -1};
		String expected = "10&30&7&9";
		String result = Utilities.getArrayString(Utilities.filter(testArr, 7, 30), '&');
		assertEquals(expected, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testingfilter02 () {
		int [] testArr = new int [] {10, 30, 7, 5, 9, 60, -1};
		Utilities.getInstances(testArr, 49999999, 1);
	}
	@Test
	public void testingfilter03 () {
		int [] testArr = new int [] {10, 30, 7, 5, 9, 60, -1};
		String expected = "";
		String result = Utilities.getArrayString(Utilities.filter(testArr, 65, 78), '&');
		assertEquals(expected, result);
	}
	@Test
	public void testingfilter04 () {
		int [] testArr = new int [5];
		String expected = "";
		String result = Utilities.getArrayString(Utilities.filter(testArr, 65, 78), '&');
		assertEquals(expected, result);
	}
	@Test
	public void testingrotate () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int [] expected = new int [] {20,7,9,8,6,10};
		Utilities.rotate(testArr, true, 1);
		assertArrayEquals(expected, testArr);
	}
	@Test
	public void testingrotate02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int [] expected = new int [] {9,8,6,10,20,7};
		Utilities.rotate(testArr, true, 99);
		assertArrayEquals(expected, testArr);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testingrotate03 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		Utilities.rotate(testArr, true, -1);
	}
	@Test
	public void testingrotate04 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int [] expected = new int [] {8,6,10,20,7,9};
		Utilities.rotate(testArr, false, 2);
		assertArrayEquals(expected, testArr);
	}
	@Test
	public void testingrotate05 () {
		int [] testArr = new int [] {6};
		int [] expected = new int [] {6};
		Utilities.rotate(testArr, false, 89898);
		assertArrayEquals(expected, testArr);
	}
	@Test
	public void testinggetArrayStringsLongerThan () {
		String expected = "test yeeeeet nani asddd ";
		String result = "";
		StringBuffer t1 = new StringBuffer("test"), t2 = new StringBuffer("yeeeeet"), 
				t3 = new StringBuffer("nani"), t4 = new StringBuffer("asddd"), t5 = new StringBuffer("dsa");
		StringBuffer[] str = new StringBuffer[] {t1, t2, t3, t4, t5};
		for (int i = 0;i < Utilities.getArrayStringsLongerThan(str, 3).length;i++) {
			result += Utilities.getArrayStringsLongerThan(str, 3)[i] + " ";
		}
		assertEquals(expected, result);
	}
	@Test
	public void testinggetArrayStringsLongerThan02 () {
		String expected = "test yeeeeet nani asddd dsa ";
		String result = "";
		StringBuffer t1 = new StringBuffer("test"), t2 = new StringBuffer("yeeeeet"), 
				t3 = new StringBuffer("nani"), t4 = new StringBuffer("asddd"), t5 = new StringBuffer("dsa");
		StringBuffer[] str = new StringBuffer[] {t1, t2, t3, t4, t5};
		for (int i = 0;i < Utilities.getArrayStringsLongerThan(str, -1).length;i++) {
			result += Utilities.getArrayStringsLongerThan(str, -1)[i] + " ";
		}
		assertEquals(expected, result);
	}
	@Test
	public void testinggetArrayStringsLongerThan03 () {
		String expected = "";
		String result = "";
		StringBuffer t1 = new StringBuffer("test"), t2 = new StringBuffer("yeeeeet"), 
				t3 = new StringBuffer("nani"), t4 = new StringBuffer("asddd"), t5 = new StringBuffer("dsa");
		StringBuffer[] str = new StringBuffer[] {t1, t2, t3, t4, t5};
		for (int i = 0;i < Utilities.getArrayStringsLongerThan(str, 99).length;i++) {
			result += Utilities.getArrayStringsLongerThan(str, 99)[i] + " ";
		}
		assertEquals(expected, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testinggetArrayStringsLongerThan04 () {
		Utilities.getArrayStringsLongerThan(null, 99);
	}
	@Test
	public void testingcountInstancesOf () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int expected = 1;
		int result = Utilities.countInstancesOf(20, testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testingcountInstancesOf02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		int expected = 0;
		int result = Utilities.countInstancesOf(76, testArr);
		assertEquals(expected, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testingcountInstancesOf03 () {
		Utilities.countInstancesOf(76, null);
	}
	@Test
	public void testinghasTwoInstancesOfAnyValue () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6};
		boolean expected = false;
		boolean result = Utilities.hasTwoInstancesOfAnyValue(testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testinghasTwoInstancesOfAnyValue02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6, 20};
		boolean expected = true;
		boolean result = Utilities.hasTwoInstancesOfAnyValue(testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testinghasTwoInstancesOfAnyValue03 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6, 20, 20, 20, 20, 6, 6};
		boolean expected = false;
		boolean result = Utilities.hasTwoInstancesOfAnyValue(testArr);
		assertEquals(expected, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testinghasTwoInstancesOfAnyValue04 () {
		Utilities.hasTwoInstancesOfAnyValue(null);
	}
	@Test
	public void testinghasTwoPairsOfDifferentValues () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6, 20, 20, 20, 20, 6, 6};
		boolean expected = false;
		boolean result = Utilities.hasTwoPairsOfDifferentValues(testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testinghasTwoPairsOfDifferentValues02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6, 20, 20, 20, 20, 6, 6, 9, 10};
		boolean expected = true;
		boolean result = Utilities.hasTwoPairsOfDifferentValues(testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testingisIncreasing () {
		int[] argh = new int[] {-40, 30, 30,50, 50};
		boolean expected = true;
		boolean result = Utilities.isIncreasing(argh);
		assertEquals(expected, result);
	}
	@Test
	public void testingisIncreasing02 () {
		int [] testArr = new int [] {10, 20, 7, 9, 8, 6, 20, 20, 20, 20, 6, 6, 9, 10};
		boolean expected = false;
		boolean result = Utilities.isIncreasing(testArr);
		assertEquals(expected, result);
	}
	@Test
	public void testinggetIndices () {
		int [] testArr2 = new int [] {10, 30, 7, 5, 9, 60, -1};
		String expected = "2,3,4,6";
		int[] newArr = Utilities.getIndices(testArr2, false);
		String result = Utilities.getArrayString(newArr, ',');
		assertEquals(expected, result);
	}
}
