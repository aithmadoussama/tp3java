package tp4;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("entrez une taille : ");
		int taille = sc.nextInt();

		for (int i = 0; i < taille; i++) {

			for (int j = 1; j < (taille - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i + 1); k++) {
				System.out.print("*");
			}
			for (int j = 1; j < (taille - i); j++) {
				System.out.print(" ");
			}
			System.out.println("");

		}
		sc.close();

	}

}
