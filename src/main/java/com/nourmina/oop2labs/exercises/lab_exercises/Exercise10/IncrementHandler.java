package com.nourmina.oop2labs.exercises.lab_exercises.Exercise10;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class IncrementHandler implements EventHandler<ActionEvent> {
    private int count;
    private TextField textField;

    public IncrementHandler(TextField textField, int initialCount) {
        this.textField = textField;
        this.count = initialCount;
    }
    @Override
    public void handle(ActionEvent event) {
        count++;
        textField.setText("" + count);
        }
}
