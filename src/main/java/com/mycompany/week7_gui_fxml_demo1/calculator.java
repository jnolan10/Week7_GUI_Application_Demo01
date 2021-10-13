
package com.mycompany.week7_gui_fxml_demo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculator {

    @FXML
    private Button calcBtn;

    @FXML
    private Label sumField;

    @FXML
    private TextField sumtxt1;

    @FXML
    private TextField sumtxt2;
    
    @FXML
    void calcSum(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(sumtxt1.getText()) + Integer.parseInt(sumtxt2.getText());
        sumField.setText("The sum is: " + sum);
    }
    
    
     @FXML
    private void switchToCalculator() throws IOException {
        App.setRoot("calculator");
    }
    
}
