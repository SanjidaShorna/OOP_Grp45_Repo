module com.oop.mahadi.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo11 to javafx.fxml;
    exports com.oop.mahadi.demo11;
    exports com.oop.mahadi.demo11.TechnicianController;
    opens com.oop.mahadi.demo11.TechnicianController to javafx.fxml;
}