
import java.util.ArrayList;

public class TP4Exo {
	public static void main(String[] argv) {
		int taille, i;
		
		ArrayList<String> alChaines;
		alChaines = new ArrayList<String>();
		
		alChaines.add("Savanier");
		alChaines.add("Chotard");
		alChaines.add("Fayad");
		alChaines.add("Tamari");
		alChaines.add("Nordin");
		
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : " + taille);
		
		for(i = 0; i < taille; i++) {
			System.out.println("Element n�" + i + " : " + alChaines.get(i));
		}
		
		alChaines.add("Lecomte");
		System.out.println("Taille de l'ArrayList : " + alChaines.size());
		alChaines.set(3, "Akor");
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : " + taille);
		
		for(i = 0; i < taille; i++) {
			System.out.println("Element n�" + i + " : " + alChaines.get(i));
		}
		
		for(i = 0; i < 25; i++) {
			alChaines.add("chaine "+ i);
		}
		
		for ( String s : alChaines ) {
			System.out.println( s.toUpperCase() + " lg : " + s.length() );
		}
		
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : "+ taille);
		for(i = 0; i < taille; i++) {
			System.out.println("Element n�" + i + " : " + alChaines.get(i));
		}
		
		alChaines.set(15, "Gueguin");
	    alChaines.set(16, "Omeragic");
		
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : "+ taille);
		for(i = 0; i < taille; i++) {
			System.out.println("Element n�" + i + " : " + alChaines.get(i));
		}
		
		System.out.println(alChaines.toString());
		
		alChaines.remove(17);
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : "+ taille);
		
		alChaines.remove(18);
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : "+ taille);
		
		alChaines.clear();
		taille = alChaines.size();
		System.out.println("Taille de l'ArrayList : "+ taille);
		for(i = 0; i < taille; i++) {
			System.out.println("Element n�" + i + " : " + alChaines.get(i));
		}
		
	}
}