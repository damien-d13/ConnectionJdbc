package fr.damien.connectionbdd;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.awt.*;
import java.sql.SQLException;

public class HomeController {
    @FXML
    private TextField userName;

    @FXML
    private TextField userAddress;

    @FXML
    private Button sendBdd;

    @FXML
    private TextArea textuser;

    @FXML
    private Button getUser;

    @FXML
    void getOnBdd(ActionEvent event) {

        JdbcDao jdbcDao = new JdbcDao();
        textuser.setText(jdbcDao.getRecord());
    }

    @FXML
    void onSendBdd(ActionEvent event) throws SQLException {
        System.out.println("start");


        System.out.println(userName.getText());
        System.out.println(userAddress.getText());


        String name = userName.getText();
        String address = userAddress.getText();

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.insertRecord(name,  address);

    }

    private static void showAlert(Alert.AlertType alertType, java.awt.Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.show();
    }
}