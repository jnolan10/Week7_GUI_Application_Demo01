package com.mycompany.week7_gui_fxml_demo1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button primaryButton;
        
     @FXML
    private void switchToCalculator() throws IOException {
        App.setRoot("calculator");
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
