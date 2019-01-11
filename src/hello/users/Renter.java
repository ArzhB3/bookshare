/**
 * 
 */

package hello.users;

import java.util.*;
import java.util.Map.Entry;

import hello.library.Book;
import hello.users.interfaces.RenterInterface;

// Interface Fonctionnelle
interface GetSize {
	
	public int getSize(HashMap<Book, Integer> Book, boolean getStock);
	
}


/**
 * @author Dell
 *
 */

public class Renter extends User implements RenterInterface {
	
	private HashMap<Book, Integer> book;
	
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
	
	public Renter() {
		
		// Instancie l'objet HashMap, proprement dit
		this.book = new HashMap<Book, Integer>();
				
	}
	
	public String booksNumber() {
		
		String message = "\nNombre de livres : ";
		message += this.book.size() + "\n";
		
		return message;
 		
	}
	
	public String booksList() {
		
        String message = "Livres de la collection de " + this.surname + " : \n\n";
        Set <Entry<Book, Integer>> entries = this.book.entrySet();
        Iterator <Entry<Book, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
        	
            Map.Entry<Book, Integer> entry = iterator.next();
            Book book = entry.getKey();
            Integer bookNumber = entry.getValue();
            message += book.title() + " (" + bookNumber + ")\n";
            
        }
        
        return message;
    }
	
	/*public String listBooks() {
        String message = "Livres de la collection de " + this.prenom + " " + this.nom + "\n";

        // Boucle sur la collection des livres
        for (Livre livre : this.books.keySet()) {
            message += livre.titre() + ", qte : " + this.books.get(livre) + "\n";
        }
        return message;
    }*/
	
	/*
	4eme methode pour le listbooks (avec message 2 définit en Attribut classe String message2;
	message2 = "Livres de la collection de " + this.nom + "\n";
	this.books2.forEach((k,v) -> message2 += "livres    " +k.titre() + "  quantite     " +v +"\n");
	         */
	         
	public int getCollectionSize(boolean asStock) {
		
		GetSize size = (collection, getStock) -> {
			
			if (!getStock) {
				
				return collection.size();
				
			} else {
				
				int stock = 0;
				for (Book book : collection.keySet()) {
					
					stock += collection.get(book);
					
				}
			
				return stock;
				
			}
			
		};
		
		return size.getSize(this.book, asStock);
		
	}
	
	@Override
	public User addBook(Book book) {
		// TODO Auto-generated method stub
		
		if (this.book.containsKey(book)) {
			
			Integer oldValue = this.book.get(book);
			this.book.replace(book, ++ oldValue);
						
		} else {
			
			this.book.put(book, 1);
			
		}
		
		return this;
		
	}

	@Override
	public User loan(Book book) {
		// TODO Auto-generated method stub
		
		if (this.book.containsKey(book) && (this.book.get(book) > 0)) {
			
				String message = "Le livre " + this.book + " de la collection de " + this.surname + "est disponible";
				Integer oldValue = this.book.get(book);
				this.book.replace(book, -- oldValue);
							
			}				
		
		String message = "Le livre " + this.book + " de la collection de " + this.surname + "n'est pas disponible";
		return this;
	
		}
		

	@Override
	public User subsCalculation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
