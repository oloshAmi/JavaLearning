package calcengine;

public class Divider extends CalculateBase {
	public Divider() {}
	public Divider(double leftVal, double rightVal) {
		super(leftVal,rightVal);
	}
	
	@Override
	public void calculate() {
		double value=this.getRightVal()!=0?this.getLeftVal()/this.getRightVal():0.0;
		this.setResult(value);		
	}

}