package project;

import javafx.event.ActionEvent;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class signUpControllerTest {

    @Test
    public void signupAction() throws IOException {
        ActionEvent go = new ActionEvent();
        signUpController controller = new signUpController();
        assertEquals("Signed up successfully", controller.signupAction(go));
    }

    @Test
    public void loginAction() throws IOException {
        ActionEvent go = new ActionEvent();
        signUpController controller = new signUpController();
        assertEquals("Switched successfully", controller.loginAction(go));
    }
}