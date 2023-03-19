package com.example.go.View;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import com.example.go.Model.Square;

import java.util.ArrayList;

public class GoBoard {

    GridPane goBoard;
    String theme;
    ArrayList<Square> sqaures = new ArrayList<Square>();


    public GoBoard(GridPane goBoard) {
        this.goBoard = goBoard;

        makeBoard(this.goBoard);
    }

    private void makeBoard(GridPane goBoard) {
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square square = new Square(i, j);
                sqaure.

            }
        }
        // nested loop to create the rows / columns of squares and then add to the gridpane

    }

    private void setTheme(GridPane goBoard, int i, int j) {

    }
}
