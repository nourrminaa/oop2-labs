package com.nourmina.oop2labs.exercises.lab_exercises.Exercise13;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectButtonHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Button button = new Button("Connect");
        button.setOnAction(new DBConnectButtonHandler());

        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setTitle("Database Connection Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
