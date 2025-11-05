package com.nourmina.oop2labs.exercises.lab_exercises.Exercise15;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class OkCancelButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        if(((Button) actionEvent.getSource()).getText().equals("OK")){
            System.out.println("you just clicked ok");
        }
        else{
            System.out.println("you just clicked cancel");
        }
    }
}
