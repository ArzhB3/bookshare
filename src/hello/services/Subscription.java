/**
 * 
 */
package hello.services;

import hello.Renters;

/**
 * @author Aélion
 *
 */
public final class Subscription {
	
	// Déclaration du coût de la cotisation
	private final double subs= 15;
		
	// Déclaration de la TVA
	private final double vat = 1.20;
			
	// Déclaration de la remise si plus de 30 livres
	private final double discount = 0.95;
	
	// Déclaration du prix de location
	
	// 0.05€ le livre/jour
	
	// Prix total du coup de la cotisation (TTC)
	private double priceVAT;
		
	// Prix total du coup de la cotisation (HT)
	private double priceXVAT;
		
	// Nombre de livres soumis à reduction
	private final int booksNumberDiscount = 30;
	
	// Création d'user de type Users
	private Renters user;
	
	
	
	//************************************************************************************
	
	// Constructeur
	
	public Subscription(Renters usersub) {
		
		this.user = usersub;	
		
	}	
	
	// Calcul du prix de la cotisation en fonction du nombre de livres (TTC & HT)
	
	// Calcul SANS TVA avec et sans remise
	
	public double PriceXVAT() {
	
		if(user.booksNumberRenters() < booksNumberDiscount) {
		
			priceXVAT = subs;
			return priceXVAT;
		
		} else if(user.booksNumberRenters() >= booksNumberDiscount) {
		
			priceXVAT = (subs * discount);
			return priceXVAT;
		
		}
		
		return priceXVAT;
	
	}
	
	// Calcul AVEC TVA avec et sans remise
	
	public double PriceVAT() {
		
		if(user.booksNumberRenters() < booksNumberDiscount) {
			
			priceVAT = subs * vat;
			return priceVAT;
		
		} else if(user.booksNumberRenters() >= booksNumberDiscount) {
		
			priceVAT = (subs * discount) * vat;
			return priceVAT;
		
		}
		
		return priceVAT;
	}
	
}
	

