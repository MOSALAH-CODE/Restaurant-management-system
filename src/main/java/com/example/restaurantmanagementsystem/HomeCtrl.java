package com.example.restaurantmanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeCtrl {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Restaurant");
    }
}