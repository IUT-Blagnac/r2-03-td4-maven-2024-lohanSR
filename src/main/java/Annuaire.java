

import java.util.HashMap;
import java.util.Scanner;
public class Annuaire {

	public static void main(String[] args) {
		String choix;
		Scanner clavier;
		HashMap<String, String> annuaire;

		clavier = new Scanner(System.in);
		annuaire = new HashMap<String, String>();

		annuaire.put("Albert", "06.45.32.98.45");
		annuaire.put("Michael", "06.78.45.12.65");
		annuaire.put("Tartuffe", "07.85.25.14.96");
		annuaire.put("Vivagel", "05.31.85.15.95");

		do {
			System.out.println("\nA (Ajouter une personne) - C (Consulter l'annuaire) - V (Voir tout Vl'annuaire) - Q (Quitter)");
			choix = clavier.next();
			System.out.println();
			choix = choix.toUpperCase();
			switch (choix) {
			case "A":
				Annuaire.ajouterEntreeAnnuaire(annuaire, clavier);
				break;
			case "C":
				Annuaire.consulterAnnuaire(annuaire, clavier);
				break;
			case "V":
				Annuaire.voirToutLAnnuaire(annuaire);
				break;
			case "Q":
				break;
			default:
				System.out.println("\n\nMauvais Choix ...\n\n");
			}
		} while (! choix.equals("Q"));
		System.out.println("Bye bye ...");
	}

	/**
	 * Voir l'annuaire : afficher � l'�cran le contenu de l'annuaire (une ligne de code ...).
	 * @param pfAnnuaire annuaire � afficher
	 */
	private static void voirToutLAnnuaire(HashMap<String, String> pfAnnuaire) {
		System.out.println(pfAnnuaire);
	}

	/**
	 * Consulter l'annuaire : saisir un nom et afficher : le num�ro de t�l�phone s'il est trouv�, le message "absent de l'annuaire" sinon.
	 * @param pfAnnuaire l'annuaire o� chercher le num�ro
	 * @param pfClavier le scanner (branch� au clavier) pour faire la saisie du nom
	 */
	private static void consulterAnnuaire(HashMap<String, String> pfAnnuaire,   Scanner pfClavier) {
		System.out.print("Saisir le nom de la personne o� chercher le num�ro --> ");
		String nom = pfClavier.next();
		String num = pfAnnuaire.get(nom);
		if(num != null) {
			System.out.println("Le num�ro de t�l�phone de " + nom + " : " + num);
		} else {
			System.out.println(nom + " n'est pas enregistr� dans l'annuaire");
		}
	}

	/**
	 * Ajouter dans l'annuaire : saisir un nom et un num�ro de t�l�phone,
	 * 		ajouter le nom et le num�ro � l'annuaire
	 * 		et afficher un message : l'�ventuel ancien num�ro s'il existait, afficher "Ajout�" si l'ancien num�ro n'existe pas (nouveau nom).
	 * @param pfAnnuaire l'annuaire o� ajouter le nom et le num�ro
	 * @param pfClavier le scanner (branch� au clavier) pour faire la saisie du nom et du t�l�phone
	 */
	private static void ajouterEntreeAnnuaire(HashMap<String, String> pfAnnuaire,   Scanner pfClavier) {
		System.out.print("Saisir le nom de la personne � ajouter --> ");
		String nom = pfClavier.next();
		System.out.println("Saisir le num�ro de la personne --> ");
		String num = pfClavier.next();
		
		String ajout = pfAnnuaire.put(nom, num);
		if(ajout != null) {
			System.out.println("L'ancien num�ro de " + nom + " : " + ajout);
		} else {
			System.out.println("Ajout�");
		}
	}
}