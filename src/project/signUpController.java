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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class signUpController implements Initializable {
    @FXML
    private Button signUp;

    @FXML
    private Button logIn;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private TextField mail;

    @FXML
    private TextField location;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        username.setStyle("-fx-background-color: cornflowerblue;");
        password.setStyle("-fx-background-color : cornflowerblue;");
        mail.setStyle("-fx-background-color : cornflowerblue;");
        location.setStyle("-fx-background-color : cornflowerblue;");
    }

    @FXML
    public String signupAction(ActionEvent e) throws IOException {
        if(username != null && password != null){
            username.setStyle("-fx-background-color: red;");
            password.setStyle("-fx-background-color : orange;");
            mail.setStyle("-fx-background-color : yellow;");
            location.setStyle("-fx-background-color : green;");
        }
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(1));
        pt.setOnFinished(end -> {
            logIn.getScene().getWindow().hide();

            Stage signUp = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Scene scene = new Scene(root);
            signUp.setScene(scene);
            signUp.show();
            System.out.println("Signed up successfully");
        });
        pt.play();
        return "Signed up successfully";
    }

    @FXML
    public String loginAction(ActionEvent e1) throws IOException {
        if(logIn != null){
            logIn.getScene().getWindow().hide();

            Stage signUp = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml"));
            Scene scene = new Scene(root);
            signUp.setScene(scene);
            signUp.show();
            System.out.println("Switched to Log In successfully");
        }
        return "Switched successfully";
    }
}
