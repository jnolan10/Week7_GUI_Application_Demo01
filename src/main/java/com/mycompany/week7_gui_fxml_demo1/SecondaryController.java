package com.mycompany.week7_gui_fxml_demo1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {
    
    @FXML
    private Label nameLabel;
    
    @FXML
    private TextField nameBox;
    
    @FXML
    private Button secondaryButton;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void printMyName() throws IOException {
        
        nameLabel.setText(nameBox.getText());
        //System.out.println("Jonathan Nolan 99999999999");
    }
    
}