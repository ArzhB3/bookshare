/**
 * 
 */

package hello.users.interfaces;

import hello.library.Book;
import hello.users.Renter;
import hello.users.User;

/**
 * @author Aélion
 *
 */

public interface BorrowerInterface {
	
	public User receipt();
	public User createBookBorrowing(Renter renter, Book book);
	public User returnBook(Renter renter, Book book);
	
	public User  toRenter();
	
}
