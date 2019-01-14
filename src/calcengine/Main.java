package calcengine;

public class Main {

	public static void main(String[] args) {
		CalculateBase[] calculators= {
				new Divider(100.0,50.0),
				new Adder(25.0,92.0),
				new Subtractor(225.0,17.0),
				new Multiplier(11.0,3.0)
		};
		for(CalculateBase calculator:calculators) {
			calculator.calculate();
			System.out.println("results = ");
			System.out.println(calculator.getResult());			
		}
	}

}
