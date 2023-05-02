package com.example.go.Model;

import com.example.go.View.GoBoard;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Game {
    public static String currentPlayer;
    public static GoBoard gb;

    public Game(GridPane goBoard) {
        gb = new GoBoard(goBoard);
        setEventHandlers(gb);
    }

    public void setEventHandlers(GoBoard goBoard) {
        goBoard.getGoBoard().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int playerTurn = 1;
                currentPlayer = playerTurn % 2 == 0 ? "white" : "black";
                EventTarget target = mouseEvent.getTarget();

                if(target.toString().equals("Square")) {
                    Square square = (Square) target;
                    System.out.println(square.getOccupied());
                    if(!square.getOccupied()) {
                        Stone stone = new Stone(currentPlayer, square.getX(), square.getY());
                        stone.setImage();
                        goBoard.addPiece(square, stone);

                    }
                }
                mouseEvent.consume();
            }
        });

    }
}
