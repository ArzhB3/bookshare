/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import hello.library.Authors;
import hello.library.Book;
import hello.services.Subscription;

/**
 * @author Aélion
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
				
		System.out.println("Hello Java\r\n");
		
		// Create Renters
				
		// Create objects Renters : user1 and user2
		
		Renters user1 = new Renters();
		Renters user2 = new Renters();
		
		// Création d'un objet Subscription pour chaque Loueur
		
		Subscription subs1 = new Subscription(user1);
		Subscription subs2 = new Subscription(user2);
		
		// Create object Users user3 and set this object Users user3
		
		Renters user3 = new Renters("James", "Bond", "007");
		
		// Set objects Users : user1 and user2
		
		user1
			.firstname("Aude")
			.surname("Vessel")
			.adherentNumber("0572291")
			.booksNumberRenters(34);
		
		user2
			.firstname("Remi")
			.surname("Fasolasido")
			.adherentNumber("8576634")
			.booksNumberRenters(17);
		
		// Display on console user1, user2 and user3
		
		System.out.println("User : " + user1.firstname() + " " + user1.surname());
		System.out.println("Adherent Number : " + user1.adherentNumber() + "\r\n");
		
		System.out.println("J'aime la musique, je suis : " + user2.firstname + " " + user2.surname + "\r\n");
		
		System.out.print("My name is : " + user3.surname() + ", ");
		System.out.println(user3.firstname() + " " + user3.surname());
		
		
		// Create objects Books : book1, book2 and book3
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		// Set objects Books : book1, book2 and book3
		
		book1
			.title("Les Mots")
			.summary("Autobiographie de Jean Paul Sartre")
			.numberPage(7);
		
		book2
			.title("Le petit bonhomme en mousse")
			.summary("L'histoire d'un petit bonhomme en mousse qui s'élance")
			.numberPage();
		
		book3
			.title("Dragon Ball")
			.summary("Sangoku, jeune homme intrépide part à la recherche des dragon balls")
			.numberPage(85);
		
		// Display number page of book1, book2 and book3
		
		System.out.println("\r\n" + book1.numberPage());
		System.out.println(book2.numberPage());
		System.out.println(book3.numberPage());
		
		// Authors create
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1905-05-21");
		
		Authors aut1 = Authors.getAuthors("Sartre", "Jean Paul", date);
				
		System.out.println("\r\nAuteur : " + aut1.surname() + "\r\n");
		
		
		
		// Arrondi à 2 chiffres après la virgule
		
		java.text.DecimalFormat round = new java.text.DecimalFormat("0.##");
		
		System.out.println(round.format(subs1.PriceXVAT())+ "\r\n");
		System.out.println(round.format(subs2.PriceXVAT())+ "\r\n");
		
		System.out.println(round.format(subs1.PriceVAT())+ "\r\n");
		System.out.println(round.format(subs2.PriceVAT())+ "\r\n");
		
		// Formulaire de demande de prix de cotisation pour quels loueur
				
		//System.out.println("Bonjour, pour quels Loueurs voulez-vous afficher le prix de la cotisation ?\r\n");
		//System.out.println(user1.surname + " " + user1.firstname + " N°: " + user1.adherentNumber);
		
		/*if(int choice = 1) {
			
			S
			
		}*/
		
		
	}

}
