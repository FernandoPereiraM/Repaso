package starchips;

public class unmannedShip extends ClasicShip{
	
	String targetToStudy;
	String fuelType;
	
	public unmannedShip() {
		
	}


	public unmannedShip(String targetToStudy, String fuelType) {
		this.targetToStudy = targetToStudy;
		this.fuelType = fuelType;
	}


	public String getTargetToStudy() {
		return targetToStudy;
	}


	public void setTargetToStudy(String targetToStudy) {
		this.targetToStudy = targetToStudy;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return " targetToStudy=" + targetToStudy + ", fuelType=" + fuelType + ", availability="
				+ availability + ", weight=" + weight + ", height=" + height + ", velocity=" + velocity + ", name="
				+ name;
	}


	@Override
	public void mission(Object ship) {
		System.out.println("------ SHIP DATA -------");
		System.out.println(ship.toString());
		System.out.println("...............");
		System.out.println("ship created and ready for take-off");
		System.out.println("...............");
		System.out.println("fiated trajectory....");
		System.out.println("in orbit!!!!");
		System.out.println("destiny confirmed...");
	}
	
	

}
