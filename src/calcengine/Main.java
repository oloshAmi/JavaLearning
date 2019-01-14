package calcengine;

public class Main {

	public static void main(String[] args) {
		MathEquation[] equations=new MathEquation[4];
		equations[0]=new MathEquation('d',100.0,50.0);
		equations[1]=new MathEquation('a',25.0,92.0);
		equations[2]=new MathEquation('s',225.0,17.0);
		equations[3]=new MathEquation('m',11.0,3.0);
		
		for(MathEquation equation:equations) {
			equation.execute();
			System.out.println("results = ");
			System.out.println(equation.getResult());
			
		}
		
		double leftDouble=9.0;
		double rightDouble=4.0;
		
		MathEquation equationOverload=new MathEquation('d');
		equationOverload.execute(leftDouble,rightDouble);
		System.out.println("results = "+equationOverload.getResult());
		
		int leftInt=9;
		int rightInt=4;
		
		equationOverload.execute(leftInt,rightInt);
		System.out.println("results = "+equationOverload.getResult());	
		
		
		System.out.println("Using Inheritence ");
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
