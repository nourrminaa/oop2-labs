package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Exercise25 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Circle redLight = new Circle(30);
        redLight.setStroke(Color.BLACK);
        redLight.setFill(Color.TRANSPARENT);

        Circle yellowLight = new Circle(30);
        yellowLight.setStroke(Color.BLACK);
        yellowLight.setFill(Color.TRANSPARENT);

        Circle greenLight = new Circle(30);
        greenLight.setStroke(Color.BLACK);
        greenLight.setFill(Color.TRANSPARENT);

        Rectangle rectangle = new Rectangle(100, 300);
        rectangle.setFill(Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);

        // add a timer to mimic a traffic light changing colors
        Timer redTimer = new Timer();
        Timer yellowTimer = new Timer();
        Timer greenTimer = new Timer();

        redTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        resetLights(redLight, yellowLight, greenLight);
                        redLight.setFill(Color.RED);
                    }
                });
            }
        }, 0, 20000);
        // the numbers mean delay and period in milliseconds
        // 0: start immediately
        // 20000: repeat every 20 seconds

        yellowTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        resetLights(redLight, yellowLight, greenLight);
                        yellowLight.setFill(Color.YELLOW);
                    }
                });
            }
        }, 10000, 20000);
        // starts after 10 seconds, repeats every 20 seconds

        greenTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        resetLights(redLight, yellowLight, greenLight);
                        greenLight.setFill(Color.GREEN);
                    }
                });
            }
        }, 15000, 20000);
        // starts after 15 seconds, repeats every 20 seconds

        // arranging the lights in a column
        VBox lightsColumn = new VBox(20, redLight, yellowLight, greenLight);
        lightsColumn.setAlignment(Pos.CENTER);

        // to put the rectangle behind the lights, creating an illusion of a border
        StackPane stack = new StackPane(rectangle, lightsColumn);
        stack.setPrefSize(100, 300);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stack);

        Scene scene = new Scene(borderPane, 200, 400);
        primaryStage.setTitle("Exercise 25");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void resetLights (Circle c1, Circle c2, Circle c3) {
        c1.setFill(Color.TRANSPARENT);
        c2.setFill(Color.TRANSPARENT);
        c3.setFill(Color.TRANSPARENT);
    }

    public static void main(String[] args) {
        launch(args);
    }
}