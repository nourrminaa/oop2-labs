package com.nourmina.oop2labs.exercises.lab_exercises.Exercise11;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    TextField f1; // here it is global, so we can access it in the handler class
    Stage myStage;
    @Override
    public void start(Stage primaryStage){
        Label l1 = new Label("enter a title");
        TextField t = new TextField();
        FlowPane flow = new FlowPane();
        flow.getChildren().addAll(l1,t);
        flow.setHgap(15);
        flow.setStyle("-fx-background-color: gold;");

        Button b = new Button("change title");
        b.setOnAction(new TitleHandler(primaryStage, t));
        BorderPane pane = new BorderPane();
        pane.setLeft(b);
        pane.setTop(flow);
        Scene s = new Scene(pane, 400, 400);
        primaryStage.setScene(s);
        primaryStage.setTitle("title");
        primaryStage.show();
    }

    public static void main(String[] args){launch(args);}
}
