package collect_richard;
import java.util.*;
public class Main {

	public static void main(String[] args) {	
		Collection<Vehicle> vehicles=new ArrayList<>();
		for(int i=0;i<10;i++) {
			vehicles.add(new RaceCar("Porsche",2010+i,8,"R-Design"));
			vehicles.add(new PrivateCar("Volvo",2010+i,8,5));
		}
		
		final Iterator<Vehicle> vehicleIterator=vehicles.iterator();
		
		while(vehicleIterator.hasNext()) {
			Vehicle v=vehicleIterator.next();
			
			if(v instanceof RaceCar) {
				System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((RaceCar)v).getTrimPackage());
				}
			if(v instanceof PrivateCar) {
				System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((PrivateCar)v).getNumSeats());
				}		
			
		}
		
		/*
		Collection<Vehicle> vehicles=new ArrayList<>();
		for(int i=0;i<10;i++) {
			vehicles.add(new RaceCar("Porsche",2010+i,8,"R-Design"));
			vehicles.add(new PrivateCar("Volvo",2010+i,8,5));
		}
		
		//Exactly same as iterator, the manual stuff is done underhood!!
		for(Vehicle v:vehicles){
			if(v instanceof RaceCar) {
				System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((RaceCar)v).getTrimPackage());
				}
			if(v instanceof PrivateCar) {
				System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((PrivateCar)v).getNumSeats());
				}		
			
		}
		
		vehicles.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.getClass()));
		
		Collection<Vehicle> fleet=new LinkedList<>();
		//The below is possible because both ArrayList and LinkedList is an implementation of Collection interface,switching between them is easy
		//Reason is to take advantages of each implementation
		
		fleet=vehicles;
		//fleet.addAll(vehicles); Also works
		
		System.out.println("Printing Linked List Now\n==========================\n");
		fleet.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.toString()));
		
		Collection<Vehicle> fleetSet=new HashSet<>();
		fleetSet=fleet;
		//fleetSet.addAll(fleet);
		
		System.out.println("Printing Set Now\n==========================\n");
		fleetSet.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.toString()));
		
		System.out.println("\nUsing Default Printers now\n==========================\n");
		System.out.println(vehicles);*/
	/*
	List<Vehicle> vehicles=new ArrayList<>();
	for(int i=0;i<10;i++) {
		vehicles.add(new RaceCar("Porsche",2010+i,8,"R-Design"));
		vehicles.add(new PrivateCar("Volvo",2010+i,8,5));
	}
	
	for(Vehicle v:vehicles){
		if(v instanceof RaceCar) {
			System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((RaceCar)v).getTrimPackage());
			}
		if(v instanceof PrivateCar) {
			System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+ ((PrivateCar)v).getNumSeats());
			}		
		
	}
	
	vehicles.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.getClass()));
	
	List<Vehicle> fleet=new LinkedList<>();
	//The below is possible because both ArrayList and LinkedList is an implementation of List interface,switching between them is easy
	//Reason is to take advantages of each implementation
	
	fleet=vehicles;
	//fleet.addAll(vehicles); Also works
	
	System.out.println("Printing Linked List Now\n==========================\n");
	fleet.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.toString()));
	
	Set<Vehicle> fleetSet=new HashSet<>();
	//fleetSet=fleet; //Doesn't work, Set and List are from different interfacr
	fleetSet.addAll(fleet);
	
	System.out.println("Printing Set Now\n==========================\n");
	fleetSet.forEach(v-> System.out.println(v.getModel()+" "+v.getBuiltYear()+" "+v.toString()));
	*/
	
	}	

}
