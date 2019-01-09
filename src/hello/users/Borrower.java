/**
 * 
 */

package hello.users;

import hello.library.Book;
import hello.users.interfaces.BorrowerInterface;

/**
 * @author Aélion
 *
 */

public class Borrower extends User implements BorrowerInterface {
	
	public User toRenter() {
		
		return new Renter()
				.surname(this.surname())
				.firstname(this.firstname())
				.adherentNumber(this.adherentNumber());
		
	}
		
	public User toBorrowerRenter() {
		
		return new BorrowerRenter()
				.surname(this.surname())
				.firstname(this.firstname())
				.adherentNumber(this.adherentNumber());
		
	}
			
	@Override
	public User receipt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createBookBorrowing(Renter renter, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User returnBook(Renter renter, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
