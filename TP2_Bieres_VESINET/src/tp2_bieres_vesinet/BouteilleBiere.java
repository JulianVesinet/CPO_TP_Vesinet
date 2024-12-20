/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_vesinet;

/**
 *
 * @author julia
 */
public class BouteilleBiere {
   
    String Nom;
    float degreAlcool;
    String brasserie;  
    boolean ouverte;  

    // Constructeur par défaut
    public BouteilleBiere() {
        this.Nom = "Inconnu";
        this.degreAlcool = 0.0f;
        this.brasserie = "Inconnue";
        this.ouverte = false;
    }

    // Constructeur avec paramètres
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        this.Nom = unNom;              
        this.degreAlcool = unDegre;    
        this.brasserie = uneBrasserie;  
        this.ouverte = false;          
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool +
        " degres) \nBrasserie : " + brasserie + "\nOuverte : " + (ouverte ? "Oui" : "Non"));
    }
   
    public boolean Decapsuler() {
        if (ouverte) {
            System.out.println("Erreur : biere deja ouverte");
            return false;
        } else {
            ouverte = true;
            System.out.println("Biere decapsulee avec succes !");
            return true;
        }
    }
   
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degres) - Ouverte ? ";
        if (ouverte) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;
    }
}
