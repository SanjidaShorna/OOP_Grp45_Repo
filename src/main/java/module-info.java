module com.oop.mahadi.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.gitdemo to javafx.fxml;
    exports com.oop.mahadi.gitdemo;
}