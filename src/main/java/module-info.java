module com.mycompany.week7_gui_fxml_demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.week7_gui_fxml_demo1 to javafx.fxml;
    exports com.mycompany.week7_gui_fxml_demo1;
}
