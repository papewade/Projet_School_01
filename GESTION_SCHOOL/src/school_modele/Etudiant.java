/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

import java.util.Date;

/**
 *
 * @author devv
 */
public class Etudiant extends Individu{
    private int idGroupe;
    private String competence;
    private String assiduite;
    private String classe;
    private Groupe groupe;

    public Etudiant() {
    }

    public Etudiant(String competence, String assiduite, String classe, int idindividu, String nom, String prenom, int numeroTel, String email) {
        super(idindividu, nom, prenom, numeroTel, email);
        this.competence = competence;
        this.assiduite = assiduite;
        this.classe = classe;
    }


    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public void setAssiduite(String assiduite) {
        this.assiduite = assiduite;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public String getCompetence() {
        return competence;
    }

    public String getAssiduite() {
        return assiduite;
    }

    public String getClasse() {
        return classe;
    }
    
    
}