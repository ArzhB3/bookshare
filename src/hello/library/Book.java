/**
 * 
 */
package hello.library;

/**
 * @author Aélion
 *
 */
public class Book {
	
	private String title;
	private String summary;
	private int numberPage;
	
	// Définition d'une constante de classe
	// Le mot clé final interdit la modification de la valeur
	
	private final int MINIPAGE = 10;
	
	//*************************************************************************
	
	// SETTER
	
		public Book title(String title) {
			
			this.title = title;
			return this;
			
		}
		
		public Book summary(String summary) {
			
			this.summary = summary;
			return this;
			
		}
		
		public Book numberPage(int numberPage) {
			
			this.numberPage = numberPage;
			return this;
		
		}
		
		
	// GETTER
	
	public String title() {
		
		return this.title;
	}
	
	public String summary() {
		
		return this.summary;
	}

	public int numberPage() {
		
		if(numberPage < MINIPAGE) {
			
			return this.MINIPAGE;
	
		} else {
		
			return this.numberPage;
		
		}		
		
	}
	
	
}
