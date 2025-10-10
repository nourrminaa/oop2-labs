package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.Flow;

public class Exercise3 extends Application {
    public void start(Stage primaryStage){
        Text title = new Text(20, 20, "JavaFX Text Customization"); // add the position of the text
        title.setFont(Font.font("Arial",  FontWeight.BOLD, FontPosture.ITALIC, 24));

        FlowPane flowPane1 = new FlowPane();
        flowPane1.getChildren().add(title);

        Text subtitle = new Text(50, 50, "Learning JavaFX");
        subtitle.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
        subtitle.setFill(Color.GREEN);
        subtitle.setUnderline(true); // underline effect

        FlowPane flowPane2 = new FlowPane();
        flowPane2.getChildren().add(subtitle);
        flowPane2.setPadding(new Insets(20, 0, 0, 20)); // left padding + top

        Text txt1 = new Text(20, 20, "Shapes and Text");
        txt1.setFont(Font.font("New Times Roman", FontWeight.NORMAL, FontPosture.REGULAR, 14));
        txt1.setFill(Color.RED);
        txt1.setStrikethrough(true); // strikethrough effect

        FlowPane flowPane3 = new FlowPane();
        flowPane3.getChildren().add(txt1);

        Text txt2 = new Text(20, 20, "JavaFX Text");
        txt2.setFont(Font.font("Arial",FontWeight.BOLD ,FontPosture.REGULAR, 23));
        txt2.setFill(Color.PURPLE);
        txt2.setStroke(Color.BLACK);

        FlowPane flowPane4 = new FlowPane();
        flowPane4.getChildren().add(txt2);

        FlowPane mainPane = new FlowPane();
        mainPane.getChildren().addAll(flowPane1, flowPane2, flowPane3, flowPane4);
        mainPane.setPadding(new Insets(40)); // add padding to the whole window

        Scene scene = new Scene(mainPane, 400, 400);

        primaryStage.setTitle("Exercise 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
