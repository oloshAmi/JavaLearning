package unitTesting;
import org.junit.*;
//import org.hamcrest.*;

public class WordWrapTest {
	public static final int LINE_LENGTH=5;
	
	@Test
	public void LineShoudWrapIfOverLineLength() {
		String result=WordWrap.wrap("The sleepy",LINE_LENGTH);
		Assert.assertEquals("The s\nleepy", result);
	}
	
	@Test
	public void shortLinesShouldNotWrap() {
		String result=WordWrap.wrap("The",LINE_LENGTH);
		Assert.assertEquals("The", result);
	}
	
	@Test
	public void longerLineShouldWrapTwice() {
		String result=WordWrap.wrap("The sleepy Brow",LINE_LENGTH);
		Assert.assertEquals("The s\nleepy\n Brow", result);
	}
	
	@Test
	public void evenLongerLineShouldWrapThrice() {
		String result=WordWrap.wrap("The sleepy Brown Fox",LINE_LENGTH);
		Assert.assertEquals("The s\nleepy\n Brow\nn Fox", result);
	}
	
	@Test
	public void longLinesDontHaveToBeAMultipleOfLineLength() {
		String result=WordWrap.wrap("The sleepy Brown Fox.",LINE_LENGTH);
		Assert.assertEquals("The s\nleepy\n Brow\nn Fox\n.", result);
	}

}
