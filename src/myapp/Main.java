package myapp;

import calcengine.*;

public class Main {

	public static void main(String[] args) {
		//useCalculateBase();
		//useCalculateHelper();
		
		MathProcessing mathPro=new Multiplier();
		double result=mathPro.doCalculation(10, 5);
		System.out.println(result);
		
		
/*		String[] statements= {
				"add 25.0 92.0",
				"power 5.0 2.0",
				"multiply 5.0 2.0",
				"divide 5.0 2.0",
				"divide 5.0 0.0"
		};
		
		DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
				new Adder(),
				new PowerOf(),
				new Multiplier(),
				new Divider(),
				new Divider()
		});
		for(String statement:statements) {
			
			String output= helper.process(statement);
			System.out.println(output);
		}*/
	}
	static void useCalculateHelper() {
		String[] statements= {
				"add 1.0",
				"add xx 25.0",
				"addX 0.0 0.0",
				"divide 100.0 50.0",
				"add 25.0 92.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"
		};

		CalculateHelper helper=new CalculateHelper();
		for (String statement:statements) {
			try {
				helper.process(statement);
				System.out.println(helper);
			}
			catch(InvalidStatementException e){
				System.out.println(e.getMessage());
				if(e.getCause()!=null) {
					System.out.println("Original Exception: "+e.getCause().getMessage());
				}
			}
		}

	}

	static void useCalculateBase() {
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
