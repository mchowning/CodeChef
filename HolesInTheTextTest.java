import static org.junit.Assert.*;

import java.io.*;

import org.junit.Test;


public class HolesInTheTextTest {
	
	@Test
	public void test1() {
		assertEquals(HolesInTheText.numHoles("CODECHEF"), 2);
	}
	
	@Test
	public void test2() {
		assertEquals(HolesInTheText.numHoles("DRINKEATCODE"), 5);
	}
}