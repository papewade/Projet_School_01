/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_controleur;


import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import school_modele.Connection_sch;
import school_modele.Enseignant;
import school_modele.Etudiant;
import school_modele.Individu;
import school_modele.Classe;

/**
 * FXML Controller class
 *
 * @author devv
 */
public class AdminController implements Initializable {

    @FXML private Button bclasse;
    @FXML private Button betudiant;
    @FXML private Button benseignant;
    @FXML private Button bpersonnel;
    @FXML private Button bgestionschool;
    @FXML private Button actuliserEtudiant;
    
    @FXML private Button ajouClasse;
    @FXML private Button supClasse;
    @FXML private Button actuClasse;
    
    @FXML private Button ajoutEnseignant;
    @FXML private Button suprimEnseignant;
    @FXML private Button modEnseignant;
    
    @FXML private Button modifPersonnel;
    @FXML private Button ajourPersonnel;
    @FXML private Button supPersonnel;


    
    

    @FXML private Tab tabclasse;
    @FXML private Tab tabetudiant;
    @FXML private Tab tabenseignant;
    @FXML private Tab tabpersonnel;
    @FXML private Tab tabgestionschool;
    
      
    //*******************************************************
    // les tabeaux
    //******************************************************
    
    @FXML private TableView<Classe> tabClasse;
    @FXML private TableView<Individu> tabEtudiant;
    @FXML private TableView<Individu> tabEnseignant;
    @FXML private TableView<Individu> tabPersonnel;
    
    //*******************************************************
    // les colonnes pour classe
    //*******************************************************
    
    @FXML private TableColumn<Classe, Integer> colidclasse;
    @FXML private TableColumn<Classe, String> colfiliereclasse;
    @FXML private TableColumn<Classe, String> colanneeclasse;
    
    //*********************************************************
    // les colonnes pour etudiants
    //********************************************************
    
    @FXML private TableColumn<Individu, Integer> colidentifiant;
    @FXML private TableColumn<Individu, String> colnom;
    @FXML private TableColumn<Individu, String> colprenom;
    @FXML private TableColumn<Individu, String> coladresse;
    @FXML private TableColumn<Individu, Integer> colnumerotel;
    @FXML private TableColumn<Individu, String> colmail;
    @FXML private TableColumn<Individu, String> colclasse;
   // @FXML private TableColumn<Individu, String> colspecialite;
    
    //***********************************************************
    // les colonnes pour enseignant
    //***********************************************************
    
     
    @FXML private TableColumn<Individu, Integer> colidentifiant1;
    @FXML private TableColumn<Individu, String> colnom1;
    @FXML private TableColumn<Individu, String> colprenom1;
    @FXML private TableColumn<Individu, String> coladresse1;
    @FXML private TableColumn<Individu, Integer> colnumerotel1;
    @FXML private TableColumn<Individu, String> colmail1; 
    @FXML private TableColumn<Individu, String> colspecialite1;
    @FXML private Button benseignant1;

   
    //***********************************************************
    // les colonnes pour le personnel
    //***********************************************************
     
    @FXML private TableColumn<Individu, Integer> colidentifiant2;
    @FXML private TableColumn<Individu, String> colnom2;
    @FXML private TableColumn<Individu, String> colprenom2;
    @FXML private TableColumn<Individu, String> coladresse2;
    @FXML private TableColumn<Individu, Integer> colnumerotel2;
    @FXML private TableColumn<Individu, String> colmail2; 
    @FXML private TableColumn<Individu, String> colfonction2;
  
   
    @FXML void acClasse(ActionEvent event) {
     
    }

    @FXML void acEnseignant(ActionEvent event) {

    }

    @FXML void acEtudiant(ActionEvent event) {

    }
    
    @FXML void acGestionSchool(ActionEvent event) {

    }
    
    @FXML void acPersonnel(ActionEvent event) {


    }
    
    //***********************************************
    // les fonctions pour etudiant***************
    //******************************************
    
    @FXML void actualiserEtudiant(ActionEvent event) throws SQLException {
        dataEtudiant.clear();
        leadDatabaseDataEtudiant();
    }
    
