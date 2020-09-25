package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int j = 0; j < matrise.length; j++) {
			for(int i = 0; i < matrise[j].length; i++) {
				System.out.print(matrise[j][i] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String utskrift = "";
		for(int j = 0; j < matrise.length; j++) {
			for(int i = 0; i < matrise[j].length; i++) {
				utskrift += matrise[j][i] + " ";
			}
			utskrift += "\n";
		}
		return utskrift;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] multiplisertMatrise = new int[matrise.length][matrise[0].length];
		
		for(int j = 0; j < matrise.length; j++) {
			for(int i = 0; i < matrise[j].length; i++) {
				multiplisertMatrise[i][j] = matrise[i][j] * tall;
			}
			
		}
		return multiplisertMatrise;
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

	        boolean like = true;
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {


	                if (a.length != b.length) {
	                    like = false;
	                } else if (a[i][j] != b[i][j]){
	                    like = false;
	                }
	            }
	        }
	        return like;
	}

	
//	// e)
//	public static int[][] speile(int[][] matrise) {
//
//		// TODO
//		throw new UnsupportedOperationException("speile ikke implementert");
//	
//	}
//
//	// f)
//	public static int[][] multipliser(int[][] a, int[][] b) {
//
//		// TODO
//		throw new UnsupportedOperationException("multipliser ikke implementert");
//	
//	}
}
