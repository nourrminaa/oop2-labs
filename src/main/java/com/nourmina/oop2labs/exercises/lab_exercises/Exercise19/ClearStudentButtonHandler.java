package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ClearStudentButtonHandler implements EventHandler<ActionEvent> {
    TextField fn;
    TextField ln;
    TextField age;
    CheckBox is;

    public ClearStudentButtonHandler(TextField fn, TextField ln, TextField age, CheckBox is){
        this.fn = fn;
        this.ln = ln;
        this.age = age;
        this.is = is;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        fn.clear();
        ln.clear();
        age.clear();
        is.setSelected(false);
    }
}
