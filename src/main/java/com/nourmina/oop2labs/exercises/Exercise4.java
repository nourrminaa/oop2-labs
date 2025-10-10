package com.nourmina.oop2labs.exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// EXERCISE 4: CIRCLES IN PANE EXERCISE
public class Exercise4 extends Application {
    @Override
    public void start (Stage primaryStage){
        // create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        // create a pane and place the circle inside the pane
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // create a scene, add the pane to it, and place it inside the stage
        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("Exercise4");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}
