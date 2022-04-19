package starchips;

public class mannedShip extends ClasicShip {
	int crewMenbers;
	String missionName;

	public mannedShip() {
		super();
	}

	public mannedShip(int crewMenbers, String missionName) {
		super();
		this.crewMenbers = crewMenbers;
		this.missionName = missionName;
	}

	public int getCrewMenbers() {
		return crewMenbers;
	}

	public void setCrewMenbers(int crewMenbers) {
		this.crewMenbers = crewMenbers;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	@Override
	public String toString() {
		return "crewMenbers=" + crewMenbers + ", missionName=" + missionName + ", availability=" + availability
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
		System.out.println("repair work initiated.......");
	}

}
