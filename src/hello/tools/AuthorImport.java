/**
 * 
 */
package hello.tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aélion
 *
 */

public class AuthorImport {

	/**
	 * 
	 */
	
	private File authorFile;
	private static final String FIELD_SEP = ";";
	private ArrayList<String[]> author;
	
	// TODO Savoir si oui ou non ENTETE
	
	public AuthorImport() {
		
		// Instancier le ArrayList
		this.author = new ArrayList<String[]>();
		
		// Instancier la classe File donc... créer l'objet authorFile
		this.authorFile = new File("c:\\workspace\\authorslist.csv");
		
		if (this.authorFile.exists()) {
			
			if(authorFile.canRead()) {
				
				this.process();
				// On vérifie le fonctionnement avec un System out
				//System.out.println("C'est ok, le fichier est là !");
				
			} else {
				
				System.out.println("Nope !");
				
			}
			
		} else {
			
			System.out.println("J'ai pas de fichier");
			
		}
		
	}
	
	public ArrayList<String[]> getAuthors() {
		
		return this.author;
		
	}
	
	private void process() {
	
		try {
		
			Scanner fileScanner = new Scanner(this.authorFile);
			
			int rowCount = 0;
			
			while(fileScanner.hasNext()) {
				
				String row = fileScanner.nextLine();
								
				if (rowCount > 0) {
				
					// On doit parser row....
					String[] col = row.split(AuthorImport.FIELD_SEP);
					
					// On doit ranger le tableau dans un ArrayList
					this.author.add(col);					
					
					// Vérifie que le split fonctionne
					
					String message = "";
										
					for (int i=0; i < col.length; i++) {
						
						message += col[i] + " ";
						
					}
				
					message += "\n";
					System.out.println(message);
										
				}
				
				rowCount++;
				
			}
			
			fileScanner.close();
			
		} catch (IOException ioe) {
			
						
			
		}
			
	}
	

}
