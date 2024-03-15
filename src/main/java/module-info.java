module org.example.lab {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.internal.le;


    opens org.example.lab to javafx.fxml;
    exports org.example.lab;
}