module com.example.go {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.go to javafx.fxml;
    exports com.example.go;
    exports com.example.go.Controller;
    opens com.example.go.Controller to javafx.fxml;
}