package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class logInControllerTest {

    @Test
    public void loginAction() throws IOException {
        ActionEvent go = new ActionEvent();
        logInController controller = new logInController();
        assertEquals("Logged in successfully", controller.loginAction(go));
    }

    @Test
    public void signupAction() throws IOException {
        ActionEvent go = new ActionEvent();
        logInController controller = new logInController();
        assertEquals("Switched successfully", controller.signupAction(go));
    }
}