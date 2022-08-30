module com.example.smart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smart to javafx.fxml;
    exports com.example.smart;
}