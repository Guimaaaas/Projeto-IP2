module com.example.smart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smart to javafx.fxml;
    exports com.example.smart;
    exports com.example.smart.apresentacao;
    opens com.example.smart.apresentacao to javafx.fxml;
}