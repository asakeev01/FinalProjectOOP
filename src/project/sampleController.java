package project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class sampleController implements Initializable {
    @FXML
    private Button listOfUsers;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void showAction(ActionEvent e) throws IOException {
        listOfUsers.getScene().getWindow().hide();
        Stage list = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Scene scene = new Scene(root);
        list.setScene(scene);
        list.show();
        System.out.println("Switched to list successfully");
    }
}
