package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String resultat="[";
		for(int i = 0; i < tabell.length; i++) {
			if(i == 0) {
				resultat += tabell[i];
			} else {
				resultat += "," + tabell[i];
			}
		}
		resultat += "]";
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		// for-metoden
//		int sum = 0;
//		for(int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}
//		return sum;
		
		// while-metoden
//		int sum = 0;
//		int i = 0;
//		while(i < tabell.length) {
//			sum += tabell[i];
//			i++;
//		}
//		return sum;
		
		//utvidet for-metoden
		int sum = 0;
		for(int verdi: tabell) {
			sum += verdi;
		}
		return sum;
	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int[] omvendtTabell = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			int nyIndeks = tabell.length - i - 1;
			omvendtTabell[nyIndeks] = tabell[i];
		}
		return omvendtTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] >= tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensattTabell = new int[tabell1.length + tabell2.length];
		for(int i = 0; i < tabell1.length; i++) {
			sammensattTabell[i] = tabell1[i];
		}
		for(int i = 0; i < tabell2.length; i++) {
			sammensattTabell[i + tabell1.length] = tabell2[i];
		}
		return sammensattTabell;
	}
}
