package task5;

public class Bike extends Vehicle {
	String bikeType;

	public Bike() {
		super();
	}

	public Bike(String bikeType,int passangers, int wheelNumber, Boolean engine, String enrollmentDate, String transportType) {
		super(passangers, wheelNumber, engine, enrollmentDate, transportType);
		this.bikeType = bikeType;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	@Override
	public String toString() {
		return "Bike [bikeType=" + bikeType + ", passangers=" + passangers + ", wheelNumber=" + wheelNumber
				+ ", enrollmentDate=" + enrollmentDate + ", transportType=" + transportType + "]";
	}
	
}
