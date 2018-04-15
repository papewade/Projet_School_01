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
class Classe {
    private String annee;
    private String filiere;
    private String nomClasse;
    private Etudiant etudiant;
    private Matiere matiere;

    public Classe() {
    }

    public Classe(String annee, String filiere, Etudiant etudiant, Matiere matiere) {
        this.annee = annee;
        this.filiere = filiere;
        this.nomClasse = annee + "-" + filiere;
        this.etudiant = etudiant;
        this.matiere = matiere;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    
    
    
    
    
}
