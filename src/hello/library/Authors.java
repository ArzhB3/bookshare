/**
 * 
 */
package hello.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import hello.library.exceptions.BirthdateException;

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
	
	public static Authors getAuthors(String surname, String firstname, Date birthdate) throws BirthdateException {
		
		Date today = new Date();
				
		if (birthdate.after(today)) {
			
			throw new BirthdateException();
		}
		
		Authors authors = new Authors(surname, firstname, birthdate);
		return authors;
		
	}
	
	public static Authors getAuthors() throws ParseException, BirthdateException {
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Nom de l'auteur : ");
		String surname = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Prénom de l'auteur : ");
		String firstname = scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("Date de naissance : ");
		String birthdate = scanner.nextLine();
		scanner.nextLine();
		scanner.close();
		
		// Convertir la chaine en date
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		Date date = format.parse(birthdate);
		
		return getAuthors(surname, firstname, date);
		
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
