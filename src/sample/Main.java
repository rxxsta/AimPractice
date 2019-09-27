package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

<<<<<<< HEAD
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Aim Practice");
        Scene scene = new Scene(mainPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
=======
        BorderPane mainPane = null;

        try
        {
            mainPane = FXMLLoader.load(getClass().getResource("root.fxml"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        if(mainPane != null)
        {
            primaryStage.setTitle("Hand-Eye Coordination");
            Scene scene = new Scene(mainPane, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
>>>>>>> Setup FXML-File
    }


    public static void main(String[] args) {
        launch(args);
    }
}
