package exploringLists;
import java.util.*;
public class Product {
	
	//Study Generics to understand this
	public static final Comparator<Product> BY_WEIGHT
		=Comparator.comparing(Product::getWeight);
	
	private final String name;
	private final int weight;
	
	public Product(String name, int weight) {
		this.name=name;
		this.weight=weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return "Product{" +
				"name='"+this.name+'\''+
				",weight=" + weight +
				"}";
	}
	

}
