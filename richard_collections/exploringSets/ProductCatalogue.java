package exploringSets;

import java.util.Iterator;
import java.util.*;

public class ProductCatalogue implements Iterable<Product> {
	
	private final Set<Product> products= new HashSet<>();
	public void isSuppliedBy(Supplier supplier) {
		
		products.addAll(supplier.products());
		
	}
	
	public Iterator<Product> iterator(){
		return products.iterator();
	}

}
