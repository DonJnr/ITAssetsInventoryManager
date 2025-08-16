package com.example.itassetsinventorymanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginViewController {
    @FXML private AnchorPane root;  //fx:id="root"
    @FXML private AnchorPane loginForm; //fx:id="loginForm"
    @FXML private Label loginErrorMessage;  //fx:id="loginErrorMessage"
    @FXML private TextField usernameField;  //fx:id="usernameField"
    @FXML private PasswordField passwordField;  //fx:id="passwordField"
    @FXML private Button loginButton;   //fx:id="loginButton"

    @FXML
    protected void login() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adminView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) loginForm.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
    }
}
