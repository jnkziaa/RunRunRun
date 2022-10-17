module com.example.runrunrun {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.runrunrun to javafx.fxml;
    exports com.example.runrunrun;
}