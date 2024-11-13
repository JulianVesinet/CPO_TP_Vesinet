/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_vesinet;

import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;

/**
 *
 * @author julia
 */
public class TP3_Heroic_Fantasy_VESINET {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        // Création de deux épées
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création de deux bâtons
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Magicien magicien = new Magicien("Merlin", 100, false); // Le magicien n'est pas confirmé
        Guerrier guerrier = new Guerrier("Arthur", 150, true);  // Le guerrier est à cheval

        // Choix des armes pour chaque personnage
        magicien.equiperArme(charme); // Le magicien équipe le bâton "Charme"
        guerrier.equiperArme(durandal); // Le guerrier équipe l'épée "Durandal"

        // Affichage des armes équipées
        System.out.println(magicien.getNom() + " a equipe " + magicien.getArmeEquipee().getNom());
        System.out.println(guerrier.getNom() + " a equipe " + guerrier.getArmeEquipee().getNom());

        // Affichage des caractéristiques avant l'attaque
        System.out.println("\n=== Caracteristiques avant l'attaque ===");
        afficherCaracteristiques(magicien);
        afficherCaracteristiques(guerrier);

        // Faire attaquer le guerrier
        System.out.println("\n" + guerrier.getNom() + " attaque " + magicien.getNom());
        guerrier.attaquer(magicien);  // Le guerrier attaque le magicien

        // Faire attaquer le magicien
        System.out.println("\n" + magicien.getNom() + " attaque " + guerrier.getNom());
        magicien.attaquer(guerrier);  // Le magicien attaque le guerrier

        // Affichage des caractéristiques après l'attaque
        System.out.println("\n=== Caracteristiques apres l'attaque ===");
        afficherCaracteristiques(magicien);
        afficherCaracteristiques(guerrier);

        // Test si les personnages sont vivants
        System.out.println("\n=== Test de la vivacite ===");
        System.out.println(magicien.getNom() + " est vivant ? " + (magicien.estVivant() ? "Oui" : "Non"));
        System.out.println(guerrier.getNom() + " est vivant ? " + (guerrier.estVivant() ? "Oui" : "Non"));
    }

    // Méthode pour afficher les caractéristiques d'un personnage
    public static void afficherCaracteristiques(Personnage personnage) {
        System.out.println(personnage.getNom() + " | PV: " + personnage.getPointsDeVie() +
                           " | Arme: " + personnage.getArmeEquipee().getNom());
    }
}
