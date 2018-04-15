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
public class Enseignant extends Individu{
    
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Enseignant(String specialite, int idindividu, String nom, String prenom, int numeroTel, String email) {
        super(idindividu, nom, prenom, numeroTel, email);
        this.specialite = specialite;
    }
    
    public Enseignant() {
    }

    public Enseignant(String nom, String prenom, String adresse, int numeroTel, String email, String statut, String identifiant, String motDePasse) {
        super(nom, prenom, adresse, numeroTel, email, statut, identifiant, motDePasse);
    }
    
}
