package com.nourmina.oop2labs.exercises.lab_exercises;

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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise7 extends Application {
    @Override
    public void start(Stage stage){
        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");

        FlowPane topPane = new FlowPane();
        topPane.getChildren().addAll(leftButton, rightButton);
        topPane.setAlignment(Pos.CENTER);

        RadioButton redRadioButton = new RadioButton("Red");
        BackgroundFill redBackgroundFill = new BackgroundFill(Color.RED, null, null);
        Background redBackground = new Background(redBackgroundFill);
        redRadioButton.setBackground(redBackground);

        RadioButton greenRadioButton = new RadioButton("Green");
        BackgroundFill greenBackgroundFill = new BackgroundFill(Color.GREEN, null, null);
        Background greenBackground = new Background(greenBackgroundFill);
        greenRadioButton.setBackground(greenBackground);

        RadioButton blueRadioButton = new RadioButton("Blue");
        BackgroundFill blueBackgroundFill = new BackgroundFill(Color.BLUE, null, null);
        Background blueBackground = new Background(blueBackgroundFill);
        blueRadioButton.setBackground(blueBackground);

        ToggleGroup toggleGroup = new ToggleGroup();
        redRadioButton.setToggleGroup(toggleGroup);
        greenRadioButton.setToggleGroup(toggleGroup);
        blueRadioButton.setToggleGroup(toggleGroup);

//        blueRadioButton.selectedProperty().addListener((observable, oldValue, newValue) -> {
//            if (newValue) { // When the radio button is selected (checked)
//                blueRadioButton.setStyle("-fx-mark-color: red;"); // Change the mark color
//            } else { // When the radio button is deselected (unchecked)
//                blueRadioButton.setStyle(""); // Reset to default or set another color
//            }
//        });

        FlowPane radioPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        radioPane.getChildren().addAll(redRadioButton, greenRadioButton, blueRadioButton);
        radioPane.setAlignment(Pos.CENTER);
//        BackgroundFill goldBackgroundFill = new BackgroundFill(Color.GOLD, null, null);
//        Background goldBackground = new Background(goldBackgroundFill);
//        radioPane.setBackground(goldBackground);
        radioPane.setStyle("-fx-background-color: gold");

        FlowPane centerPane = new FlowPane();
        Text text = new Text("OOP2 :)");
        centerPane.getChildren().add(text);
        centerPane.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topPane);
        borderPane.setLeft(radioPane);
        borderPane.setCenter(centerPane);

        Scene scene = new Scene(borderPane, 300, 200);
        stage.setTitle("Exercise 7");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
