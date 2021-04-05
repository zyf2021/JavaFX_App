package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    @FXML
    Button donateBtn;

    @FXML
    Button runnerBtn;

    @FXML
    Button moreInfoBtn;

    public void DonateWindowOpen(javafx.event.ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("donatePage.fxml"));
            Scene scene = donateBtn.getScene();
            scene.setRoot(root);
        }
        catch(IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new DonateWindow.", e);
        }
    }

    public void RunnerWindowOpen(ActionEvent actionEvent) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("runnerPage.fxml"));
            Scene scene = runnerBtn.getScene();
            scene.setRoot(root);
        }
        catch(IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new RunnerWindow.", e);
        }
    }
    public void MoreInfoWindowOpen(ActionEvent actionEvent) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("moreInfoPage1.fxml"));
            Scene scene = moreInfoBtn.getScene();
            scene.setRoot(root);
        }
        catch(IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new InfoWindow.", e);
        }
    }
//    public void CreateNewWindow(ActionEvent actionEvent, String namePage, String titlePage){
//        try{
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource(namePage));
//            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//            Stage donateWindow = new Stage();
//            donateWindow.setTitle(titlePage);
//            donateWindow.setScene(scene);
//            donateWindow.show();
//        }
//        catch(IOException e) {
//            Logger logger = Logger.getLogger(getClass().getName());
//            logger.log(Level.SEVERE, "Failed to create new Window.", e);
//        }
//    }
}

