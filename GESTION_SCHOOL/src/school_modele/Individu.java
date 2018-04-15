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
public class Individu {
    private int idindividu;
    private String nom;
    private String prenom;
    private String adresse;
    private int numeroTel;
    private String email;
    private String statut;
    private String identifiant;
    private String motDePasse;
    private String classe;

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Individu(int idindividu, String nom, String prenom, String adresse, int numeroTel, String email, String classe) {
        this.idindividu = idindividu;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.email = email;
        this.classe = classe;
    }
    
    public Individu() {
    }

    public Individu(int idindividu, String nom, String prenom, int numeroTel, String email) {
        this.idindividu = idindividu;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.email = email;
        
    }
    
    

    public Individu(String nom, String prenom, String adresse, int numeroTel, String email, String statut, String identifiant, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.email = email;
        this.statut = statut;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }


    public int getIdindividu() {
        return idindividu;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public String getStatut() {
        return statut;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getModDePasse() {
        return motDePasse;
    }

    public void setIdindividu(int idindividu) {
        this.idindividu = idindividu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setModDePasse(String modDePasse) {
        this.motDePasse = modDePasse;
    }
    
    
}
