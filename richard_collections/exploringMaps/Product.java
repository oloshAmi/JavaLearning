package exploringMaps;
import java.util.*;
public class Product {
	
	//Study Generics to understand this
	public static final Comparator<Product> BY_NAME=Comparator.comparing(Product::getName);
	public static final Comparator<Product> BY_WEIGHT
		=Comparator.comparing(Product::getWeight);
	
	private final int id;
	private final String name;
	private final int weight;
	
	public Product(int id,String name, int weight) {
		this.id=id;
		this.name=name;
		this.weight=weight;
	}
	public int getId() {
		return this.id;
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
				"id='"+this.id+'\''+
				"name='"+this.name+'\''+
				",weight=" + weight +
				"}";
	}
	

}
