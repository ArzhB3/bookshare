/**
 * 
 */
package hello.users;

import hello.library.Book;
import hello.users.interfaces.BorrowerInterface;
import hello.users.interfaces.RenterInterface;

/**
 * @author Dell
 *
 */
public class BorrowerRenter extends User implements BorrowerInterface, RenterInterface {
	
	public User toBorrower() {
		
		return new Borrower()
				.surname(this.surname())
				.firstname(this.firstname())
				.adherentNumber(this.adherentNumber());
		
	}
		
	public User toRenter() {
		
		return new Renter()
				.surname(this.surname())
				.firstname(this.firstname())
				.adherentNumber(this.adherentNumber());
		
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.RenterInterface#addBook(hello.library.Book)
	 */
	@Override
	public User addBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.RenterInterface#loan(hello.library.Book)
	 */
	@Override
	public User loan(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.RenterInterface#subsCalculation()
	 */
	@Override
	public User subsCalculation() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.BorrowerInterface#receipt()
	 */
	@Override
	public User receipt() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.BorrowerInterface#createBookBorrowing(hello.users.Renter, hello.library.Book)
	 */
	@Override
	public User createBookBorrowing(Renter renter, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see hello.users.interfaces.BorrowerInterface#returnBook(hello.users.Renter, hello.library.Book)
	 */
	@Override
	public User returnBook(Renter renter, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
