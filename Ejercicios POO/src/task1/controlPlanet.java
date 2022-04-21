package task1;

public class controlPlanet {
	
	public void atractionForce(Planet a,Planet b, double distance) {
		double constantG =  6.673E-11;
		double newtonForce = constantG *(a.getMass() * b.getMass())/Math.pow(distance,2);
		System.out.println(newtonForce);		
	}
}
