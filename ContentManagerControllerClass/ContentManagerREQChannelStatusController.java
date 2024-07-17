package com.oop.mahadi.akash__dth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ContentManagerREQChannelStatusController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea DettailsWhyShowtextfxid;

    @FXML
    private Label accept_declineShowFxid;

    @FXML
    private ComboBox<?> channelnewComfxid;

    @FXML
    void backbutton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert DettailsWhyShowtextfxid != null : "fx:id=\"DettailsWhyShowtextfxid\" was not injected: check your FXML file 'ContentManagerREQChannelStatus.fxml'.";
        assert accept_declineShowFxid != null : "fx:id=\"accept_declineShowFxid\" was not injected: check your FXML file 'ContentManagerREQChannelStatus.fxml'.";
        assert channelnewComfxid != null : "fx:id=\"channelnewComfxid\" was not injected: check your FXML file 'ContentManagerREQChannelStatus.fxml'.";

    }

}
