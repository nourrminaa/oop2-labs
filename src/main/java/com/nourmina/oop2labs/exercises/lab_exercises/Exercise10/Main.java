package com.nourmina.oop2labs.exercises.lab_exercises.Exercise10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start (Stage primaryStage) {
        int count;
        TextField textField;
        textField = new TextField("3");
        textField.setEditable(false);
        count = Integer.parseInt(textField.getText());
        Button incrementButton = new Button("Increment");

        IncrementHandler handler = new IncrementHandler(textField, count);
        incrementButton.setOnAction(handler);

        FlowPane pane = new FlowPane();
        pane.getChildren().addAll(textField, incrementButton);
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Inner Class Increment");
        primaryStage.show();
    }
}
