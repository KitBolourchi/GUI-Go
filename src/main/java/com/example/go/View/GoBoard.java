package com.example.go.View;

import com.example.go.Model.Stone;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

import com.example.go.Model.Square;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class GoBoard {

    private GridPane goBoard;
    private String theme;
    private ArrayList<Square> squares = new ArrayList<Square>();


    public GoBoard(GridPane goBoard) {
        this.goBoard = goBoard;

        makeBoard(this.goBoard);
    }

    private void makeBoard(GridPane goBoard) {
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square square = new Square(i, j);
                square.setName("Square");
                square.setPrefHeight(100);
                square.setPrefWidth(100);
                square.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                square.setBackground(new Background(new BackgroundFill(square.getColor(), CornerRadii.EMPTY, Insets.EMPTY)));

                goBoard.add(square, i, j, 1, 1);
                squares.add(square);
            }
        }
    }

    public GridPane getGoBoard() {
        return goBoard;
    }

    public void addPiece(Square square, Stone stone){
        square.getChildren().add(stone);
        square.setOccupied(true);
    }
//
//    public Square getSquare
}
