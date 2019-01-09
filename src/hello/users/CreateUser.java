/**
 * 
 */
package hello.users;

import hello.library.Book;

/**
 * @author Dell
 *
 */
public class CreateUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User renter = CreateUser.createRenter();
		User borrower = createBorrower();
		User borrowerRenter = createBorrowerRenter();
		
		if (renter instanceof Renter) {
			
			System.out.println(renter.surname() + " est un loueur.");
			
		} 
		
		if (borrower instanceof Renter) {
			
			System.out.println(borrower.surname() + " est un loueur.");
			
		} else {
			
			System.out.println(borrower.surname() + " n'est pas un loueur.");
			
		}
		
		if (borrowerRenter instanceof BorrowerRenter) {
			
			System.out.println(borrowerRenter.surname() + " est un emprunteur & loueur.");
			
		}
			
		// Create book
		
		Book book1 = new Book();
		
		book1.title("Oui oui au marché")
			.summary("Oui oui part acheter des légumes frais")
			.numberPage(15);
		
		((Renter) renter)
			.addBook(book1);
		((Renter) renter)
			.addBook(book1);
		
		System.out.println(((Renter) renter).booksNumber());
		System.out.println(((Renter) renter).booksList());
			
	}
	
		private static User createRenter() {
		
			return new Renter()
					.surname("Talaron")
					.firstname("Delphine")
					.adherentNumber("00127845");
		}

		private static User createBorrower() {
		
			return new Borrower()
					.surname("Talut")
					.firstname("Jean")
					.adherentNumber("00951753");	
		
		}
	
		private static User createBorrowerRenter() {
		
			return new BorrowerRenter()
					.surname("Fauvier")
					.firstname("Régis")
					.adherentNumber("39718264");
				
		}
}
