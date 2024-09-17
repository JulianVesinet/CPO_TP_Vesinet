
import java.util.Scanner;

/*
* TP0 Exercie 2
* TD C-Groupe 1
* VESINET Julian
* 17 Septembre 2024
*/

 
public class TP0_exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
 //Declaration des variables
 int nb; // nombre dentiers a additionner
 int result; // resultat
 int ind; //indice
 //nb=5;
 result=0;
 Scanner sc = new Scanner(System.in);
 System.out.println("\n Entrer le nombre :");
 nb=sc.nextInt(); // On demande a sc de donner le prochain entier
 // Addition des nb premiers entiers
 ind=1;
 while (ind <= nb) {
 result=result+ind;
 ind++;
 }
 // Affichage du resultat
 System.out.println();
 System.out.println("La somme des "+ nb + "entiers est: "+result);
    
    }
}
