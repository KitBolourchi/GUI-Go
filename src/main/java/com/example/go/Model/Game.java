package com.example.go.Model;

import com.example.go.View.GoBoard;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Game {
    public static String currentPlayer;
    public static GoBoard gb;

    public Game(GridPane goBoard) {
        gb = new GoBoard(goBoard);
        currentPlayer = "black";
        setEventHandlers(gb);
    }

    public void setEventHandlers(GoBoard goBoard) {
        goBoard.getGoBoard().setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("This is moving");
            }
        });
        goBoard.getGoBoard().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                EventTarget target = mouseEvent.getTarget();

                if(target.toString().equals("Square")) {
                    Square square = (Square) target;
                    if(!square.getOccupied()) {
                        Stone stone = new Stone(currentPlayer, square.getX(), square.getY());
                        stone.setImage();
                        stone.checkLiberties();
                        if (stone.getLiberties().size() > 3) {
                            System.out.println("Cannot place stone");
                        } else {
                            goBoard.addPiece(square, stone);
                            square.setStone(stone);
                        }
                        currentPlayer = currentPlayer.equals("white") ? "black" : "white";
                    }
                }
                mouseEvent.consume();
            }
        });

    }
}
