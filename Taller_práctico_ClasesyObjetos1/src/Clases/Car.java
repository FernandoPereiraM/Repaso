package Clases;

/**
 * Clase Car
 * Representa un Carro con sus caracteristicas especificas
 * 
 * @author luisp
 */
public class Car {

	//Variables
	String manufacturer;
	String color;
	String model;
	protected String carPlate;

	//Se crea una Intancia de clase Car
	public Car() {
		
	}
	
	//Constructor
	public Car(String manufacturer, 
			   String color, 
			   String model, 
			   String carPlate) {
		this.manufacturer = manufacturer;
		this.color = color;
		this.model = model;
		this.carPlate = carPlate;
	}
	
	//Get and Setters
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

}
