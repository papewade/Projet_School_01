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
class Etablissement {
    private int idEtablissement;
    private String nom;
    private Adresse adresse;

    public Etablissement() {
    }

    public Etablissement(int idEtablissement, String nom, Adresse adresse) {
        this.idEtablissement = idEtablissement;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
}
