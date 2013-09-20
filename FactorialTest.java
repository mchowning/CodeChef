import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialTest {

	@Test
	public void test1() {
		assertEquals(Factorial.numZeroes(3), 0);
	}
	
	@Test
	public void test2() {
		assertEquals(Factorial.numZeroes(60), 14);
	}
	
	@Test
	public void test3() {
		assertEquals(Factorial.numZeroes(100), 24);
	}
	
	@Test
	public void test4() {
		assertEquals(Factorial.numZeroes(1024), 253);
	}
	
	@Test
	public void test5() {
		assertEquals(Factorial.numZeroes(23456), 5861);
	}
	
	@Test
	public void test6() {
		assertEquals(Factorial.numZeroes(8735373), 2183837);
	}
	
	@Test
	public void testFail() {
		assertNotEquals(Factorial.numZeroes(3), 1);
	}

}
