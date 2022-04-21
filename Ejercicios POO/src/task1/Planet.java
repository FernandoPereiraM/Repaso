package task1;

public class Planet {
	
	double mass;
	double density;
	double sunDistance;
	int planetId;
	String name;
	
	public Planet() {
		super();
	}

	public Planet(double mass, double density, double sunDistance, int planetId, String name) {
		super();
		this.mass = mass;
		this.density = density;
		this.sunDistance = sunDistance;
		this.planetId = planetId;
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}

	public double getSunDistance() {
		return sunDistance;
	}

	public void setSunDistance(double sunDistance) {
		this.sunDistance = sunDistance;
	}

	public int getPlanetId() {
		return planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
