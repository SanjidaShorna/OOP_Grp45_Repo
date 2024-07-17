package com.oop.mahadi.akash__dth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class ContentManagerRemoveChannelViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> broadcasrtchannelcomfxid;

    @FXML
    private ComboBox<?> channelnewComfxid;

    @FXML
    private TextArea showChannelDetaiolsffxif;

    @FXML
    void backbutton(ActionEvent event) {

    }

    @FXML
    void dellbutton(ActionEvent event) {

    }

    @FXML
    void viewdelletedchannelList(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert broadcasrtchannelcomfxid != null : "fx:id=\"broadcasrtchannelcomfxid\" was not injected: check your FXML file 'ContentManagerRemoveChannelView.fxml'.";
        assert channelnewComfxid != null : "fx:id=\"channelnewComfxid\" was not injected: check your FXML file 'ContentManagerRemoveChannelView.fxml'.";
        assert showChannelDetaiolsffxif != null : "fx:id=\"showChannelDetaiolsffxif\" was not injected: check your FXML file 'ContentManagerRemoveChannelView.fxml'.";

    }

}
