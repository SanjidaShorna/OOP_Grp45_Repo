package com.oop.mahadi.akash__dth.TecnachianController;

import com.oop.mahadi.akash__dth.Mainapplication;
import com.oop.mahadi.akash__dth.ModelClass.User;
import com.oop.mahadi.akash__dth.Utility.AllertShow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
        import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class TecnachianDashboardContoller {

    @FXML
    void CustomerProfileButton(ActionEvent event) {

    }

    @FXML
    void FeedbackButton(ActionEvent event) {

    }

    @FXML
    void RatingButton(ActionEvent event) {

    }

    @FXML
    void addRow(ActionEvent event) {

    }

    @FXML
    void backButton(ActionEvent event) {

        AllertShow.showAlert("","we are back to \nlog in and sign up page view");

        //        import java.io.IOException;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.stage.Stage;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Mainapplication.class.getResource("Login_Signup_1st_Sceen.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            // Assuming 'event' is an ActionEvent passed to the method
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Load Course From File");
            stage.setScene(nextScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, add error handling logic here
        } catch (NullPointerException e) {
            e.printStackTrace();
            // Optionally, add error handling logic here
        }
    }

    @FXML
    void submitdetailsButton(ActionEvent event) {

    }
    User user;
public void setUser(User u){
    this.user=u;


}
    @FXML
    void workReqButton(ActionEvent event) {


        //        import java.io.IOException;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.stage.Stage;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Mainapplication.class.getResource("TecnachianWorkReqView.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());


            TecnachianWorkReqViewController nextSceneController = fxmlLoader.getController();
            nextSceneController.setUser(user); // Pass the ArrayList to the next scene
            // Assuming 'event' is an ActionEvent passed to the method
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Load Course From File");
            stage.setScene(nextScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, add error handling logic here
        } catch (NullPointerException e) {
            e.printStackTrace();
            // Optionally, add error handling logic here
        }

    }

    @FXML
    void initialize() {

    }

}
