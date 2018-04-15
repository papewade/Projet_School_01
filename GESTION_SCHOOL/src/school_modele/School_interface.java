/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

import java.util.List;

/**
 *
 * @author devv
 */
public interface School_interface {

	public void ajoutIndividu(Individu i);
	public void supprimerIndividu(int id);
        public void ajoutMateriel(Materiel m);
        public void supprimerMateriel(int id);
        public void ajoutEtablissement(Etablissement e);
        public void supprimerEtablissement(Etablissement e);
        public void editerIndividu(Individu i);
        public void editerClasse(Classe c);
	public List<Directeur> listeDirecteur(Directeur d);
	public List<Secretaire> listeSecretaire(Secretaire s);
	public List<Etudiant> listeEtudiant(Etudiant e);
	public List<Classe> listeClasse(Classe c);
	public List<Groupe> listeGroupe(Groupe g);
        public List<Materiel> listeMateriel(Materiel m);
        public List<Etablissement> listeEtablissement(Etablissement e);
	
    
}
