package com.nourmina.oop2labs.exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// EXERCISE 2: MULTISTAGE EXERCISE
public class Exercise2 extends Application {
    @Override // override the start() in Application
    public void start (Stage primaryStage) {
        // create a scene and put a button inside the scene
        Scene scene = new Scene (new Button ("OK"), 200, 250);
        primaryStage.setTitle("Exercise 2: primaryStage");
        primaryStage.setScene(scene);
        primaryStage.show(); // show the primary stage

        // create a new stage, scene, and put another button inside this scene
        Stage stage = new Stage();
        stage.setTitle("Exercise 2: second stage");
        stage.setScene(new Scene(new Button("NEW STAGE"), 100, 150));
        stage.show(); // show the secondary stage
    }

    public static void main(String[] args){
        launch(args);
    }
}
