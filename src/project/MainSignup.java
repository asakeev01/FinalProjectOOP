package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainSignup extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 725, 448));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
