package task1;

public class play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet tierra= new Planet(5.973E24,2354,5.3E24,1, "Tierra");
		Planet luna= new Planet(7.349E22,254,5.34E24,2, "Luna");
		controlPlanet c= new controlPlanet();
		c.atractionForce(luna, tierra, 384E6);
	}

}
