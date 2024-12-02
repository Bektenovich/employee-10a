module org.example.task10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task10 to javafx.fxml;
    exports org.example.task10;
}