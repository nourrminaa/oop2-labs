package com.nourmina.oop2labs.exercises.lab_exercises.Exercise11;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TitleHandler implements EventHandler<ActionEvent> {
    Stage stage;
    TextField t;
    public TitleHandler(Stage s, TextField t){
        stage = s;
        this.t = t;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setTitle(t.getText());
    }
}
