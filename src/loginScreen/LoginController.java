package loginScreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private TextField nameField;
    @FXML private PasswordField passField;
    @FXML private Button logInButton;
    @FXML private Button signUpButton;

    @FXML
    public void onActionLogInButton() {

    }

    @FXML
    public void onActionSignUpButton() {
        try {
            Stage registration = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/registrationForm/registration_form.fxml"));
            registration.setTitle("Registration");
            registration.setScene(new Scene(root));
            registration.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
