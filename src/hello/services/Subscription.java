/**
 * 
 */
package hello.services;

import hello.Renters;

/**
 * @author A�lion
 *
 */
public final class Subscription {
	
	// D�claration du co�t de la cotisation
	private final double subs= 15;
		
	// D�claration de la TVA
	private final double vat = 1.20;
			
	// D�claration de la remise si plus de 30 livres
	private final double discount = 0.95;
	
	// D�claration du prix de location
	
	// 0.05� le livre/jour
	
	// Prix total du coup de la cotisation (TTC)
	private double priceVAT;
		
	// Prix total du coup de la cotisation (HT)
	private double priceXVAT;
		
	// Nombre de livres soumis � reduction
	private final int booksNumberDiscount = 30;
	
	// Cr�ation d'user de type Users
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
	

