package starchips;

import behaviors.behaviorShip;

public class ClasicShip implements behaviorShip{
	boolean availability;
	int weight;
	int height;
	int velocity;
	String name;

	public ClasicShip() {

	}

	public ClasicShip(boolean availability, int weight, int height, int velocity, String name) {
		this.availability = availability;
		this.weight = weight;
		this.height = height;
		this.velocity = velocity;
		this.name = name;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "availability=" + availability + ", weight=" + weight + ", height=" + height + ", velocity="
				+ velocity + ", name=" + name ;
	}

	@Override
	public void mission(Object ship) {
		// TODO Auto-generated method stub
		System.out.println("------ SHIP DATA -------");
		System.out.println(ship.toString());
		System.out.println("...............");
		System.out.println("ship created and ready for take-off");
		System.out.println("...............");
		System.out.println("fiated trajectory....");
		System.out.println("in orbit!!!!");
	}

}
