package com.oop.mahadi.akash__dth.TecnachianController;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.oop.mahadi.akash__dth.Utility.FileUtils;
import com.oop.mahadi.akash__dth.ModelClass.User;
import com.oop.mahadi.akash__dth.Utility.AllertShow;
import com.oop.mahadi.akash__dth.GeneralClass.requestedServise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class TecnachianWorkReqViewController {
    @FXML
    void  initialize() {

        arrSerReq= FileUtils.loadObjectsFromFile("reqServiseFile.bin");
//        System.out.println(arrSerReq);
        for(requestedServise s:arrSerReq){

            if(s.getSerState().equals("1")){

                comSerFXid.getItems().add(s.getServiceId());

            }


        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Integer> comSerFXid;

    @FXML
    private TextArea textAreafxid;

    User user;
    public void setUser(User u){
        this.user=u;


    }
ArrayList<requestedServise> arrSerReq=new ArrayList<>();
    @FXML
    void acceptforworkonActionbutton(ActionEvent event) {


        for (requestedServise s : arrSerReq) {
            Integer selectedServiceId = comSerFXid.getValue();

            // Check if a value is selected in the ComboBox
            if (selectedServiceId != null && selectedServiceId.equals(s.getServiceId())) {
                s.setSerState("3" + user.getId());
                comSerFXid.getItems().clear();

                for (requestedServise ss : arrSerReq) {
                    if (ss.getSerState().equals("1")) {
                        comSerFXid.getItems().add(ss.getServiceId());
                    }
                }

                textAreafxid.clear();
                FileUtils.saveObjectsToFile("reqServiseFile.bin", arrSerReq);

                break;
            }
        }


    }

    @FXML
    void backButton(ActionEvent event) {
        textAreafxid.setText(user.getId()+"");

    }

    @FXML
    void comSerFXidOnClick(ActionEvent event) {
        textAreafxid.clear();
        Integer selectedServiceId = comSerFXid.getValue();

        if (selectedServiceId == null) {
            AllertShow.showAlert("", "Please select a service ID.");
            return;
        }

        StringBuilder sss = new StringBuilder();
        boolean found = false;

        for (requestedServise s : arrSerReq) {
            if (selectedServiceId.equals(s.getServiceId())) {
                sss.append("Location: ").append(s.getLocation_().toString()).append("\n")
                        .append("Name: ").append(s.getCustomerprofile_().getName()).append("\n")
                        .append("Customer ID: ").append(s.getCustomerprofile_().getId()).append("\n")
                        .append("Service Details: ").append(s.getServiceDetails()).append("\n");

                textAreafxid.appendText(sss.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            textAreafxid.appendText("Service not found.");
        }
    }




}
