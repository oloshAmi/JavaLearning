package collect_richard;

public class PrivateCar extends Car {
private int numSeats;
	
	PrivateCar(String model,int builtYear,int gears,int numSeats){
		super(model,builtYear,gears);
		this.numSeats=numSeats;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public int getBuiltYear() {
		return this.builtYear;
	}

	@Override
	public int getNumGears() {
		return this.numGears;
	}
	
	public int getNumSeats() {
		return this.numSeats;
	}
	
	@Override
	public String toString() {
		return "PrivateCar";		
	}

}
