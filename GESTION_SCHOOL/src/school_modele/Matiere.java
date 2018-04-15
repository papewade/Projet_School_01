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
class Matiere {
    private int idMatiere;
    private String nom;
    private Enseignant enseignant;
    private Examen examen;

    public Matiere() {
    }
    
    public Matiere(int idMatiere, String nom, Enseignant enseignant, Examen examen) {
        this.idMatiere = idMatiere;
        this.nom = nom;
        this.enseignant = enseignant;
        this.examen = examen;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    
    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    
}
