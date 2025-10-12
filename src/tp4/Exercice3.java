package tp4 ;
import java.util.Scanner;

public class Exercice3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();
        
        int[] impairs = new int[n];
        
        for (int i = 0; i < n; i++) {
            impairs[i] = 2 * i + 1;
        }
        
        for (int i = 0; i < n; i++) {
            int carre = impairs[i] * impairs[i];
            System.out.println(impairs[i] + " a pour carre " + carre);
        }

        sc.close();
    }
}
