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
public class Groupe{
    private int idSalle;
    private int idMatiere;
    private String horaire;

    public Groupe() {
    }

    public Groupe(int idSalle, int idMatiere, String horaire){
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
        this.horaire = horaire;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }
    
}
