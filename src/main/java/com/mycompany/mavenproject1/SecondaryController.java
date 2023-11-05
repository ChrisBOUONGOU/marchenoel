package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SecondaryController implements Initializable {
    
    @FXML
    private AnchorPane validscene;
         
    private Stage stage;
    private Scene scene;
    private Parent r;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(3));
        pauseTransition.setOnFinished(event -> {
            try {
                r = FXMLLoader.load(getClass().getResource("primary.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            stage = (Stage) validscene.getScene().getWindow();
            scene = new Scene(r);
            stage.setScene(scene);
            stage.show();
        });
        pauseTransition.play();
    }   
}