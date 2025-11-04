package com.nourmina.oop2labs.exercises.lab_exercises.Exercise12;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class MoveHandler implements EventHandler<ActionEvent> {
    Text f;
    String s;

    public MoveHandler (Text f, String s){
        this.f = f;
        this.s = s;
    }

    public void handle(ActionEvent actionEvent) {
        if (s.equals("left")){
            f.setLayoutX(f.getLayoutX() - 10);
        } else {
            f.setLayoutX(f.getLayoutX() + 10);
        }
    }
}