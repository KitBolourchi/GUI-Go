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
//        Image image = new Image("View/Stones/blackStone.png");
        goBoard.getGoBoard().setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                EventTarget target = mouseEvent.getTarget();

                if(target.toString().equals("Square")) {
                    Square square = (Square) target;
                    if(!square.getOccupied()) {

                    }

                }
                mouseEvent.consume();
                // TODO add way to have image hover with cursor if square is not occupied
            }
        });

    }
}
