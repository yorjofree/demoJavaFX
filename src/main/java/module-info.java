module com.freiorio.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.freiorio.demo to javafx.fxml;
    exports com.freiorio.demo;
}