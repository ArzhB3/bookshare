/**
 * 
 */
package hello.users;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date; 

import hello.library.Authors;
import hello.library.Book;
import hello.library.exceptions.BirthdateException;
import hello.tools.AuthorImport;

/**
 * @author Dell
 *
 */
public class CreateUser {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws BirthdateException 
	 */
	
	private static ArrayList<Authors> listAuthor; 
	
	public static void main(String[] args) throws ParseException, BirthdateException {
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
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.title("Oui oui au marché")
			.summary("Oui oui part acheter des légumes frais")
			.numberPage(15);
		
		book2.title("Les Mots")
			.summary("Autobiographie de Jean Paul Sartre")
			.numberPage(205);
		
		book3.title("Dragon Ball")
			.summary("L'épopée de Sangoku")
			.numberPage(70);
		
		((Renter) renter)
			.addBook(book1);
		((Renter) renter)
			.addBook(book1);
		((Renter) renter)
			.addBook(book1);
		((Renter) renter)
			.addBook(book2);
		((Renter) renter)
			.addBook(book2);
		((Renter) renter)
			.addBook(book3);
		
		System.out.println(((Renter) renter).booksNumber());
		System.out.println(((Renter) renter).booksList());
		
		// Create Authors
		
		// Cas 1 : à la main		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1905-05-21");
		Authors aut1 = Authors.getAuthors("Sartre", "Jean Paul", date);
				
		// Cas 2 : par console
		//Authors aut2 = Authors.getAuthors();
		
		System.out.println(aut1.firstname() + " " + aut1.surname() + " Né le : " + aut1.birthdate());					
		//System.out.println(aut2.firstname() + " " + aut2.surname() + " Né le : " + aut2.birthdate());
		
		// Use case 2
		
		/*try {
			
			Authors aut3 = Authors.getAuthors();
			
		} catch(ParseException parseException) {
			
			System.out.println("La date de naissance est incorrecte");
			System.out.println(parseException.getMessage());
			
		} catch(BirthdateException birthdate) {
			
			System.out.println(birthdate.getMessage());
			
		}*/
		
		// Créer les auteurs à partir d'un fichier existant, délimité
		AuthorImport autList = new AuthorImport();
		
		// Récupérer la liste des auteurs
		ArrayList<String[]> autImp = autList.getAuthors();
		
		// Boucler sur la liste des auteurs
		
		for (String[] oneAuthor : autImp) {
			
			try {
				
				SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
				Date date2 = format2.parse(oneAuthor[2]);
				listAuthor.add(Authors.getAuthors(oneAuthor[0], oneAuthor[1], date2));
				
				
				
			} catch(Exception e) {
				
			}
		
		}
		
	}
	
		// Create Users
	
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
