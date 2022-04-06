package Clases;
/**
 * Clase BankAccount
 * Representa una cuenta de banco con su numero de cuenta y si esta activa
 * 
 * @author luisp
 */
public class BankAccount {
	
	//Variables
	private int accountNumber;
	protected boolean activated;
	
	
	//Se crea una Intancia de clase BankAccount
	public BankAccount() {
		
	}

	//Constructor
	public BankAccount(int accountNumber, boolean activated) {
		this.accountNumber = accountNumber;
		this.activated = activated;
	}
	
	//Get and Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	

}