    @FXML
    void suprimerEtudiant(ActionEvent event) throws IOException, SQLException {
        Parent root10 = FXMLLoader.load(getClass().getResource("../school_vue/suprimerEtudiant.fxml"));
	Stage stage10 = new Stage();
        stage10.setScene(new Scene(root10));
        stage10.show();
        stage10.setResizable(false);
	System.out.println("Connecté");

    }


    @FXML void ajoutEtudiant(ActionEvent event) throws IOException, SQLException{
        Parent root3 = FXMLLoader.load(getClass().getResource("../school_vue/AjoutEtudiant.fxml"));
	Stage stage3 = new Stage();
        stage3.setScene(new Scene(root3));
        stage3.show();
        stage3.setResizable(false);
	System.out.println("Connecté");

    

    }

    @FXML void modiferEtudiant(ActionEvent event) {

    }
    
     // les fonctions pour classe***************
    //******************************************
    
    @FXML void ajouterCLasse(ActionEvent event) {

    }
    @FXML void supprimerClasse(ActionEvent event) {

    }
    @FXML void actualiserClasse(ActionEvent event) {

    }
    
    //*********************************************
    //les fonctions pour  enseignants
    //********************************************
    
    @FXML void ajouterEnseignant(ActionEvent event) {

    }
    @FXML void modifierEnseignant(ActionEvent event) {

    }
    @FXML void supprimerEnseignant(ActionEvent event) {

    }
    
    //********************************************************
    // les fonctions pour personnel****************************
    //*********************************************************
    
    
    @FXML void supprimerPersonnel(ActionEvent event) {

    }
    @FXML void modifierPersonnel(ActionEvent event) {

    }
    @FXML void ajouterPersonnel(ActionEvent event) {

    }



    
    
    
    
    //connection base de donnée
    Connection con = Connection_sch.getConnection();
    
    private final ObservableList<Classe> dataClasse = FXCollections.observableArrayList();;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    
    private final ObservableList<Individu> dataEtudiant = FXCollections.observableArrayList();
    PreparedStatement preparedStatement1 = null;
    ResultSet rs1 = null;
    
    private final ObservableList<Individu> dataEnseignant = FXCollections.observableArrayList();
    PreparedStatement preparedStatement2 = null;
    ResultSet rs2 = null;
    
    private final ObservableList<Individu> dataPersonnel = FXCollections.observableArrayList();
    PreparedStatement preparedStatement3 = null;
    ResultSet rs3 = null;
    
 
 
