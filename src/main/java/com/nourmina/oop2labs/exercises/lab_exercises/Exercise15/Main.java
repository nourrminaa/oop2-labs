package com.nourmina.oop2labs.exercises.lab_exercises.Exercise15;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage)
    {
        Button cancelBtn = new Button("CANCEL");
        Button okBtn = new Button("OK");

        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.getChildren().addAll(okBtn,cancelBtn);
        Scene scene = new Scene(pane);

        OkCancelButtonHandler handler = new OkCancelButtonHandler();
        cancelBtn.setOnAction(handler);
        okBtn.setOnAction(handler);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 15");
        primaryStage.show();
    }
}
