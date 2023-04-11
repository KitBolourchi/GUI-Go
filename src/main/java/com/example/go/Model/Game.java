package com.example.go.Model;

import com.example.go.View.GoBoard;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.scene.Node;
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
                EventTarget target = mouseEvent.getTarget();

                if(target.toString().equals("Square")) {
                    Square square = (Square) target;
                    System.out.println(square.getChildren());

                }
                mouseEvent.consume();
                System.out.println("Square! " + mouseEvent.getTarget());
                System.out.println(mouseEvent.getSource());
                // something to use is gridpanes children, seems squares are stored there?
            }
        });

    }
}
