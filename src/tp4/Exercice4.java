package tp4;

public class Exercice4 {

	public static void affiche(double t[][]) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j]);
				System.out.print("    ");
			}
			System.out.println("");
		}
	}

	public static boolean regulier(double t[][]) {
		if (t.length == 0) {
			return true;
		}
		int taille = t[0].length;

		for (int i = 0; i < t.length; i++) {
			if (t[i].length != taille) {
				return false;
			}
		}
		return true;
	}

	public static double[] sommeLignes(double t[][]) {
		double[] somme = new double[t.length];
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				somme[i] += t[i][j];
			}
		}
		return somme;
	}

	public static double[][] somme(double[][] t1, double[][] t2) {
		if (t1 == null || t2 == null)
			return null;
		if (!regulier(t1) || !regulier(t2))
			return null;
		if (t1.length != t2.length || t1[0].length != t2[0].length)
			return null;

		double[][] resultat = new double[t1.length][t1[0].length];
		for (int i = 0; i < t1.length; i++) {
			for (int j = 0; j < t1[i].length; j++) {
				resultat[i][j] = t1[i][j] + t2[i][j];
			}
		}
		return resultat;
	}

	public static void main(String[] args) {

		double[][] table1 = { { 1, 4, 5, 6 }, { 3, 6, 3, 0 }, { 9, 2, 5, 5 }, { 1, 9, 3, 1 } };
		double[][] table2 = { { 1, 4, 5, 6 }, { 3, 6, 3, 0 }, { 9, 2, 5, 5 }, { 1, 9, 3, 1 } };

		affiche(table1);
		if (regulier(table2)) {
			System.out.println("la table 2 est regulier");
		}
		if (regulier(table2)) {
			System.out.println("la table 1 est regulier");
		}

		System.out.println("les sommes des lignes de la table 2 est : ");
		for (int i = 0; i < sommeLignes(table2).length; i++) {
			System.out.print(sommeLignes(table2)[i]);
			System.out.print(", ");
		}
		
		
	}

}
