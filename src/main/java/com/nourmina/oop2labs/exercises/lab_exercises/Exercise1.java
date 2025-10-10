package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise1 extends Application {
    public void start(Stage primaryStage) {
        Button btn = new Button("Submit");
        Label lbl1 = new Label("first name");
        Label lbl2 = new Label("last name");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        FlowPane pane = new FlowPane();
        // StackPane pane = new StackPane();
        // Pane pane = new Pane();
        pane.getChildren().addAll(lbl1, tf1, lbl2, tf2, btn);

        Scene scene = new Scene(pane, 200, 200);
        scene.setFill(Color.BEIGE);

        primaryStage.setTitle("Exercise 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // NOTE: we notice in this exercise that using FlowPane layout,
        // the components are placed in a row until no more components can fit in that row,
        // then a new row is started automatically.

        // when we use StackPane layout, all components are placed on top of each other
        // in the center of the pane.

        // when we use Pane layout, all components are placed in the top-left corner of the pane.
}
