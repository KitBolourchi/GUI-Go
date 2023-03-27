package com.example.go.Model;

import com.example.go.View.GoBoard;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Game {
    public static String currentPlayer;
    public static GoBoard gb;

    public Game(GridPane goBoard) {
        gb = new GoBoard(goBoard);
        gb.getGoBoard().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                mouseEvent.consume();
                System.out.println("Image! " + mouseEvent.getTarget());
            }
        });
    }

    public void setEventHandlers(GridPane goBoard) {
        //utilise the nodes (sqaures .mouse entered functions)

    }
}
