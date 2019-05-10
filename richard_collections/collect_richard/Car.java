package collect_richard;

public abstract class Car implements Vehicle {
	protected String model;
	protected int builtYear;
	protected int numGears;	
	
	Car(String model, int builtYear, int numGears){
		this.model=model;
		this.builtYear=builtYear;
		this.numGears=numGears;		
	}
	
	Car(){
		this.model=" ";
		this.builtYear=0000;
		this.numGears=0000;
	}

}
