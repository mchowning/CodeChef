import static org.junit.Assert.*;

import org.junit.Test;


public class ATMTest {

	@Test
	public void test1() {
		assertEquals(ATM.performWithdrawal(30, 120), 89.5, .001);
	}

	@Test
	public void test2() {
		assertEquals(ATM.performWithdrawal(42, 120), 120, .001);
	}
	
	@Test
	public void test3() {
		assertEquals(ATM.performWithdrawal(0, 120), 120, .001);
	}
	
	@Test
	public void test4() {
		assertEquals(ATM.performWithdrawal(200, 200), 200, .001);
	}
	
	@Test
	public void test5() {
		assertEquals(ATM.performWithdrawal(50, 10), 10, .001);
	}
}
