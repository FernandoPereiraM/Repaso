package task4;

public class Vehicle {
	
	int passangers;
	int wheelNumber;
	String enrollmentDate;
	String transportType;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int passangers, int wheelNumber, String enrollmentDate, String transportType) {
		super();
		this.passangers = passangers;
		this.wheelNumber = wheelNumber;
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
		return "vehicle [passangers=" + passangers + ", wheelNumber=" + wheelNumber + ", enrollmentDate="
				+ enrollmentDate + ", transportType=" + transportType + "]";
	}
	
}
