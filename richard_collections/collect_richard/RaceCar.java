package collect_richard;

public class RaceCar extends Car{
	private String trimPackage;
	
	RaceCar(String model,int builtYear,int gears,String trimPackage){
		super(model,builtYear,gears);
		this.trimPackage=trimPackage;
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
	
	public String getTrimPackage() {
		return this.trimPackage;
	}
	@Override
	public String toString() {
		return "RaceCar";
		
	}

}
