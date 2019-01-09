/**
 * 
 */
package hello;

/**
 * @author Aélion
 * @version 1.0.0
 *
 */
abstract public class User {
	
	protected String surname;
	protected String firstname;
	protected String adherentNumber;
	
	// Nombre de livres du loueur
	protected int booksNumberRenters;	
	
	//********************************************************************
	
	/**
	 * Constructeur d'une classe Java
	 * Porte le nom de la classe
	 */
	public User() {
		
			System.out.println("Je suis le constructeur Users\r\n");
					
	}
	
	public User(String firstname, String surname, String adherentNumber) {
		
		this.firstname = firstname;
		this.surname = surname;
		this.adherentNumber = adherentNumber;
		
	}
	
	// Fin du constructeur
	
	// ********************************************************************
	
	// SETTER NB LIVRES LOUEUR
	
	public User booksNumberRenters(int booksNumberRenters) {
			
		this.booksNumberRenters = booksNumberRenters;
		return this;
			
	}
		
	// GETTER NB LIVRES LOUEUR
		
	public int booksNumberRenters() {

		return this.booksNumberRenters;
		
	}
	
	// SETTER
	
	public final User surname(String surname) {
		
		this.surname = surname;
		return this;
		
	}
	
	public final User firstname(String firstname) {
		
		this.firstname = firstname;
		return this;
		
	}
	
	public final User adherentNumber(String adherentNumber) {
		
		this.adherentNumber = adherentNumber;
		return this;
	
	}
	
	// GETTER
	
	public String surname() {
		
		return this.surname;
		
	}
	
	public String firstname() {
		
		return this.firstname;
		
	}
	
	public String adherentNumber() {
		
		return this.adherentNumber;
		
	}
	
	
		
}
