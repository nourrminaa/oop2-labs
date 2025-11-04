package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise5 extends Application {
    @Override
    public void start (Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(30));
        pane.setVgap(10);
        pane.setHgap(10);

        Label usernameLabel = new Label("username:");
        TextField usernameField = new TextField();
        pane.add(usernameLabel, 0, 0);
        pane.add(usernameField, 1, 0);

        Label passwordLabel = new Label("password:");
        TextField passwordField = new TextField();
        pane.add(passwordLabel, 0, 1);
        pane.add(passwordField, 1, 1);

        Button loginButton = new Button("Login");
        pane.add(loginButton, 0, 2);
        Button clearButton = new Button("Clear");
        pane.add(clearButton, 1, 2);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args){
        launch(args);
    }
}
