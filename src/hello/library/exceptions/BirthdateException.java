/**
 * 
 */
package hello.library.exceptions;

/**
 * @author Aélion
 *
 */

public class BirthdateException extends Exception {
	
	public String getMessage() {
		
		return "La date de naissance ne peut pas être supérieure à la date du jour";
	
	}
	
}
