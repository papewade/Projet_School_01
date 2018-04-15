/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_main;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import school_modele.Individu;


/**
 *
 * @author devv
 */
public class MainFx extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../school_vue/authentification.fxml"));
    
        Scene scene = new Scene(root, 800, 600);
    
        stage.setTitle("AUTHANTIFICATION");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        
	launch(args);
    }
}
