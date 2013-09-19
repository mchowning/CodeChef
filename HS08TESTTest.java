import static org.junit.Assert.*;

import org.junit.Test;


public class HS08TESTTest {

	@Test
	public void test1() {
		assertEquals(HS08TEST.performWithdrawal(30, 120), 89.5, .001);
	}

	@Test
	public void test2() {
		assertEquals(HS08TEST.performWithdrawal(42, 120), 120, .001);
	}
	
	@Test
	public void test3() {
		assertEquals(HS08TEST.performWithdrawal(0, 120), 120, .001);
	}
	
	@Test
	public void test4() {
		assertEquals(HS08TEST.performWithdrawal(200, 200), 200, .001);
	}
	
	@Test
	public void test5() {
		assertEquals(HS08TEST.performWithdrawal(50, 10), 10, .001);
	}
}
