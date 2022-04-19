package main;

import java.util.Scanner;

import starchips.ClasicShip;
import starchips.LaunchingShip;
import starchips.mannedShip;
import starchips.unmannedShip;

public class ShipBuilder {

	public static void main(String[] args) {
		int opcion = 0;
		String name = "";
		String missionName = "";
		String fuelType = "";
		String target = "";
		int height = 0;
		int weight = 0;
		int velocity = 0;
		int crewMenbers = 0;
		int capacity = 0;

		do {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Ship Builder =) " + "\n" + "1. Clasic Ship model 1999" + "\n"
					+ "2. Launching Ship model 2009" + "\n" + "3.   manned  Ship model 2019" + "\n"
					+ "4. unmanned  Ship model 2022" + "\n" + "5.   Exit" + "\n" + "type the option:  " + "\n");
			opcion = myObj.nextInt();
			
			switch (opcion) {
			case 1: {
				System.out.println("Clasic Ship model 1999.");
				ClasicShip cship = new ClasicShip();

				System.out.println("Clasic Ship name: ");
				name = myObj.next();
				cship.setName(name);

				cship.setAvailability(true);

				System.out.println("Clasic Ship height: ");
				height = myObj.nextInt();
				cship.setHeight(height);

				System.out.println("Clasic Ship weight: ");
				weight = myObj.nextInt();
				cship.setWeight(weight);

				System.out.println("Clasic Ship estimated velocity: ");
				velocity = myObj.nextInt();
				cship.setVelocity(velocity);

				System.out.println("------ SHIP DATA -------");
				cship.mission(cship);
				System.out.println("     ");
				break;

			}
			case 2: {
				System.out.println("Launching Ship model 2009.");
				LaunchingShip lship = new LaunchingShip();

				System.out.println("Launching Ship name: ");
				name = myObj.next();
				lship.setName(name);

				lship.setAvailability(true);

				System.out.println("Launching Ship height: ");
				height = myObj.nextInt();
				lship.setHeight(height);

				System.out.println("Launching Ship weight: ");
				weight = myObj.nextInt();
				lship.setWeight(weight);

				System.out.println("Launching Ship estimated velocity: ");
				velocity = myObj.nextInt();
				lship.setVelocity(velocity);

				System.out.println("Launching Ship Crew menbers: ");
				crewMenbers = myObj.nextInt();
				lship.setCrewMenbers(crewMenbers);

				System.out.println("Launching Ship Capacity: ");
				capacity = myObj.nextInt();
				lship.setCapacity(capacity);

				lship.mission(lship);
				System.out.println("     ");
				break;

			}
			case 3: {
				System.out.println("Manned Ship model 2019.");
				mannedShip mship = new mannedShip();

				System.out.println("Manned Ship name: ");
				name = myObj.next();
				mship.setName(name);

				mship.setAvailability(true);

				System.out.println("Manned Ship height: ");
				height = myObj.nextInt();
				mship.setHeight(height);

				System.out.println("Manned Ship weight: ");
				weight = myObj.nextInt();
				mship.setWeight(weight);

				System.out.println("Manned Ship estimated velocity: ");
				velocity = myObj.nextInt();
				mship.setVelocity(velocity);

				System.out.println("Manned Ship Crew menbers: ");
				crewMenbers = myObj.nextInt();
				mship.setCrewMenbers(crewMenbers);

				System.out.println("Manned Ship Mission name: ");
				missionName = myObj.next();
				mship.setMissionName(missionName);

				mship.mission(mship);
				System.out.println("     ");
				break;

			}
			case 4: {
				System.out.println("unmanned Ship model 2022.");
				unmannedShip umship = new unmannedShip();

				System.out.println("Manned Ship name: ");
				name = myObj.next();
				umship.setName("Test");

				umship.setAvailability(true);

				System.out.println("Manned Ship height: ");
				height = myObj.nextInt();
				umship.setHeight(height);

				System.out.println("Manned Ship weight: ");
				weight = myObj.nextInt();
				umship.setWeight(weight);

				System.out.println("Manned Ship estimated velocity: ");
				velocity = myObj.nextInt();
				umship.setVelocity(velocity);

				System.out.println("Manned Ship estimated velocity: ");
				fuelType = myObj.next();
				umship.setFuelType(fuelType);

				System.out.println("Manned Ship estimated velocity: ");
				target = myObj.next();
				umship.setTargetToStudy(target);

				umship.mission(umship);
				System.out.println("     ");
				break;
			}
			case 5: {

				System.out.println("Exiting The ShipBuilder");
				break;

			}

			default: {

				System.out.println("Opcion incorrecta");

			}

			}

		} while (opcion != 5);
	}

}
