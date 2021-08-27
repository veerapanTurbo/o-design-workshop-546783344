module com.example.lerning_java_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lerning_java_demo to javafx.fxml;
    exports com.example.lerning_java_demo;
}