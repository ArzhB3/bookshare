/**
 * 
 */
package hello.users.interfaces;

import hello.library.Book;
import hello.users.User;

/**
 * @author Aélion
 *
 */

public interface RenterInterface {
	
	public User addBook(Book book);
	public User loan(Book book);
	public User subsCalculation();
	
}