package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import programs.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PublicTests {
	private static String INPUT_FILE_NAME_EXT = "Input.txt";
	private static String EXPECTED_RESULTS_EXT = "ExpectedResults.txt";
	
	@Test
	public void pub1Convert1() throws Exception, Throwable {
		String testName = "pub1Convert1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Convert.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pub2Convert2() throws Exception, Throwable {
		String testName = "pub2Convert2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Convert.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pub3ThrowDie1() throws Exception, Throwable {
		String testName = "pub3ThrowDie1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		ThrowDie.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pub4Access1() throws Exception, Throwable {
		String testName = "pub4Access1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pub5Access2() throws Exception, Throwable {
		String testName = "pub5Access2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
	
	@Test
	public void pub6Access3() throws Exception, Throwable {
		String testName = "pub6Access3", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Access.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		/* Results generated by student's program */
		String results = newOutput.toString();

		/* Writing results of student's program to a file */
		TestingSupport.writeToFile(testName + "Results.txt", results);

		/* Ignore this entry if you are a student */
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
			
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
	}
}