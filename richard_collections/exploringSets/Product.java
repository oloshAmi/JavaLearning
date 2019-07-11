package exploringSets;
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

	@Override
	public int hashCode() {
		return Objects.hash(name,weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	

}
