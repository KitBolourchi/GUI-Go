package com.example.go.Model;

import com.example.go.View.GoBoard;
import javafx.scene.layout.GridPane;

public class Game {
    public static String currentPlayer;
    public static GoBoard gb;

    public Game(GridPane goBoard) {
        gb = new GoBoard(goBoard);
    }

    public void setEventHandlers(GridPane goBoard) {

    }
}
