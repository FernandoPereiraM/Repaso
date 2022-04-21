package task5;

public class Car extends Vehicle {
	int horsePower;
	
	public Car() {
		super();
	}

	public Car(int horsePower,int passangers, int wheelNumber, Boolean engine, String enrollmentDate, String transportType) {
		super(passangers, wheelNumber, engine, enrollmentDate, transportType);
		this.horsePower = horsePower;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car [horsePower=" + horsePower + ", passangers=" + passangers + ", wheelNumber=" + wheelNumber
				+ ", engine=" + engine + ", enrollmentDate=" + enrollmentDate + ", transportType=" + transportType
				+ "]";
	}
	
}
