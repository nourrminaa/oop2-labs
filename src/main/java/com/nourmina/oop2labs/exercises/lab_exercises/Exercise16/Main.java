package com.nourmina.oop2labs.exercises.lab_exercises.Exercise16;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.sql.Statement;

public class Main extends Application {
    DBConnectMySQL db = new DBConnectMySQL();
    Statement st = db.getStatement();

    public void start(Stage primaryStage) {
        Label firstName = new Label("First Name");
        Label lastName = new Label("Last Name");
        Label age = new Label("Age");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        CheckBox isVegetarian = new CheckBox("Vegetarian");

        Button add = new Button("Add");
        add.setOnAction(new AddButtonHandler(tf1, tf2, tf3, isVegetarian, st));

        FlowPane pane1 = new FlowPane(10, 0);
        pane1.getChildren().addAll(firstName, tf1);

        FlowPane pane2 = new FlowPane(10, 0);
        pane2.getChildren().addAll(lastName, tf2);

        FlowPane pane3 = new FlowPane(46, 0);
        pane3.getChildren().addAll(age, tf3);

        FlowPane pane4 = new FlowPane();
        pane4.getChildren().add(isVegetarian);

        FlowPane pane5 = new FlowPane();
        pane5.getChildren().add(add);

        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.getChildren().addAll(pane1, pane2, pane3, pane4, pane5);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 16");
        primaryStage.show();
    }
}
