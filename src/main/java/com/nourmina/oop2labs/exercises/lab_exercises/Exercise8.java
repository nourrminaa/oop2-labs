package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Exercise8 extends Application {

    public void start(Stage primaryStage){
        BorderPane pane = new BorderPane();
        pane.setTop(getHbox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("HBox and VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public HBox getHbox(){
        HBox hbox = new HBox(15);
        hbox.setPadding(new Insets(15, 15, 15, 15));
        hbox.setStyle("-fx-background-color: blue;");

        Button buttonCurrent = new Button("Computer Science");
        buttonCurrent.setPrefSize(200, 40);

        Button buttonProjected = new Button("Math");
        buttonProjected.setPrefSize(200, 40);

        hbox.getChildren().addAll(buttonCurrent, buttonProjected);
        return hbox;
    }

    public VBox getVBox() {
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(15, 15, 15, 15));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = { new Label("CSC101"), new Label("CSC102"), new Label("CSC103"), new Label("CSC104")};
        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }

    public static void main(String[] args){launch(args);}
}