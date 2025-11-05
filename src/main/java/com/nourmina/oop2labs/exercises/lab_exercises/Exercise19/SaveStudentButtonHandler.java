package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.sql.Statement;

public class SaveStudentButtonHandler implements EventHandler<ActionEvent> {
    TextField fn;
    TextField ln;
    TextField age;
    CheckBox is;
    Statement st;

    public SaveStudentButtonHandler(TextField fn, TextField ln, TextField age, CheckBox is, Statement st){
        this.fn = fn;
        this.ln = ln;
        this.age = age;
        this.is = is;
        this.st = st;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String firstName = fn.getText();
        String lastName = ln.getText();
        int ageValue;
        try {
            ageValue = Integer.parseInt(age.getText());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input!");
            return;
        }
        int isV = is.isSelected() ? 1 : 0;

        String sql = "INSERT INTO Vegetarian (firstname, lastname, age, isVegetarian) VALUES ('"
                + firstName + "', '" + lastName + "', " + ageValue + ", " + isV + ")";
        try {
            st.executeUpdate(sql);
            System.out.println("User saved!!");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
