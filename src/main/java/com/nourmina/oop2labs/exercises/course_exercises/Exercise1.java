package com.nourmina.oop2labs.exercises.course_exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// EXERCISE 1: MY FIRST JAVAFX APP
public class Exercise1 extends Application {
    @Override // override the start method in the Application Class
    public void start(Stage primaryStage) {
        // Create a Scene and place a Button inside it
        Button btOK = new Button("OK");
        Scene scene  = new Scene (btOK, 1, 250); // button, width, height
        primaryStage.setTitle("Exercise 1"); // set a title to the stage
        primaryStage.setScene(scene); // set the scene inside the stage
        primaryStage.show(); // display the stage
    }

    // main is only used for ide support, if the app is run through cmd no need
    public static void main(String[] args){
        launch(args);
    }
}
