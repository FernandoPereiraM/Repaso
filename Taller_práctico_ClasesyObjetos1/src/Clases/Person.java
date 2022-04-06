package Clases;

/**
 * Clase Person Representa un Persona con sus caracteristicas y datos especificos
 * 
 * @author luisp
 */

import java.util.Date;

public class Person {

	// Variables
	String name;
	String lastName1;
	String lastName2;
	Date dateBirth;
	Float height;

	// Se crea una Intancia de clase Person
	public Person() {

	}

	// Constructor
	public Person(String name, String lastName1, String lastName2, Date dateBirth, Float height) {
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}

	//Get and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName1() {
		return lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

}
