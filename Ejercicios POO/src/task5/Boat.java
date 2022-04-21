package task5;

public class Boat extends Vehicle {
	boolean boastSails;

	public Boat() {
		super();
	}

	public Boat(boolean boastSails,int passangers, int wheelNumber, Boolean engine, String enrollmentDate, String transportType) {
		super(passangers, wheelNumber, engine, enrollmentDate, transportType);
		this.boastSails = boastSails;
	}

	public boolean isBoastSails() {
		return boastSails;
	}

	public void setBoastSails(boolean boastSails) {
		this.boastSails = boastSails;
	}

	@Override
	public String toString() {
		return "Boat [boastSails=" + boastSails + ", passangers=" + passangers + ", engine=" + engine
				+ ", enrollmentDate=" + enrollmentDate + ", transportType=" + transportType + "]";
	}

}
