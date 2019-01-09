/**
 * 
 */

package hello.users;

import java.util.ArrayList;

import hello.library.Book;
import hello.users.interfaces.RenterInterface;

/**
 * @author Dell
 *
 */

public class Renter extends User implements RenterInterface {
	
	public User toBorrower() {
		
		return new Borrower()
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
	
	// "< BLABLA >" => Est un spécifieur
	
	private ArrayList<Book> book;
	
	public Renter() {
		
		this.book = new ArrayList<Book>();
				
	}
	
	public String booksNumber() {
		
		String message = "Nombre de livres : ";
		message += this.book.size() + "\r\n";
		
		return message;
 		
	}
	
	public String booksList() {
		
		String message = "\r\nLivres de la collection de " + this.surname + " : ";
		
		// Boucle sur la collection des livres
		
		for (Book book : this.book) {
			
			message += book.title();
			
		}
		
		return message;
		
	public String booksListNum() {
		
		String message = "\r\n"
		
	}
				
	}
	
	@Override
	public User addBook(Book book) {
		// TODO Auto-generated method stub
		
		if(!this.book.contains(book)) {
			
			this.book.add(book);
			
		}		
				
		return this;
		
	}

	@Override
	public User loan(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User subsCalculation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
