package tp4;

import java.util.Scanner;

public class Exercie5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("taille de la matrice N : ");
        int n = sc.nextInt();

        int[][] matrice = new int[n][n];

        System.out.println("entrez les elements de la matrice :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = sc.nextInt();
            }
        }

        rotationHoraire(matrice);

        System.out.println("\nMatrice apres rotation de 90° :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void rotationHoraire(int[][] m) {
        int n = m.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = m[i][j];
                m[i][j] = m[i][n - 1 - j];
                m[i][n - 1 - j] = temp;
            }
        }
    }
}

