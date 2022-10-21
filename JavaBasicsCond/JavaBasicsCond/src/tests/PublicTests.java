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
	public void pub1Area() throws Exception, Throwable {
		String testName = "pub1Area", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Area.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
		
		/* Writing the results of your program to a file */
		TestingSupport.writeToFileTestResults(testName, results);
	}
	
	@Test
	public void pub2Divisible() throws Exception, Throwable {
		String testName = "pub2Divisible", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		Divisible.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
		
		/* Writing the results of your program to a file */
		TestingSupport.writeToFileTestResults(testName, results);
	}
	
	@Test
	public void pub3ColorGenerator1() throws Exception, Throwable {
		String testName = "pub3ColorGenerator1", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		ColorGenerator.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
		
		/* Writing the results of your program to a file */
		TestingSupport.writeToFileTestResults(testName, results);
	}
	
	@Test
	public void pub4ColorGenerator2() throws Exception, Throwable {
		String testName = "pub4ColorGenerator2", expectedResultsFileName = testName + EXPECTED_RESULTS_EXT;
		
		/* Redirecting standard input and output */
		TestingSupport.redirectStandardInputToFile(testName + INPUT_FILE_NAME_EXT);
		ByteArrayOutputStream newOutput = TestingSupport.redirectStandardOutputToByteArrayStream();
		
		/* Running program */
		ColorGenerator.main(null);
		
		/* Restoring standard input and output */
		TestingSupport.restoreStandardIO();
		
		String results = newOutput.toString();
		TestingSupport.generateExpectedResultsFile(results, expectedResultsFileName);
		
		/* Verifying whether correct results generated */
		assertTrue(TestingSupport.correctResults(expectedResultsFileName, results));
		
		/* Writing the results of your program to a file */
		TestingSupport.writeToFileTestResults(testName, results);
	}
}