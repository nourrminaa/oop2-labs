package com.nourmina.oop2labs.exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// EXERCISE 3: BUTTON IN PANE EXERCISE
public class Exercise3 extends Application {
    @Override // override the start() method in Application Class
    public void start(Stage primaryStage) {
        // create a pane and place a button inside the pane
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));

        // create a scene, add the pane to it and place it inside the stage
        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("Exercise 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static  void main (String[] args){
        launch(args);
    }
}
