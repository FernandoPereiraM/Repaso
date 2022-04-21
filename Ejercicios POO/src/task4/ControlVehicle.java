package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlVehicle {
	ArrayList<Vehicle> vehicleArray;

	public ControlVehicle() {
		super();
		vehicleArray =  new ArrayList<Vehicle>();
	}
	
	public void add(Vehicle e) {
		vehicleArray.add(e);	
	}
	
	public void printArray() {
		for(Vehicle i: vehicleArray) {
			System.out.println(i.toString());
		}
	}
	
	public void vehicleMenu() {
		int passangers = 0;
		int wheelNumber = 0;
		String enrollmentDate = "";
		String transportType = "";
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
				
				System.out.print("Transport Type = ");
				transportType = myObj.next();
				
				System.out.print("Passangers = ");
				passangers  = myObj.nextInt();
				
				System.out.print("Number of Wheels = ");
				wheelNumber  = myObj.nextInt();
				
				m.add(new Vehicle(passangers, wheelNumber, enrollmentDate, transportType));
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
