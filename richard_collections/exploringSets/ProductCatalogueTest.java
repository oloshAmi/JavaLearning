package exploringSets;
import org.junit.Test;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;
import static exploringSets.ProductFixtures.*;


public class ProductCatalogueTest {
	
	@Test
	public void shouldOnlyHoldUniqueProducts() throws Exception{
		ProductCatalogue catalogue= new ProductCatalogue();
		
		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		assertThat(catalogue, containsInAnyOrder(door,floorPanel));
	}

}
