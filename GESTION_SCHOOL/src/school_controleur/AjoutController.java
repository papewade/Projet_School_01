/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_controleur;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import school_modele.Connection_sch;

/**
 * FXML Controller class
 *
 * @author devv
 */
public class AjoutController implements Initializable {

    
    
    
    @FXML private Button valideajout;
    @FXML private Button annuler;
    
    
    @FXML private TextField ajoutnom;
    @FXML private TextField ajoutprenom;
    @FXML private TextField ajoutmail;
    @FXML private TextField ajoutnumero;
    @FXML private TextField ajoutclasse;
    @FXML private TextField ajoutadresse;
    
      @FXML
    private ComboBox<String> statut;

    @FXML
    
    private TextField ajoutident;
     @FXML private AnchorPane fenetre;

    @FXML
    private TextField ajoutmdp;


    
    @FXML void annulerAjout(ActionEvent event) {
        
        

    }
    @FXML
    void validerAjouter(ActionEvent event) {
        
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        if (!ajoutnom.getText().equals("") && !ajoutprenom.getText().equals("") && !ajoutmail.getText().equals("")
                && !ajoutnumero.getText().equals("") && !ajoutclasse.getText().equals("") && !ajoutadresse.getText().equals("") && !statut.getValue().equals("") && !ajoutident.getText().equals("") && !ajoutmdp.getText().equals("")) {
            try {
                conn = Connection_sch.getConnection();

                String query = "INSERT INTO individu(nom, prenom, adresse, numerotel, email, classe , statut , identifiant, motdepasse) "
                        + "VALUES (?,?,?,?,?,?,?,?,?)";

                ps2 = conn.prepareStatement(query);

                ps2.setString(1, ajoutnom.getText());
                ps2.setString(2, ajoutprenom.getText());
                ps2.setString(3, ajoutadresse.getText());
                ps2.setString(4, ajoutnumero.getText());
                ps2.setString(5, ajoutmail.getText());
                ps2.setString(6, ajoutclasse.getText());                       
                ps2.setString(7, statut.getValue());
                ps2.setString(8, ajoutident.getText());
                ps2.setString(9, ajoutmdp.getText());

                ps2.executeUpdate();

                ajoutnom.clear();
                ajoutprenom.clear();
                ajoutadresse.clear();
                ajoutnumero.clear();
                ajoutmail.clear();
                ajoutident.clear();
                ajoutmdp.clear();
                statut.setValue("Selectionner statut");

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Notification");
                alert.setHeaderText(null);
                alert.setContentText("L'individu a bien été inscrit !");

                alert.showAndWait();
                

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Problème d'inscription");
            alert.setContentText("Vous n'avez pas rempli tous les champs !");

            alert.showAndWait();
        }
        
       

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> options = FXCollections.observableArrayList(
            "Administrateur",
            "Etudiant",
            "Professeur",
            "Secretaire",
            "Directeur"
        ); 
        statut.setItems(options);
    }    
    
}
