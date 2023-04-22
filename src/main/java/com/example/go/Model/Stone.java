package com.example.go.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Stone extends ImageView {
    String colour;
    int posX;
    int posY;

    public Stone(String colour, int posX, int posY) {
        this.colour = colour;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColour() {
        return this.colour;
    }

    public void setPiece(Image image) {
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(60);
        imageView.setFitWidth(60);

        this.setImage(imageView.snapshot(null, null));
    }

    public void setImage() {
        this.setPiece(new Image(new File("src/main/resources/com/example/go/Stones/" + this.colour + "Stone.png").toURI().toString()));
    }
}
