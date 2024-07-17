package com.oop.mahadi.akash__dth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class TecnachianViewDocumentsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> documentsfxid;

    @FXML
    private TextArea showtextFxid;

    @FXML
    private ComboBox<?> videoLinksFxid;

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert documentsfxid != null : "fx:id=\"documentsfxid\" was not injected: check your FXML file 'TecnachianViewDocuments.fxml'.";
        assert showtextFxid != null : "fx:id=\"showtextFxid\" was not injected: check your FXML file 'TecnachianViewDocuments.fxml'.";
        assert videoLinksFxid != null : "fx:id=\"videoLinksFxid\" was not injected: check your FXML file 'TecnachianViewDocuments.fxml'.";

    }

}
