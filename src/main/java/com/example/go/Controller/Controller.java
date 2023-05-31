package com.example.go.Controller;

import com.example.go.Model.Game;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML
    GridPane goBoard;

    public void initialize() {
        Game game = new Game(goBoard);


    }
}