module com.worldbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.worldbuilder to javafx.fxml;
    exports com.worldbuilder;
    exports trash;
    opens trash to javafx.fxml;
    exports com.worldbuilder.Controller;
    opens com.worldbuilder.Controller to javafx.fxml;
}