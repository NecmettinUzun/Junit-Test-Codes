package programming.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterClass {

	@BeforeClass
	public static void beforeClass() {
		System.err.println("Before class");
	}
	
	@Before
	public void setup() {
		System.out.println("Before each test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}
	
	@After
	public void teardown() {
		System.out.println("After each test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.err.println("After class");
	}
}
