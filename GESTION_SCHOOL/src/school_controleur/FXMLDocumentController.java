/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 package school_controleur;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import school_main.MainFx;
import school_modele.Connection_sch;

public class FXMLDocumentController implements Initializable {
    
    private  MainFx application;
    
    //@FXML
    //private TextField user;
    @FXML
    private PasswordField motdepasse;
    @FXML
    private TextField identifiant;
    @FXML
    private ComboBox<String> statut ;
    @FXML
    private Button seconnecter;
    
    @FXML
	private void handleButtonAction1(ActionEvent event) throws IOException, SQLException {
		
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;

		try {
			conn = Connection_sch.getConnection();

			int id = 0;

			String nomStatut = statut.getValue();
			System.out.println("statut" + nomStatut);
			/*String queryVerif = "Select * from individu where statut = '"+ nomStatut +"' ";
			ps = conn.prepareStatement(queryVerif);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("id");
			}*/

			//ps.close();
			System.out.println(id);
			System.out.println(identifiant.getText() + " " + motdepasse.getText());
			String query = "Select * from individu where identifiant = '" + identifiant.getText() + "' AND motdepasse = '"
					+ motdepasse.getText() + "' AND statut = '" + statut.getValue() + "' ";

			ps2 = conn.prepareStatement(query);
			ResultSet rs2 = ps2.executeQuery();

			if (rs2.next()) {
				Node source = (Node) event.getSource();
				Window theStage = source.getScene().getWindow();
				theStage.hide();

				switch (nomStatut) {

				case "Administrateur":

					Parent root2 = FXMLLoader.load(getClass().getResource("../school_vue/admin.fxml"));
					Stage stage = new Stage();
					stage.setScene(new Scene(root2));
					stage.show();
					System.out.println("Connecté");
					
					break;

				case "Etudiant":

					Parent root3 = FXMLLoader.load(getClass().getResource("../school_vue/etudiant.fxml"));
					Stage stage3 = new Stage();
					stage3.setScene(new Scene(root3));
					stage3.show();
					System.out.println("Connecté");
					
					break;

				case "Secretaire":

					Parent root4 = FXMLLoader.load(getClass().getResource("../school_vue/secretaire.fxml"));
					Stage stage4 = new Stage();
					stage4.setScene(new Scene(root4));
					stage4.show();
					System.out.println("Connecté");
					
					break;
                                        
                                case "Directeur":

					Parent root6 = FXMLLoader.load(getClass().getResource("../school_vue/directeur.fxml"));
					Stage stage6 = new Stage();
					stage6.setScene(new Scene(root6));
					stage6.show();
					System.out.println("Connecté");
					
					break;

				case "Professeur":

					Parent root5;
                                root5 = FXMLLoader.load(getClass().getResource("../school_vue/professeur.fxml"));
					Stage stage5 = new Stage();
					stage5.setScene(new Scene(root5));
					stage5.show();
					System.out.println("Connecté");
					
					break;

				default:


				}

			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error Dialog");
				alert.setHeaderText("Problème de connexion");
				alert.setContentText("Votre identifiant ou votre mot de passe est incorrect !");

				alert.showAndWait();
				System.out.println("Non connecté");
			}
		} catch (SQLException e) {
		}
	}
    
    
    void initialize() {
        

     
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
