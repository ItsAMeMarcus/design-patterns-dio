module com.dio.designpatternsjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dio.designpatternsjava to javafx.fxml;
    exports com.dio.designpatternsjava;
}