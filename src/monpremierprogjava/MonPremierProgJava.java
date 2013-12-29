/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monpremierprogjava;

import java.util.Scanner;

/**
 *
 * @author nicolaspeteilh
 */
public class MonPremierProgJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World !");
        int nbre1 = 32_00, nbre2 = 213_7;
        double resultat = (double)(nbre1 / nbre2);
        System.out.println("Le premier résultat est = " + resultat);
        double resultat2 = (double)(nbre1) / (double)(nbre2);
        System.out.println("Le deuxième résultat est = " + resultat2);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);
        
        System.out.println("Veuillez saisir un nombre entier :");
        int entier = sc.nextInt();
        System.out.println("Vous avez saisi : " + entier);
    }
}
