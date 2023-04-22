package com.example.go;

import com.example.go.View.GoBoard;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Go");
        Scene scene = new Scene(root, 600, 600);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
//        scene.addEventFilter(MouseEvent.ANY, e -> System.out.println( e));

        // maybe have a mouse event based on if it is within a squares corner radii?
    }

    public static void main(String[] args) {
        launch();
    }
}