package unitTesting;

import static org.hamcrest.Matcher.*;

import java.util.*;

import org.hamcrest.Matchers;
import org.junit.*;
public class HamcrestExampleTest {
	
	@Test
	public void mapShouldContainValue() {
		Map<String,Integer> values=getValues();
		Assert.assertThat(values,Matchers.hasKey("b"));
	}
	
	private Map<String,Integer> getValues(){
		final HashMap<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("b", 1);
		return map;
	}
	
	@Test
	public void listOrderisIrrelevant() {
		List<Integer> numbers=getNumbers();
		Assert.assertThat(numbers, Matchers.hasItem(5));
	}
	
	private List<Integer> getNumbers(){
		return Arrays.asList(1,2,3,5,4);
	}

}
