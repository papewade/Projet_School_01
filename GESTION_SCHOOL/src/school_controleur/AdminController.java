/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_controleur;


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
import javafx.stage.Stage;

import school_modele.Connection_sch;
import school_modele.Etudiant;
import school_modele.Individu;

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

    @FXML private Tab tabclasse;
    @FXML private Tab tabetudiant;
    @FXML private Tab tabenseignant;
    @FXML private Tab tabpersonnel;
    @FXML private Tab tabgestionschool;
    
      
    @FXML private TableView<Individu> tabEtudiant;

    @FXML private TableColumn<Individu, Integer> colidentifiant;
    @FXML private TableColumn<Individu, String> colnom;
    @FXML private TableColumn<Individu, String> colprenom;
    @FXML private TableColumn<Individu, String> coladresse;
    @FXML private TableColumn<Individu, Integer> colnumerotel;
    @FXML private TableColumn<Individu, String> colmail;
    @FXML private TableColumn<Individu, String> colclasse;

  
   
    @FXML void acClasse(ActionEvent event) {
     
    }

    @FXML void acEnseignant(ActionEvent event) {

    }

    @FXML void acEtudiant(ActionEvent event) {

    }

    @FXML void acGestionSchool(ActionEvent event) {

    }

    @FXML void actualiserTab(ActionEvent event) {
        

    }
    
    @FXML void acPersonnel(ActionEvent event) {

    }
    @FXML
    void suprimerEtudiant(ActionEvent event) throws IOException {
        Parent root10 = FXMLLoader.load(getClass().getResource("../school_vue/suprimerEtudiant.fxml"));
	Stage stage10 = new Stage();
        stage10.setScene(new Scene(root10));
        stage10.show();
	System.out.println("Connecté");

    }


    @FXML void ajoutEtudiant(ActionEvent event) throws IOException{
        Parent root3 = FXMLLoader.load(getClass().getResource("../school_vue/AjoutEtudiant.fxml"));
	Stage stage3 = new Stage();
        stage3.setScene(new Scene(root3));
        stage3.show();
	System.out.println("Connecté");
        
    

    }

    @FXML void modiferEtudiant(ActionEvent event) {

    }
    
        
    Connection con = Connection_sch.getConnection();
    
   @FXML
    private final ObservableList<Individu> data = FXCollections.observableArrayList();
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
 
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        tabEtudiant.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        colidentifiant.setCellValueFactory(new PropertyValueFactory<>("idindividu"));
        colnom.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        colprenom.setCellValueFactory(new PropertyValueFactory<>("Prenom"));
        coladresse.setCellValueFactory(new PropertyValueFactory<>("Adresse"));
        colnumerotel.setCellValueFactory(new PropertyValueFactory<>("numeroTel"));
        colmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colclasse.setCellValueFactory(new PropertyValueFactory<>("Classe"));
        try {
            leadDatabaseData();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }    



        

       
  public void leadDatabaseData() throws SQLException{
            
            String query ="SELECT `id`,`nom`,`prenom`,`adresse`,`numerotel`,`email`, `classe` FROM `individu`";
            
            try{
            
                 preparedStatement = con.prepareStatement(query);
                 rs= preparedStatement.executeQuery();
                 
                 
                 while(rs.next()){
                     System.out.println(rs.getInt("id"));
                    data.add(new Individu(     
                    
                            rs.getInt("id"),
                            rs.getString("nom"),
                            rs.getString("prenom"),
                            rs.getString("adresse"),
                            rs.getInt("numerotel"),
                            rs.getString("email"),
                            rs.getString("classe")
                             ));
			tabEtudiant.setItems(data);
			}
			preparedStatement.close();
			rs.close();
		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
                    
                   
                            
                 
       }
            
           
             
    
}

