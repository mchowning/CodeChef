import static org.junit.Assert.*;
import java.math.*;

import org.junit.Test;


public class SmallFactorialsTest {

	@Test
	public void test1() {
		assertEquals(SmallFactorials.factorial(1), BigInteger.valueOf(1));
	}

	@Test
	public void test2() {
		assertEquals(SmallFactorials.factorial(2), BigInteger.valueOf(2));
	}
	
	@Test
	public void test3() {
		assertEquals(SmallFactorials.factorial(3), BigInteger.valueOf(6));
	}
	
	@Test
	public void test4() {
		assertEquals(SmallFactorials.factorial(5), BigInteger.valueOf(120));
	}
}
