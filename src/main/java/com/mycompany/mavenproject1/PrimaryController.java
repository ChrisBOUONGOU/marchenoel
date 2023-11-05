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
    private RadioButton rButton1,rButton2,rButton3,rButton4,rButton5,rButton6,rButton7,rButton8,rButton9,rButton10,rButton11,rButton12,rButton13,rButton14,rButton15;
    
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
        
       
        BufferedReader fiw = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_un.txt"));
        BufferedReader fiw_deux = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_deux.txt"));
        BufferedReader fiw_trois = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_trois.txt"));
        BufferedReader fiw_quatre = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_four.txt"));
        BufferedReader fiw_cinq = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_five.txt"));
        BufferedReader fiw_six = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_six.txt"));
        BufferedReader fiw_sept = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_seven.txt"));
        BufferedReader fiw_huit = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_huit.txt"));
        BufferedReader fiw_neuf = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_neuf.txt"));
        BufferedReader fiw_dix = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_dix.txt"));
        BufferedReader fiw_onze = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_onze.txt"));
        BufferedReader fiw_douze = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_douze.txt"));
        BufferedReader fiw_treize = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_treize.txt"));
        BufferedReader fiw_quatorze = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_quatorze.txt"));
        BufferedReader fiw_quinze = new BufferedReader(new FileReader("C:\\Program Files\\marchenoel\\counter_quinze.txt"));
        
        String ligne;
        String ligne_deux;
        String ligne_trois;
        String ligne_quatre;
        String ligne_cinq;
        String ligne_six;
        String ligne_sept;
        String ligne_huit;
        String ligne_neuf;
        String ligne_dix;
        String ligne_onze;
        String ligne_douze;
        String ligne_treize;
        String ligne_quatorze;
        String ligne_quinze;
        
        ligne = fiw.readLine();
        ligne_deux = fiw_deux.readLine();
        ligne_trois = fiw_trois.readLine();
        ligne_quatre = fiw_quatre.readLine();
        ligne_cinq = fiw_cinq.readLine();
        ligne_six = fiw_six.readLine();
        ligne_sept = fiw_sept.readLine();
        ligne_huit = fiw_huit.readLine();
        ligne_neuf = fiw_neuf.readLine();
        ligne_dix = fiw_dix.readLine();
        ligne_onze = fiw_onze.readLine();
        ligne_douze = fiw_douze.readLine();
        ligne_treize = fiw_treize.readLine();
        ligne_quatorze = fiw_quatorze.readLine();
        ligne_quinze = fiw_quinze.readLine();
        
        
        int nb = Integer.parseInt(ligne);
        int nb_deux = Integer.parseInt(ligne_deux);
        int nb_trois = Integer.parseInt(ligne_trois);
        int nb_quatre = Integer.parseInt(ligne_quatre);
        int nb_cinq = Integer.parseInt(ligne_cinq);
        int nb_six = Integer.parseInt(ligne_six);
        int nb_sept = Integer.parseInt(ligne_sept);
        int nb_huit = Integer.parseInt(ligne_huit);
        int nb_neuf = Integer.parseInt(ligne_neuf);
        int nb_dix = Integer.parseInt(ligne_dix);
        int nb_onze = Integer.parseInt(ligne_onze);
        int nb_douze = Integer.parseInt(ligne_douze);
        int nb_treize = Integer.parseInt(ligne_treize);
        int nb_quatorze = Integer.parseInt( ligne_quatorze);
        int nb_quinze = Integer.parseInt( ligne_quinze);
        
        
        
        if(rButton1.isSelected()){        
            nb++;
            PrintWriter fich = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_un.txt"));
            fich.println(nb);
            fich.close();   
            stage.setScene(scene);
            stage.show();
        }else if(rButton2.isSelected()){
            
            nb_deux++;
            PrintWriter fich_deux = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_deux.txt"));
            fich_deux.println(nb_deux);
            fich_deux.close();   
            stage.setScene(scene);
            stage.show();
        }else if(rButton3.isSelected()){
             nb_trois++;
            PrintWriter fich_trois = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_trois.txt"));
            fich_trois.println(nb_trois);
            fich_trois.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton4.isSelected()){
            nb_quatre++;
            PrintWriter fich_quatre = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_four.txt"));
            fich_quatre.println(nb_quatre);
            fich_quatre.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton5.isSelected()){
            nb_cinq++;
            PrintWriter fich_cinq = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_five.txt"));
            fich_cinq.println(nb_cinq);
            fich_cinq.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton6.isSelected()){
            nb_six++;
            PrintWriter fich_six = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_six.txt"));
            fich_six.println(nb_six);
            fich_six.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton7.isSelected()){
            nb_sept++;
            PrintWriter fich_sept = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_seven.txt"));
            fich_sept.println(nb_sept);
            fich_sept.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton8.isSelected()){
            nb_huit++;
            PrintWriter fich_huit = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_huit.txt"));
            fich_huit.println(nb_huit);
            fich_huit.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton9.isSelected()){
            nb_neuf++;
            PrintWriter fich_neuf = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_neuf.txt"));
            fich_neuf.println(nb_neuf);
            fich_neuf.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton10.isSelected()){
            nb_dix++;
            PrintWriter fich_dix = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_dix.txt"));
            fich_dix.println(nb_dix);
            fich_dix.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton11.isSelected()){
            nb_onze++;
            PrintWriter fich_onze = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_onze.txt"));
            fich_onze.println(nb_onze);
            fich_onze.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton12.isSelected()){
            nb_douze++;
            PrintWriter fich_douze = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_douze.txt"));
            fich_douze.println(nb_douze);
            fich_douze.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton13.isSelected()){
            nb_treize++;
            PrintWriter fich_treize = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_treize.txt"));
            fich_treize.println(nb_treize);
            fich_treize.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton14.isSelected()){
            nb_quatorze++;
            PrintWriter fich_quatorze = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_quatorze.txt"));
            fich_quatorze.println(nb_quatorze);
            fich_quatorze.close();   
            stage.setScene(scene);
            stage.show();
            
        }else if(rButton15.isSelected()){
            nb_quinze++;
            PrintWriter fich_quinze = new PrintWriter(new FileWriter("C:\\Program Files\\marchenoel\\counter_quinze.txt"));
            fich_quinze.println(nb_quinze);
            fich_quinze.close();   
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
