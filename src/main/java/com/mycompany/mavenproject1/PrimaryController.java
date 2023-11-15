package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class PrimaryController {
    
    @FXML
    private Label label;
        
    @FXML
    private Stage stage;
   
    @FXML
    private Scene scene;
    
    @FXML
    private RadioButton rButton1,rButton2,rButton3,rButton4,rButton5,rButton6,rButton7,rButton8,rButton9;
    
    @FXML
    private Button valid;
    
    @FXML
    private Label counter;
    
    private char count = '0';
  
    @FXML
    public void validate(ActionEvent event) throws IOException{
        
        
        Parent r = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(r);
        
       
        BufferedReader fiw = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\eden_moura_correia.txt"));
        BufferedReader fiw_deux = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\jerome_ouellet.txt"));
        BufferedReader fiw_trois = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\mathiastoy.txt"));
        BufferedReader fiw_quatre = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\jessyka_hinse.txt"));
        BufferedReader fiw_cinq = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\samuel_beaumont_savard.txt"));
        BufferedReader fiw_six = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\echo_bonenfant.txt"));
        BufferedReader fiw_sept = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\clara_savard.txt"));
        BufferedReader fiw_huit = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\camille_garcia_maelle_pare.txt"));
        BufferedReader fiw_neuf = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\emilie_journeault.txt"));
       
        
        
        String ligne;
        String ligne_deux;
        String ligne_trois;
        String ligne_quatre;
        String ligne_cinq;
        String ligne_six;
        String ligne_sept;
        String ligne_huit;
        String ligne_neuf;

        
        
        ligne = fiw.readLine();
        ligne_deux = fiw_deux.readLine();
        ligne_trois = fiw_trois.readLine();
        ligne_quatre = fiw_quatre.readLine();
        ligne_cinq = fiw_cinq.readLine();
        ligne_six = fiw_six.readLine();
        ligne_sept = fiw_sept.readLine();
        ligne_huit = fiw_huit.readLine();
        ligne_neuf = fiw_neuf.readLine();
   
      
        
        
        int nb = Integer.parseInt(ligne);
        int nb_deux = Integer.parseInt(ligne_deux);
        int nb_trois = Integer.parseInt(ligne_trois);
        int nb_quatre = Integer.parseInt(ligne_quatre);
        int nb_cinq = Integer.parseInt(ligne_cinq);
        int nb_six = Integer.parseInt(ligne_six);
        int nb_sept = Integer.parseInt(ligne_sept);
        int nb_huit = Integer.parseInt(ligne_huit);
        int nb_neuf = Integer.parseInt(ligne_neuf);
  
       
        
        
        
        if(rButton1.isSelected()){        
            nb++;
            PrintWriter fich = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\eden_moura_correia.txt"));
            fich.println(nb);
            fich.close();   
            stage.setScene(scene);
            stage.show();
        }else if(rButton2.isSelected()){
            
            nb_deux++;
            PrintWriter fich_deux = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\jerome_ouellet.txt"));
            fich_deux.println(nb_deux);
            fich_deux.close();   
            stage.setScene(scene);
            stage.show();
        }else if(rButton3.isSelected()){
             nb_trois++;
            PrintWriter fich_trois = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\mathiastoy.txt"));
            fich_trois.println(nb_trois);
            fich_trois.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton4.isSelected()){
            nb_quatre++;
            PrintWriter fich_quatre = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\jessyka_hinse.txt"));
            fich_quatre.println(nb_quatre);
            fich_quatre.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton5.isSelected()){
            nb_cinq++;
            PrintWriter fich_cinq = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\samuel_beaumont_savard.txt"));
            fich_cinq.println(nb_cinq);
            fich_cinq.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton6.isSelected()){
            nb_six++;
            PrintWriter fich_six = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\echo_bonenfant.txt"));
            fich_six.println(nb_six);
            fich_six.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton7.isSelected()){
            nb_sept++;
            PrintWriter fich_sept = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\clara_savard.txt"));
            fich_sept.println(nb_sept);
            fich_sept.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton8.isSelected()){
            nb_huit++;
            PrintWriter fich_huit = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\camille_garcia_maelle_pare.txt"));
            fich_huit.println(nb_huit);
            fich_huit.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton9.isSelected()){
            nb_neuf++;
            PrintWriter fich_neuf = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\emilie_journeault.txt"));
            fich_neuf.println(nb_neuf);
            fich_neuf.close();   
            stage.setScene(scene);
            stage.show();
            
        }
        
      
    }
   
    
    @FXML
    public void getVote(ActionEvent event){
       // if(rButton1.isSelected()){
       //     System.out.println("Merci pour votre vote");
       // }
    }
}
