package com.oop.mahadi.akash__dth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TecnachianApplicationStatusViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> SubComfxid;

    @FXML
    private TextArea replayShowfxid;

    @FXML
    private TextField statusfxid;

    @FXML
    void Showreplaybutton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert SubComfxid != null : "fx:id=\"SubComfxid\" was not injected: check your FXML file 'TecnachianApplicationStatusView.fxml'.";
        assert replayShowfxid != null : "fx:id=\"replayShowfxid\" was not injected: check your FXML file 'TecnachianApplicationStatusView.fxml'.";
        assert statusfxid != null : "fx:id=\"statusfxid\" was not injected: check your FXML file 'TecnachianApplicationStatusView.fxml'.";

    }

}
