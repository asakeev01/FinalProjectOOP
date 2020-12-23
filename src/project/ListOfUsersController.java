package project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ListOfUsersController implements Initializable {
    @FXML private TableView<User> table;
    @FXML private TableColumn<User, String> username;
    @FXML private TableColumn<User, String> password;
    @FXML private TableColumn<User, String> email;
    @FXML private TableColumn<User, String> location;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        username.setCellValueFactory(new PropertyValueFactory<User, String>("username"));
        password.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
        email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
        location.setCellValueFactory(new PropertyValueFactory<User, String>("location"));
        System.out.println("hello");
        table.getItems().setAll(Database.get());
    }
}
