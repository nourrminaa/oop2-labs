package com.nourmina.oop2labs.exercises.lab_exercises.Exercise9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HelloHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Hello, World!");
    }
}