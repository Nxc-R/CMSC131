package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import programs.Passport;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StudentTests {
	/*
	 * Each method in a JUnit StudentTest class represents a test. You can write
	 * code in a method of this class as you do in the main method of a driver. 
	 * As you write your code, define methods in this class that test each of 
	 * the methods you need to implement. When you run a method you can have 
	 * System.out.println statements to see the results of your code. Using 
	 * this approach is simpler than defining driver classes.
	 * 
	 * For this project you don't need to worry about adding assertions (we will
	 * talk about them soon). If you don't add assertions, by default, every test
	 * will pass (so when you run your student tests you will see a green bar).  
	 * We have left two examples of tests below so you can see how you can test
	 * your code.
	 * 
	 * You can run a single test (e.g., testingtoString() below) by double-clicking
	 * on the method's name and selecting Run-->Run As-->JUnit Test.  You can also
	 * double-click on the method's name and select the white triangle that is inside
	 * of a green circle (under Refactor).
	 */
	
	@Test
	public void testingtoString() {
		Passport passport1 = new Passport("Rose", "Sanders");
		System.out.println(passport1);
	}

	@Test
	public void testingSetSeparator() {
		Passport passport1 = new Passport("Tom", "Johnson");
		System.out.println(passport1);
		
		passport1.setSeparator('#');
		System.out.println(passport1);
	}
	@Test
	public void testingaddStamps () {
		Passport passport1 = new Passport("Nancy", "Rivers");
		System.out.println(passport1);
		
		passport1.addStamp("Brazil");
		System.out.println(passport1.getStamps());
		passport1.addStamp("Canada");
		System.out.println(passport1.getStamps());
	}
	@Test
	public void testinggetStamps () {
		Passport passport1 = new Passport("me","mario", "itsa");
		passport1.addStamp("MushroomK");
		System.out.println(passport1);
		
		StringBuffer stamp = passport1.getStamps();
		System.out.println(stamp);
	}
	
	@Test
	public void testinggetSeparator () {
		Passport passport1 = new Passport("Minecraft","Steve");
		System.out.println(passport1);
		
		passport1.setSeparator('$');
		System.out.println(passport1);
		System.out.println(passport1.getSeparator());
	}
	
	@Test
	public void testingequals () {
		Passport passport1 = new Passport("Nathaniel","Griffth", "Brown");
		System.out.println(passport1);
		Passport passport2 = new Passport("Nathaniel","Griffth", "BROwn");
		System.out.println(passport2);
		Passport passport3 = new Passport("Nathaniel","Griffth", "Lake");
		System.out.println(passport3);
		
		System.out.println(passport1 + " is the same name as " + passport2 + "?: " + passport1.equals(passport2));
		System.out.println(passport1 + " is the same name as " + passport3 + "?: " + passport1.equals(passport3));
	}
	
	@Test
	public void testingcompareTo () {
		Passport passport1 = new Passport("Jason","Todd");
		System.out.println(passport1);
		Passport passport2 = new Passport("Richard","Grayson");
		System.out.println(passport2);
		Passport passport3 = new Passport("Barbara","Gordon");
		System.out.println(passport3);
		
		System.out.println("Comparsion 1: " + (passport1.compareTo(passport2) < 0));
		System.out.println("Comparsion 2: " +  (passport1.compareTo(passport2) > 0));
		System.out.println("Comparsion 3: " + (passport3.compareTo(passport2) == 0));
		}
	
	@Test
	public void testinggetNumberOfPassportObjects() {
		Passport.resetNumberOfPassportObjects();
		Passport passport1 = new Passport("Jason","Todd");
		Passport passport2 = new Passport("Richard","Grayson");
		Passport passport3 = new Passport("Barbara","Gordon");
		Passport passport4 = new Passport("Tim","Drake");
		Passport passport5 = new Passport("Damian","Wayne");
		Passport passport6 = new Passport("Bruce","Wayne");
		System.out.println(passport1 + "\n" + passport2 + "\n" + passport3 + "\n" + passport4 + "\n" + passport5 + "\n" + passport6);
		System.out.println("Total objects made: " + Passport.getNumberOfPassportObjects());
	}
	
	@Test
	public void testingresetNumberOfPassportObjects() {
		Passport passport1 = new Passport("Jason","Todd");
		Passport passport2 = new Passport("Richard","Grayson");
		Passport passport3 = new Passport("Barbara","Gordon");
		Passport passport4 = new Passport("Tim","Drake");
		Passport passport5 = new Passport("Damian","Wayne");
		Passport passport6 = new Passport("Bruce","Wayne");
		System.out.println(passport1 + "\n" + passport2 + "\n" + passport3 + "\n" + passport4 + "\n" + passport5 + "\n" + passport6);
		System.out.println("Objects left befre resetting: " + Passport.getNumberOfPassportObjects());
		Passport.resetNumberOfPassportObjects();
		System.out.println("Objects left after resetting: " + Passport.getNumberOfPassportObjects());
	}
	
	@Test
	public void testingnormalize () {
		Passport passport1 = new Passport("Barry","HenRY", "ALLEN");
		System.out.println(passport1);
		System.out.println(Passport.normalize(passport1, true));
		System.out.println(Passport.normalize(passport1, false));
		System.out.println(Passport.normalize(null, false));
	}
	
	@Test
	public void testingchangeLastname () {
		Passport passport1 = new Passport("Iris","", "West");
		System.out.println("Last name changed: " + passport1.changeLastname("West-Allen"));
		System.out.println("Last name changed: " + passport1.changeLastname("                  "));
	}
}