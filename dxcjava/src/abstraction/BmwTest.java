package abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest  extends Test{

	@Test
	public void testAdd() {
		int expected = 40;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
	}

	private void assertEquals(int expected, int actual) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testElgibility() {
		//boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(18);

		//assertFalse(actual);
		assertTrue(actual);
	}

	private void assertTrue(boolean actual) {
		// TODO Auto-generated method stub
		
	}

}