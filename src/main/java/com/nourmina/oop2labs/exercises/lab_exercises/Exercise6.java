package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercise6 extends Application {
    public void start(Stage stage) {
        BorderPane pane = new BorderPane();

        Button topBtn = new Button("Top");
        pane.setTop(topBtn);
        pane.setAlignment(topBtn, Pos.CENTER);

        Button leftBtn = new Button("Left");
        pane.setLeft(leftBtn);
        pane.setAlignment(leftBtn, Pos.CENTER);

        Button centerBtn = new Button("Center");
        pane.setCenter(centerBtn);
        pane.setAlignment(centerBtn, Pos.CENTER);

        Button rightBtn = new Button("Right");
        pane.setRight(rightBtn);
        pane.setAlignment(rightBtn, Pos.CENTER);

        Button bottomBtn = new Button("Bottom");
        pane.setBottom(bottomBtn);
        pane.setAlignment(bottomBtn, Pos.CENTER);

        Scene scene = new Scene(pane, 300, 200);
        stage.setTitle("Exercise 6");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

