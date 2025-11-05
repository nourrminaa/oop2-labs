package com.nourmina.oop2labs.exercises.lab_exercises.Exercise14;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.sql.Statement;

public class Main extends Application {
    public void start(Stage primaryStage) {
        DBConnectMySQL db = new DBConnectMySQL();
        Statement st = db.getStatement();

        Label lb1 = new Label("first name");
        Label lb2 = new Label("last name");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Button submitBtn = new Button("save");
        Button clearBtn = new Button("display");

        submitBtn.setOnAction(new SaveButtonHandler(st, tf1, tf2));
        clearBtn.setOnAction(new DisplayButtonHandler(st));

        FlowPane firstNamePane = new FlowPane(5, 7); // the first one is the Horizontal Gap, the second is the Vertical Gap between the nodes in the same pane
        firstNamePane.getChildren().addAll(lb1, tf1);
        firstNamePane.setPadding(new Insets(5, 0, 0, 0));

        FlowPane lastNamePane = new FlowPane(7, 7);
        lastNamePane.getChildren().addAll(lb2, tf2);
        lastNamePane.setPadding(new Insets(5, 0, 0, 0));

        FlowPane buttonsPane = new FlowPane(32, 7);
        buttonsPane.getChildren().addAll(submitBtn, clearBtn);
        buttonsPane.setPadding(new Insets(5, 0, 0, 60));

        FlowPane mainPane = new FlowPane(Orientation.VERTICAL); // make the panes vertical
        mainPane.getChildren().addAll(firstNamePane, lastNamePane, buttonsPane);
        mainPane.setPadding(new Insets(30));

        Scene scene = new Scene(mainPane);

        primaryStage.setTitle("Exercise 14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){launch(args);}
}
