module com.example.cssestilo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cssestilo to javafx.fxml;
    exports com.example.cssestilo;
}