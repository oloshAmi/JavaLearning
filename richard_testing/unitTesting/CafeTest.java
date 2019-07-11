package unitTesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

public class CafeTest {
	
	private static final int NO_BEANS = 0;
	private static final int NO_MILK = 0;
	private static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();
	
	Cafe cafe;
	
	@Before
	public void before() {
		cafe=new Cafe();
	}
	
	
	

	@Test
	public void canBrewEspresso() {
		//given
		withBeans();
		
		// when
		Coffee coffee=cafe.brew(CoffeeType.Espresso);
		
		//then
		Assert.assertThat(coffee, Matchers.hasProperty("beans",Matchers.equalTo(ESPRESSO_BEANS))); //Beans is private, but there is a public getter
		Assert.assertEquals("Wrong Coffee Type",CoffeeType.Espresso, coffee.getType());
		Assert.assertEquals("Wrong amount of Milk",NO_MILK, coffee.getMilk());
		//Assert.assertEquals("Wrong amount of Beans",ESPRESSO_BEANS, coffee.getBeans());
		
	}


	@Test
	public void brewingEspressoConsumesBeans() {
		withBeans();

		// when
		Coffee coffee=cafe.brew(CoffeeType.Espresso);
		
		//Then
		Assert.assertEquals(NO_BEANS, cafe.getBeansInStock());
				
		
	}
	
	//then
	@Test(expected=IllegalStateException.class) //Because if exceptions occur, it'll exit the method

	public void lattesRequiresMilk() {
		withBeans();
		
		//when
		Coffee coffee=cafe.brew(CoffeeType.Latte);
	}
	
	
	@Test
	public void canBrewLatte() {
		withBeans();
		cafe.restockMilk(CoffeeType.Latte.getRequiredMilk());
		// when
		Coffee coffee=cafe.brew(CoffeeType.Latte);
		
		//then
		Assert.assertEquals("Wrong Coffee Type",CoffeeType.Latte, coffee.getType());
		
	}
	
	private void withBeans() {
		cafe.restockBeans(7);
	}
	
	

}
