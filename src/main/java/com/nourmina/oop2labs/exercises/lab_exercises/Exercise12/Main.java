package com.nourmina.oop2labs.exercises.lab_exercises.Exercise12;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");

        FlowPane topPane = new FlowPane();
        topPane.getChildren().addAll(leftButton, rightButton);
        topPane.setAlignment(Pos.CENTER);

        RadioButton redRadioButton = new RadioButton("Red");
        redRadioButton.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
        RadioButton greenRadioButton = new RadioButton("Green");
        greenRadioButton.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
        RadioButton blueRadioButton = new RadioButton("Blue");
        blueRadioButton.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));

        ToggleGroup toggleGroup = new ToggleGroup();
        redRadioButton.setToggleGroup(toggleGroup);
        greenRadioButton.setToggleGroup(toggleGroup);
        blueRadioButton.setToggleGroup(toggleGroup);

        FlowPane radioPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        radioPane.getChildren().addAll(redRadioButton, greenRadioButton, blueRadioButton);
        radioPane.setAlignment(Pos.CENTER);
        radioPane.setStyle("-fx-background-color: gold");

        Pane centerPane = new Pane();
        Text text = new Text("OOP2 :)");
        text.setLayoutX(100);
        text.setLayoutY(80);
        centerPane.getChildren().add(text);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topPane);
        borderPane.setLeft(radioPane);
        borderPane.setCenter(centerPane);

//        MoveHandler handler = new MoveHandler (text, leftButton.getText());
        leftButton.setOnAction(new MoveHandler(text, "left"));
        rightButton.setOnAction(new MoveHandler(text, "right"));

        Scene scene = new Scene(borderPane, 300, 200);
        stage.setTitle("Exercise 7");
        stage.setScene(scene);
        stage.show();
    }
}