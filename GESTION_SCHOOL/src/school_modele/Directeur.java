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
class Directeur extends Individu{
    private String nomEtablissement;

    public Directeur() {
    }

    public Directeur(String nomEtablissement, int idindividu, String nom, String prenom, int numeroTel, String email) {
        super(idindividu, nom, prenom, numeroTel, email);
        this.nomEtablissement = nomEtablissement;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }
    
    
    
}
