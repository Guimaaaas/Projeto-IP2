module com.example.smart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.smart to javafx.fxml;
    exports com.smart;
    exports com.smart.apresentacao;
    opens com.smart.apresentacao to javafx.fxml;
}