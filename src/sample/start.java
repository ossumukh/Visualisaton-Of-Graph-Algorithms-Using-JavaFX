package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class start
{
    @FXML
    ImageView img1,img2;
    public void switchtopanel1(ActionEvent event) throws IOException
    {
        Image imgPin = new Image(getClass().getResourceAsStream("gimg3.jpg"));
        img1.setImage(imgPin);
        Image imgPin1 = new Image(getClass().getResourceAsStream("gimg5.png"));
        img1.setImage(imgPin1);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Panel1.fxml"));
            Parent root = loader.load();
            Scene newScene = new Scene(root);
            Main.primaryStage.setScene(newScene);
        } catch (IOException ex) {
            Logger.getLogger(Panel1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
