package com.example.itassetsinventorymanager;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminViewController implements Initializable {

    /* Menu Buttons */
    @FXML private Button dashboardButton;   // fx:id="dashboardButton"
    @FXML private Button usersButton;   // fx:id="usersButton"
    @FXML private Button inventoryButton;   // fx:id="inventoryButton"
    @FXML private Button repairsButton; // fx:id="repairsButton"
    @FXML private Button supportOfficeButton;   // fx:id="supportOfficeButton"
    @FXML private Button medicalCenterButton;   // fx:id="medicalCenterButton"
    @FXML private Button disposalButton;    // fx:id="disposalButton"
    @FXML private Button logoutButton;  // fx:id="logoutButton"

    /* Anchor Panes */
    @FXML private AnchorPane adminViewPane;
    //@FXML private AnchorPane menuButtonsPane;   // fx:id="menuButtonsPane"
    @FXML private AnchorPane dashboardPane;   // fx:id="dashboardPane"
    @FXML private AnchorPane disposalPane;    // fx:id="disposalPane"
    @FXML private AnchorPane inventoryPane;   // fx:id="inventoryPane"
    @FXML private AnchorPane medicalCenterPane; // fx:id="medicalCenterPane"
    @FXML private AnchorPane repairsPane; // fx:id="repairsPane"
    @FXML private AnchorPane supportOfficePane; // fx:id="supportOfficePane"
    @FXML private AnchorPane usersPane; // fx:id="usersPane"

    /* Table Views */
    @FXML private TableView usersTableView; // fx:id="usersTableView"

    /* TableView Columns */
    @FXML private TableColumn firstNameColumn;  // fx:id="firstNameColumn"
    @FXML private TableColumn lastNameColumn;   // fx:id="lastNameColumn"
    @FXML private TableColumn usernameColumn;   // fx:id="usernameColumn"
    @FXML private TableColumn passwordColumn;   // fx:id="passwordColumn"
    @FXML private TableColumn roleColumn;   // fx:id="roleColumn"

    private void showPane(AnchorPane anchorPane) {
        dashboardPane.setVisible(false);
        inventoryPane.setVisible(false);
        repairsPane.setVisible(false);
        supportOfficePane.setVisible(false);
        disposalPane.setVisible(false);
        medicalCenterPane.setVisible(false);
        usersPane.setVisible(false);

        anchorPane.setVisible(true);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dashboardButton.setOnAction(event -> {
            showPane(dashboardPane);
        });

        usersButton.setOnAction(event -> {
            showPane(usersPane);
        });

        inventoryButton.setOnAction(event -> {
            showPane(inventoryPane);
        });

        repairsButton.setOnAction(event -> {
            showPane(repairsPane);
        });

        supportOfficeButton.setOnAction(event -> {
            showPane(supportOfficePane);
        });

        medicalCenterButton.setOnAction(event -> {
            showPane(medicalCenterPane);
        });

        disposalButton.setOnAction(event -> {
            showPane(disposalPane);
        });

        usersTableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

    }

    @FXML protected void logout() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) adminViewPane.getScene().getWindow();
        stage.setScene(scene);
        stage.setResizable(false);
    }
}
