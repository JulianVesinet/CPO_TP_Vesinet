/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint__vesinet;

import java.util.Scanner;

/*
* TP1 Exercie 1
* TD C-Groupe 1
* VESINET Julian
* 23 Septembre 2024
*/
public class TP1_manipNombresInt__VESINET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Création d'un scanner pour lire l'entrée utilisateur
       int entier1;
    int entier2;
    int somme;
    int difference;
    int produit;
    int quotient;
    int reste;
   
        // Création d'un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le premier entier
        System.out.print("Veuillez saisir le premier entier : ");
        entier1 = scanner.nextInt();

        // Demande à l'utilisateur de saisir le deuxième entier
        System.out.print("Veuillez saisir le deuxieme entier : ");
        entier2 = scanner.nextInt();
       
        // Calculs : somme, différence et produit
        somme = entier1 + entier2;
        difference = entier1 - entier2;
        produit = entier1 * entier2;
       
                // Vérification pour éviter la division par zéro
        if (entier2 != 0) {
            quotient = entier1 / entier2; // Quotient entier
            reste = entier1 % entier2; // Reste de la division euclidienne

        // Affichage des entiers saisis
            System.out.println("Le premier entier saisi est : " + entier1);
            System.out.println("Le deuxieme entier saisi est : " + entier2);
            System.out.println("La somme des deux nombres est : " + somme);
            System.out.println("La difference des deux nombres est : " + difference);
            System.out.println("Le produit des deux nombres est : " + produit);
            System.out.println("Le quotient entier de la division de " + entier1 + " par " + entier2 + " est : " + quotient);
            System.out.println("Le reste de la division euclidienne de " + entier1 + " par " + entier2 + " est : " + reste);
        } else {
            System.out.println("La division par zéro n'est pas définie.");
        }

        // Fermeture du scanner
        scanner.close();
    }
   
}
