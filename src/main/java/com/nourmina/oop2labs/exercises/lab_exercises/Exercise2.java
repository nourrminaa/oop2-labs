package com.nourmina.oop2labs.exercises.lab_exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise2 extends Application {
    @Override
    public void start (Stage primaryStage){
        Circle c1 = new Circle();
        c1.setCenterX(50);
        c1.setCenterY(50);
        c1.setRadius(50);
        c1.setFill(Color.rgb(100, 200, 255));

        Pane pane = new Pane();
        pane.getChildren().add(c1);

        Scene scene = new Scene(pane, 100, 100);
        primaryStage.setTitle("Exercise 2: Circle1");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage secondaryStage = new Stage();
        Circle c2 = new Circle();
        c2.setCenterX(50);
        c2.setCenterY(50);
        c2.setRadius(50);
        c2.setFill(Color.BLUE);
        c2.setOpacity(0.25);

        Circle c3 = new Circle();
        c3.setCenterX(50);
        c3.setCenterY(50);
        c3.setRadius(30);
        c3.setFill(Color.BLUE);
        c3.setOpacity(0.5); // to set the transparency of the circle

        Circle c4 = new Circle();
        c4.setCenterX(50);
        c4.setCenterY(50);
        c4.setRadius(15);
        c4.setFill(Color.BLUE);

        Pane pane2 = new Pane();
        pane2.getChildren().addAll(c2, c3, c4);
        Scene scene2 = new Scene(pane2, 100, 100);
        secondaryStage.setTitle("Exercise 2: Circle2");
        secondaryStage.setScene(scene2);
        secondaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
