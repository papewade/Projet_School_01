/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

/**
 *
 * @author devv
 */
public class Admin extends Individu{

    public Admin() {
    }

    public Admin(String nom, String prenom, String adresse, int numeroTel, String email, String statut, String identifiant, String motDePasse) {
        super(nom, prenom, adresse, numeroTel, email, statut, identifiant, motDePasse);
    }
    
}
