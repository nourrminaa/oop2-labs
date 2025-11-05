package com.nourmina.oop2labs.exercises.lab_exercises.Exercise18;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class ClearStudentButtonHandler implements EventHandler<ActionEvent> {
    private TextField idField;
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField addressField;

    public ClearStudentButtonHandler(TextField id, TextField firstName, TextField lastName, TextField address) {
        this.idField = id;
        this.firstNameField = firstName;
        this.lastNameField = lastName;
        this.addressField = address;
    }

    @Override
    public void handle(ActionEvent event) {
        idField.clear();
        firstNameField.clear();
        lastNameField.clear();
        addressField.clear();
    }
}