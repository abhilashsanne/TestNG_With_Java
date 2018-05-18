package TestNg_Java_CheatSheet.ParallelTestExecution;

import org.testng.annotations.Test;

public class Parallel_Classes_Tests2 {
	// NOTE: Run via Parallel_Classes_Tests.xml
	// Check thread count in console output to see how these test methods use 4
	// threads to execute in parallel, rerun and verify again
	@Test
	public void testCase1() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase1 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase2() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase2 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase3() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase3 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase4() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase4 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase5() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase5 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase6() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase6 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase7() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase7 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase8() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase8 Successful, the thread count is: " + id);
	}

	@Test
	public void testCase9() {
		long id = Thread.currentThread().getId();
		System.out.println("testCase9 Successful, the thread count is: " + id);
	}
}
