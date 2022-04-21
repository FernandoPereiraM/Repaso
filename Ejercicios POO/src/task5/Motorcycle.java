package task5;

public class Motorcycle extends Vehicle{
	
	int cylinderCapacity;

	public Motorcycle() {
		super();
	}

	public Motorcycle(int cylinderCapacity,int passangers, int wheelNumber, Boolean engine, String enrollmentDate, String transportType) {
		super(passangers, wheelNumber, engine, enrollmentDate, transportType);
		this.cylinderCapacity = cylinderCapacity;
	}

	public int getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(int cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	@Override
	public String toString() {
		return "Motorcycle [cylinderCapacity=" + cylinderCapacity + ", passangers=" + passangers + ", wheelNumber="
				+ wheelNumber + ", engine=" + engine + ", enrollmentDate=" + enrollmentDate + ", transportType="
				+ transportType + "]";
	}

}
