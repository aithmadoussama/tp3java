package tp4;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		float somme = 0;

		for (int i = 1; i < number + 1; i++) {
			somme += 1.0f / i;
		}

		System.out.println("la somme de la serie est: " + somme);

	}
}