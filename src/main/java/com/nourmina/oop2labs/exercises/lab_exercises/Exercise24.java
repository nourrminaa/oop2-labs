package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// GUI with multiple threads
public class Exercise24 extends Application {
    // in this exercise we will put a Text in the middle and a Button at the center bottom
    // when we click the button, 3 threads will start changing the text color to red, green, and blue

    public void start (Stage primaryStage) {
        Text fullName = new Text("Nour Mina");
        Button rgb = new Button("Click Me!");

        // center the button to put it in the bottom later -> centerBottom
        HBox box = new HBox(rgb);
        box.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        pane.setCenter(fullName);
        pane.setBottom(box);
        pane.setPadding(new Insets(20));

        rgb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Thread red = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) { // while true will keep the thread running
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    fullName.setFill(Color.RED);
                                }
                            });

                            // mandatory to add sleep in order to see the color changing
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {}
                        }
                    }
                });

                Thread green = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    fullName.setFill(Color.GREEN);
                                }
                            });
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {}
                        }
                    }
                });

                Thread blue = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    fullName.setFill(Color.BLUE);
                                }
                            });
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {}
                        }
                    }
                });

                red.start();
                green.start();
                blue.start();
            }
        });

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Multithreading GUI");
        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}
