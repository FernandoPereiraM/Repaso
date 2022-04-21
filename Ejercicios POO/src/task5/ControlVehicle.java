package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlVehicle {
	ArrayList<Object> vehicleArray;

	public ControlVehicle() {
		super();
		vehicleArray =  new ArrayList<Object>();
	}
	
	public void add(Vehicle e) {
		vehicleArray.add(e);	
	}
	
	public void printArray() {
		for(Object i: vehicleArray) {
			System.out.println(i.toString());
		}
	}
	
	public Boolean hasEngine(int i) {
		if(i == 1) {
			return true;
		}
		return false;
	}
	
	public String findTypeVehicle(int passangers, int wheelNumber, Boolean engine) {
		String transportType = "";
		if(passangers <= 2 && engine == true ) {
			transportType = "Motorcycle";
		}else if(passangers <= 2 && engine == false) {
			transportType = "Bike";
		}else if(passangers <= 5 && engine == true && wheelNumber == 4 ) {
			transportType = "Car";
		}else if(passangers <= 5 && engine == true && wheelNumber == 0 ) {
			transportType = "Boat";
		}else {
			transportType = "Its Not A Vehicle!!!";
		}
		return transportType;	
	}
	
	public void vehicleMenu() {
		int passangers = 0;
		int wheelNumber = 0;
		int engineOp = 0;
		int cylinderCapacity = 0;
		int horsePower = 0;
		Boolean engine = false;
		boolean boastSails = false;
		String enrollmentDate = "";
		String transportType = "";
		String bikeType ="";
		ControlVehicle m = new ControlVehicle();

		int op = 0;
		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Menu =) " + "\n" 
			              + "1. Add a new vehicle" + "\n" 
					          + "2. print array"   + "\n"  
			                           + "3. exit" + "\n");
			op  = myObj.nextInt();
			switch (op) {
			case 1:
				System.out.println("Add a Vehicle......");
				
				System.out.print("Enrollment Date = ");
				enrollmentDate = myObj.next();
				
				System.out.print("Passangers = ");
				passangers  = myObj.nextInt();
				
				System.out.print("Number of Wheels = ");
				wheelNumber  = myObj.nextInt();
				
				System.out.print("Has a engine 1= yes or 2: no = ");
				engineOp  = myObj.nextInt();
				engine = m.hasEngine(engineOp);
				
				transportType = m.findTypeVehicle(passangers, wheelNumber, engine);
				System.out.println("Transport Type = " + transportType );
				
				if(transportType.equals("Motorcycle")) {
					
					System.out.print("Cylinder Capacity = ");
					cylinderCapacity  = myObj.nextInt();
					m.add(new Motorcycle(cylinderCapacity,passangers, wheelNumber,engine,enrollmentDate, transportType));
					
				}else if(transportType.equals("Bike")) {
					
					System.out.print("Bike type = ");
					bikeType  = myObj.next();
					m.add(new Bike(bikeType,passangers, wheelNumber,engine,enrollmentDate, transportType));
					
				}else if(transportType.equals("Car")) {
					
					System.out.print("Horse Power = ");
					horsePower  = myObj.nextInt();
					m.add(new Car(horsePower,passangers, wheelNumber,engine,enrollmentDate, transportType));
					
				}else if(transportType.equals("Boat")) {
					
					System.out.print("Cylinder Capacity = ");
					boastSails  = myObj.nextBoolean();
					m.add(new Boat(boastSails,passangers, wheelNumber,engine,enrollmentDate, transportType));
					
				}else {
					
					m.add(new Vehicle(passangers, wheelNumber,engine,enrollmentDate, transportType));
				}
				
				System.out.println("--------------------------------------------");
				break;
			case 2:
				System.out.println("List......");
				System.out.println("--------------------------------------------");
				m.printArray();
				System.out.println("--------------------------------------------");
				break;
			case 3:
				System.out.println("Bye" + "\n");
				break;
			default:
				System.out.println("Type a valid option!");
				break;
			}
		} while (op != 3);
	}
}
