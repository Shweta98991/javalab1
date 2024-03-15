module org.example.counter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.counter to javafx.fxml;
    exports org.example.counter;
}