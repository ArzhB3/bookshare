/**
 * 
 */
package hello.library.exceptions;

/**
 * @author A�lion
 *
 */

public class BirthdateException extends Exception {
	
	public String getMessage() {
		
		return "La date de naissance ne peut pas �tre sup�rieure � la date du jour";
	
	}
	
}
