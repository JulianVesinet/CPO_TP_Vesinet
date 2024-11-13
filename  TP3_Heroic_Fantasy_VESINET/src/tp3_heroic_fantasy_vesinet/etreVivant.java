/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_fantasy_vesinet;

/**
 *
 * @author julia
 */
public interface etreVivant {
    void seFatiguer();
    boolean estVivant();
    void estAttaque(int points);
    void attaquer(etreVivant cible);
}