package com.example.go.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.ArrayList;

public class Stone extends ImageView {
    private String colour;
    private int posX;
    private int posY;
    private ArrayList<String> liberties;

    public Stone(String colour, int posX, int posY) {
        this.colour = colour;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColour() {
        return this.colour;
    }

    public void setPiece(Image image) {
        this.setImage(image);
    }

    public void setImage() {
        this.setPiece(new Image(new File("src/main/resources/com/example/go/Stones/" + this.colour + "Stone.png").toURI().toString(), 50, 50, false, false));
    }

    public void checkLiberties() {
        int x = this.posX;
        int y = this.posY;

        String name;

        ArrayList<String> libChecks = new ArrayList<>();
        this.liberties = new ArrayList<>();

        libChecks.add("Square" + (x+1) + y);
        libChecks.add("Square" + (x-1) + y);
        libChecks.add("Square" + x + (y+1));
        libChecks.add("Square" + x + (y-1));

        for (String check : libChecks) {
            if(getSquareByName(check).getOccupied()) {
                System.out.println(getSquareByName(check).getStone().getColour());
                // TODO: add new method to check the colors of nearby squares and allow or dis allow placement of stone
                this.liberties.add(check);
            }
        }


    }

    public Square getSquareByName(String name){
        for(Square square : Game.gb.getSquares()){
            if(square.getName().equals(name)){
                return square;
            }
        }
        return null;
    }

    public ArrayList<String> getLiberties() {
        return liberties;
    }
}
