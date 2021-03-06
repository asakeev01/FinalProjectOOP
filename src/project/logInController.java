package project;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class logInController implements Initializable {
    @FXML
    private Button signUp;

    @FXML
    private Button logIn;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        username.setStyle("-fx-background-color: cornflowerblue;");
        password.setStyle("-fx-background-color : cornflowerblue;");
    }

    @FXML
    public String loginAction(ActionEvent e) throws IOException {
        boolean isExist = false;
        for(User user : Database.get()){
            if(username.getText().equals(user.getUsername()) && password.getText().equals(user.getPassword())){
                isExist = true;
            }
        }
        if(isExist == true) {
            if (username != null && password != null) {
                username.setStyle("-fx-background-color: white;");
                password.setStyle("-fx-background-color : white;");
            }
            PauseTransition pt = new PauseTransition();
            pt.setDuration(Duration.seconds(1));
            pt.setOnFinished(end -> {
                logIn.getScene().getWindow().hide();

                Stage signUp = new Stage();
                Parent root = null;
                System.out.println(username.getText());
                try {
                    root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                Scene scene = new Scene(root);
                signUp.setScene(scene);
                signUp.show();
                System.out.println("Logged in successfully");
            });
            pt.play();
            return "Logged in successfully";
        }
        else{
            System.out.println("There is no such user");
            return "There is no such user";
        }
    }

    @FXML
    public String signupAction(ActionEvent e1) throws IOException {
        if(logIn != null){
            logIn.getScene().getWindow().hide();
            Stage signUp = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("signUp.fxml"));
            Scene scene = new Scene(root);
            signUp.setScene(scene);
            signUp.show();
            System.out.println("Switched to Sign Up successfully");
        }
        return "Switched successfully";
    }
}
