package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {
    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws Exception{
        primaryStage=stage;
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("start.fxml"))));
        primaryStage.setTitle("Graph algorithms");
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        Image ic=new Image(getClass().getResourceAsStream("graph.png"));
        primaryStage.getIcons().add(ic);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event->{
            event.consume();
            logout(primaryStage);
        });
    }
    public void logout(Stage stage)  {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("You are about to exit!!");
        if(alert.showAndWait().get()== ButtonType.OK) {
            System.out.println("You logged out successfully");
            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Message box");
            a.setHeaderText("THANK YOU!!!!");
            a.showAndWait();
            stage.close();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
