package com.example.go.Model;

import javafx.scene.layout.StackPane;

public class Square extends StackPane {
    private int x, y;
    private Boolean occupied;
    private String name;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        this.occupied = false;
    }

    public void setName(String name) {
        this.name = name;

    }
}
