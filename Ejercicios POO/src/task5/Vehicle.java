package task5;

public class Vehicle {
	
	int passangers;
	int wheelNumber;
	Boolean engine;
	String enrollmentDate;
	String transportType;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(int passangers, int wheelNumber, Boolean engine, String enrollmentDate, String transportType) {
		super();
		this.passangers = passangers;
		this.wheelNumber = wheelNumber;
		this.engine = engine;
		this.enrollmentDate = enrollmentDate;
		this.transportType = transportType;
	}

	public int getPassangers() {
		return passangers;
	}

	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}

	public int getWheelNumber() {
		return wheelNumber;
	}

	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	@Override
	public String toString() {
		return "Vehicle [passangers=" + passangers + ", wheelNumber=" + wheelNumber + ", engine=" + engine
				+ ", enrollmentDate=" + enrollmentDate + ", transportType=" + transportType + "]";
	}
	
}
