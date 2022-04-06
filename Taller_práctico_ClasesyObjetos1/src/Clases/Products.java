package Clases;

/**
 * Clase Procts Representa un Producto con sus caracteristicas y detalles
 * especificos
 * 
 * @author luisp
 */
public class Products {

	// variables
	String name;
	String detail;
	private String supplier;
	double price;

	// Se crea una Intancia de clase Products
	public Products() {

	}

	// Constructor
	public Products(String name, String detail, String supplier, double price) {
		this.name = name;
		this.detail = detail;
		this.supplier = supplier;
		this.price = price;
	}

	//Get and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}
