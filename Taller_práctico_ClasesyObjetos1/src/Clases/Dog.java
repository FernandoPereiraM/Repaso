package Clases;

/**
 * Clase Dog Representa un Perro con sus caracteristicas especificas
 * 
 * @author luisp
 */
public class Dog {

	// Variables
	String name;
	String race;
	int age;

	// Se crea una Intancia de clase Dog
	public Dog() {

	}

	// Constructor
	public Dog(String name, String race, int age) {
		this.name = name;
		this.race = race;
		this.age = age;
	}

	//Get and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
