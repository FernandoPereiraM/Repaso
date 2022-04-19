package starchips;

public class LaunchingShip extends ClasicShip{
	
	int capacity;
	int crewMenbers;
	
	public LaunchingShip() {
		super();
	}


	public LaunchingShip(int capacity, int crewMenbers) {
		super();
		this.capacity = capacity;
		this.crewMenbers = crewMenbers;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public int getCrewMenbers() {
		return crewMenbers;
	}


	public void setCrewMenbers(int crewMenbers) {
		this.crewMenbers = crewMenbers;
	}

	@Override
	public String toString() {
		return " capacity=" + capacity + ", crewMenbers=" + crewMenbers + ", availability=" + availability
				+ ", weight=" + weight + ", height=" + height + ", velocity=" + velocity + ", name=" + name;
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
		System.out.println("unloading cargo.......");
		
	}
	
	

}
