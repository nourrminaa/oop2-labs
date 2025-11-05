package com.nourmina.oop2labs.exercises.lab_exercises.Exercise18;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudentButtonHandler implements EventHandler<ActionEvent> {
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField addressField;
    private Statement st;

    public SaveStudentButtonHandler(TextField firstName, TextField lastName, TextField address, Statement st) {
        this.firstNameField = firstName;
        this.lastNameField = lastName;
        this.addressField = address;
        this.st = st;
    }

    public void handle(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String address = addressField.getText();
        String sql = "INSERT INTO Student (first_name, last_name, address) VALUES ('" + firstName + "', '" + lastName + "', '" + address + "');";
        try {
            st.executeUpdate(sql);
            System.out.println("Student saved!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
