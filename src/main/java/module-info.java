module com.worldbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.worldbuilder to javafx.fxml;
    exports com.worldbuilder;
}