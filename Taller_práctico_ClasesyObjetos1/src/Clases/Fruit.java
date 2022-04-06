package Clases;

/**
 * Clase Fruit 
 * Representa un Fruta con sus caracteristicas especificas
 * 
 * @author luisp
 */
import java.util.ArrayList;

public class Fruit {

	// variables
	String name;
	private float averageWeigth;
	ArrayList<String> colors;

	// Se crea una Intancia de clase Fruit
	public Fruit() {

	}

	// Constructor
	public Fruit(String name, ArrayList<String> colors) {
		this.name = name;
		colors = new ArrayList<String>();
	}

	//Get and Setters
	public ArrayList<String> getColors() {
		return colors;
	}

	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}

	public float getAverageWeigth() {
		return averageWeigth;
	}

	public void setAverageWeigth(float averageWeigth) {
		this.averageWeigth = averageWeigth;
	}

}
