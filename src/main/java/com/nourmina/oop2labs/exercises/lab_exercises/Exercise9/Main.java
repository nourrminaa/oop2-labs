package com.nourmina.oop2labs.exercises.lab_exercises.Exercise9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Button b = new Button("Click Me to Say Hello");
        b.setOnAction(new HelloHandler());

        Scene scene = new Scene(b, 300, 200);
        primaryStage.setTitle("Exercise 9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
