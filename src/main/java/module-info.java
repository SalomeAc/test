module org.example.pruebagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pruebagit to javafx.fxml;
    exports org.example.pruebagit;
}