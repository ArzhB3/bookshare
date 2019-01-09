/**
 * 
 */
package hello.users;

/**
 * @author Dell
 *
 */

abstract public class User {
	
	protected String surname;
	protected String firstname;
	protected String adherentNumber;
	
	// ATTRIBUTE SETTER
	
	// SURNAME	
	public User surname(String surname) {
		
		this.surname = surname;
		return this;
		
	}
	
	// FIRSTNAME
	public User firstname(String firstname) {
		
		this.firstname = firstname;
		return this;
		
	}
	
	// ADHERENT NUMBER	
	public User adherentNumber(String adherentNumber) {
		
		this.adherentNumber = adherentNumber;
		return this;
		
	}
	
	// ATTRIBUTE GETTER
	
	// SURNAME	
	public String surname() {
		
		return this.surname;
				
	}
	
	// FIRSTNAME	
	public String firstname() {
		
		return this.firstname;
		
	}
	
	// ADHERENT NUMBER	
	public String adherentNumber() {
		
		return this.adherentNumber;
		
	}
	
}
