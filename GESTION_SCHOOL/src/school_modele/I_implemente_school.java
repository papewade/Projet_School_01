/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_modele;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devv
 */
public class I_implemente_school implements School_interface{
    
    ArrayList<Directeur> ListD = new ArrayList<Directeur>();
	ArrayList<Secretaire> ListS = new ArrayList<Secretaire>();
	ArrayList<Etudiant> ListE= new ArrayList<Etudiant>();
	ArrayList<Classe> ListC = new ArrayList<Classe>();
	ArrayList<Groupe> ListG = new ArrayList<Groupe>();
        ArrayList<Materiel> ListM= new ArrayList<Materiel>();
        ArrayList<Etablissement> ListEta= new ArrayList <Etablissement>();
        
    @Override
    public void ajoutIndividu(Individu i) {
		Connection cnx = Connection_sch.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("INSERT INTO `individu`(`nom`,`prenom`,`adresse`,`numerotel`,`email`,`statut`,`identifiant`,`motdepass`) "
					+ "VALUES (?,?,?,?,?,?,?,?)");
			stat.setString(1, i.getNom());
                        stat.setString(2, i.getPrenom());
                        stat.setString(3, i.toString());
                        stat.setInt(4, i.getNumeroTel());
                        stat.setString(5, i.getEmail());
                        stat.setString(6, i.getStatut());
                        stat.setString(7, i.getIdentifiant());
                        stat.setString(8, i.getModDePasse());
			stat.executeUpdate();
			stat.close();
	
		} catch (SQLException e) {
		}
		
	}

    @Override
    public void supprimerIndividu(int idIndividu) {
        Connection cnx = Connection_sch.getConnection();
            try {
		PreparedStatement  stat = cnx.prepareStatement("DELETE FROM individu where id=? ;");
                stat.setInt(1, idIndividu);
                stat.executeUpdate();
            } catch (SQLException ex) {
            }
    }
    
    

    @Override
    public void ajoutMateriel(Materiel m) {
         
		Connection cnx = Connection_sch.getConnection();
		try {
			PreparedStatement  stat = cnx.prepareStatement("INSERT INTO `materiel`(`libel`,`marque`,`refer`,`dateAcqu`,`datePerte`,`dateRemise`,`dateRestit`) "
					+ "VALUES (?,?,?,?,?,?,?)");
			stat.setString(1, m.getLibelMateriel());
                        stat.setString(2, m.getMarqueMateriel());
                        stat.setString(3, m.getReferMateriel());
                        stat.setDate(4, (Date) m.getDateAcquMateriel());
                        stat.setDate(5, (Date) m.getDatePerteMateriel());
                        stat.setDate(6, (Date) m.getDateRemiseMateriel());
                        stat.setDate(7, (Date) m.getDateRestitutionMateriel());
			stat.executeUpdate();
			stat.close();
	
		} catch (SQLException e) {
		}
    }

    @Override
    public void supprimerMateriel(int id) {
    Connection cnx = Connection_sch.getConnection();
            try {
		PreparedStatement  stat = cnx.prepareStatement("DELETE FROM materiel where id=? ;");
                stat.setInt(1, id);
                stat.executeUpdate();
            } catch (SQLException ex) {
            }   
    }

    @Override
    public void ajoutEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editerIndividu(Individu i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editerClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Directeur> listeDirecteur(Directeur d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Secretaire> listeSecretaire(Secretaire s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Etudiant> listeEtudiant(Etudiant e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> listeClasse(Classe c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Groupe> listeGroupe(Groupe g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Materiel> listeMateriel(Materiel m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Etablissement> listeEtablissement(Etablissement e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    

}
