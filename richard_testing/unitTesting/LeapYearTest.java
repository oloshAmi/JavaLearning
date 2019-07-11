package unitTesting;
import org.junit.*;
import org.hamcrest.*;

public class LeapYearTest {
	
	@Test
	public void leapYearsAreDivisibleByFour() {
		Assert.assertTrue(LeapYear.isLeapYear(2016));
	}
	
	@Test
	public void normalYearsAreNotDisvisibleByFour() {
		Assert.assertFalse(LeapYear.isLeapYear(1999));
		
	}
	
	@Test
	public void leapYearsAreNotDivisibleByHundred() {
		Assert.assertFalse(LeapYear.isLeapYear(1900));
	}
	
	@Test
	public void leapYearsAreDivisibleByFourHundred() {
		Assert.assertTrue(LeapYear.isLeapYear(2000));
	}

}