    @Override
    @FXML public void initialize(URL url, ResourceBundle rb) {
        
        //**********************************************************************
        // chargement des donnes dans le tableau CLASSE
        //**********************************************************************
        
        colidclasse.setCellValueFactory(new PropertyValueFactory<>("idclasse"));
        colfiliereclasse.setCellValueFactory(new PropertyValueFactory<>("filiere"));
        colanneeclasse.setCellValueFactory(new PropertyValueFactory<>("annee"));
        
 
        try {
            leadDatabaseDataClasse();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //**********************************************************************
        // chargement des donnes dans le tableau ETUDIANT
        //**********************************************************************
       
        colidentifiant.setCellValueFactory(new PropertyValueFactory<>("idindividu"));
        colnom.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        colprenom.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        coladresse.setCellValueFactory(new PropertyValueFactory<>("Adresse"));
        colnumerotel.setCellValueFactory(new PropertyValueFactory<>("numeroTel"));
        colmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colclasse.setCellValueFactory(new PropertyValueFactory<>("Classe"));
       
        try {
            leadDatabaseDataEtudiant();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        //**********************************************************************
        // chargement des donnes dans le tableau ENSEIGNANT
        //**********************************************************************
     
        colidentifiant1.setCellValueFactory(new PropertyValueFactory<>("idindividu"));
        colnom1.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colprenom1.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        coladresse1.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        colnumerotel1.setCellValueFactory(new PropertyValueFactory<>("numeroTel"));
        colmail1.setCellValueFactory(new PropertyValueFactory<>("email"));
        colspecialite1.setCellValueFactory(new PropertyValueFactory<>("specialite"));
       
        try {
            leadDatabaseDataEnseignant();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //**********************************************************************
        // chargement des donnes dans le tableau PERSONNEL
        //**********************************************************************
     
        colidentifiant2.setCellValueFactory(new PropertyValueFactory<>("idindividu"));
        colnom2.setCellValueFactory(new PropertyValueFactory<>("nom"));
        colprenom2.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        coladresse2.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        colnumerotel2.setCellValueFactory(new PropertyValueFactory<>("numeroTel"));
        colmail2.setCellValueFactory(new PropertyValueFactory<>("email"));
        colfonction2.setCellValueFactory(new PropertyValueFactory<>("statut"));
       
        try {
            leadDatabaseDataPersonnel();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }    

    public void leadDatabaseDataClasse() throws SQLException{
       dataClasse.clear();
    String query ="SELECT `id`,`filiere`,`annee` FROM classe";
        try{
            
            preparedStatement = con.prepareStatement(query);
            rs= preparedStatement.executeQuery();         
        
            
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                dataClasse.add(new Classe(  
                    rs.getInt("id"),
                    rs.getString("filiere"),
                    rs.getString("annee")
                ));
                tabClasse.setItems(dataClasse);
            }
            preparedStatement.close();
            rs.close();
        }catch(SQLException e){
        	System.err.println(e);
        }                 
    }
        
    public void leadDatabaseDataEtudiant() throws SQLException{
      dataEtudiant.clear();
        String query ="SELECT `id`,`nom`,`prenom`,`adresse`,`numerotel`,`email`, `classe` FROM individu WHERE `statut`= 'Etudiant' ";
        try{
            
            preparedStatement1 = con.prepareStatement(query);
            rs1= preparedStatement1.executeQuery();         
            
                 
            while(rs1.next()){
                System.out.println(rs1.getInt("id"));
                dataEtudiant.add(new Individu(     
                    
                    rs1.getInt("id"),
                    rs1.getString("nom"),
                    rs1.getString("prenom"),
                    rs1.getString("adresse"),
                    rs1.getInt("numerotel"),
                    rs1.getString("email"),
                    rs1.getString("classe")
                ));
                tabEtudiant.setItems(dataEtudiant);
            }
            preparedStatement1.close();
            rs1.close();
        }catch(SQLException e){
        	System.err.println(e);
        }                 
    }

  
    public void leadDatabaseDataEnseignant() throws SQLException{
       dataEnseignant.clear();
        String query ="SELECT `id`,`nom`,`prenom`,`adresse`,`numerotel`,`email`, `specialite` FROM individu WHERE `statut`= 'Professeur' ";
        try{
            preparedStatement2 = con.prepareStatement(query);
            rs2= preparedStatement2.executeQuery();         
        
            while(rs2.next()){
                System.out.println(rs2.getInt("id"));
                dataEnseignant.add(new Individu(     
                    rs2.getInt("id"),
                    rs2.getString("nom"),
                    rs2.getString("prenom"),
                    rs2.getString("adresse"),
                    rs2.getInt("numerotel"),
                    rs2.getString("email"),
                    rs2.getString("specialite")
                ));
                tabEnseignant.setItems(dataEnseignant);
            }
            preparedStatement2.close();
            rs2.close();
        }catch(SQLException e){
        	System.err.println(e);
        }                 
    }

    public void leadDatabaseDataPersonnel() throws SQLException{
       dataPersonnel.clear();
        String query ="SELECT * FROM individu WHERE `statut`='Secretaire' OR `statut`='Directeur'";
        try{
            preparedStatement3 = con.prepareStatement(query);
            rs3= preparedStatement3.executeQuery();         
        
            while(rs3.next()){
                System.out.println(rs3.getInt("id"));
                dataPersonnel.add(new Individu(
                    rs3.getInt("id"),
                    rs3.getString("nom"),
                    rs3.getString("prenom"),
                    rs3.getInt("numerotel"),
                    rs3.getString("adresse"),
                    rs3.getString("email"),
                    rs3.getString("statut")
                ));
                tabPersonnel.setItems(dataPersonnel);
            }
            preparedStatement3.close();
            rs3.close();
        }catch(SQLException e){
        	System.err.println(e);
        }                 
    }
    
    
    
}

