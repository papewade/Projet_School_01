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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import school_modele.Connection_sch;

/**
 * FXML Controller class
 *
 * @author devv
 */
public class SuprimerEtudiantController implements Initializable {

    @FXML private Button validersup;
    @FXML private Button annulersup;
    @FXML private TextField idsup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML private void validerAjouter(ActionEvent event) {
        
          Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;

        if (!idsup.getText().equals("") ) {
            try {
                conn = Connection_sch.getConnection();

                String query = "DELETE FROM `individu` WHERE id ="+idsup.getText()+"";

                ps2 = conn.prepareStatement(query);

              
                ps2.executeUpdate();

             

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Notification");
                alert.setHeaderText(null);
                alert.setContentText("L'individu a bien suprimer !");

                alert.showAndWait();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Problème d'inscription");
            alert.setContentText("Entrer l'ID de l'individu!");

            alert.showAndWait();
        }

    }

        
       

    @FXML private void annulerAjout(ActionEvent event) {
        Stage stage = (Stage) annulersup.getScene().getWindow();
        stage.close();
    }
    
}
