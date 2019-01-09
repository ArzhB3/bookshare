/**
 * 
 */
package hello.library;

import java.util.*;

/**
 * @author Aélion
 * @version 1.0.0
 *
 */
public class Authors {
	
	private String surname;
	private String firstname;
	private Date birthdate;
	
	// Constructor Authors
	
	private Authors(String surname, String firstname, Date birthdate) {
		
		this.surname = surname;
		this.firstname = firstname;
		this.birthdate = birthdate;
		
	}
	
	public static Authors getAuthors(String surname, String firstname, Date birthdate) {
		
		Date today = new Date();
				
		if (birthdate.after(today)) {
			
			System.out.println("Votre Auteur n'est pas encore né");			
			return null;
		}
		
		Authors authors = new Authors(surname, firstname, birthdate);
		return authors;
		
	}
	
	
	// SETTER
	
	public Authors surname(String surname) {
		
		this.surname = surname;
		return this;
		
	}
	
	public Authors firstname(String firstname) {
		
		this.firstname = firstname;
		return this;
		
	}

	public Authors birthdate(Date birthdate) {
		
		this.birthdate = birthdate;
		return this;
	}
	
	// GETTER
	
	public String surname() {
		
		return this.surname;
	}
	
	public String firstname() {
		
		return this.firstname;
	}

	public Date birthdate() {
	
	return this.birthdate;
	
	}

}
