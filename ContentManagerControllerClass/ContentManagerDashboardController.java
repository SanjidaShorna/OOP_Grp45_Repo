package com.oop.mahadi.akash__dth.ContentManagerControllerClass;

import java.net.URL;
import java.util.ResourceBundle;

import com.oop.mahadi.akash__dth.ModelClass.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ContentManagerDashboardController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;
    User user;
    public void setUser(User u){

        this.user=u;
    }
    @FXML
    void initialize() {

    }

}
