package com.example.go.Model;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class Square extends StackPane {
    private int x, y;
    private Boolean occupied = false;
    private String name;
    private Color color = Color.web("#e4c16f");

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Square";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return this.color;
    }

    public boolean getOccupied() {
        return this.occupied;
    }

    public void setOccupied(boolean bool) {
        this.occupied = bool;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
