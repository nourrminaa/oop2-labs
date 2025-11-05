package com.nourmina.oop2labs.exercises.lab_exercises.Exercise20;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateButtonHandler implements EventHandler<ActionEvent> {
    TextField fn;
    TextField ln;
    TextField age;
    CheckBox is;
    Statement st;
    TextField id;

    public UpdateButtonHandler(TextField id, TextField fn, TextField ln, TextField age, CheckBox is, Statement st) {
        this.id = id;
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
        int iD;
        try {
            ageValue = Integer.parseInt(age.getText());
            iD = Integer.parseInt(id.getText());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
            return;
        }
        int isV = is.isSelected() ? 1 : 0;

        try {
            ResultSet rs = st.executeQuery("SELECT idVegetarian FROM Vegetarian WHERE idVegetarian = " + id.getText());
            if (rs.next()) {
                String sql = "UPDATE Vegetarian SET firstname = '" + firstName +
                        "', lastname = '" + lastName +
                        "', age = " + ageValue +
                        ", isVegetarian = " + isV +
                        " WHERE idVegetarian = " + id.getText();
                st.executeUpdate(sql);
                System.out.println("User updated!!");
            } else {
                // Insert logic
                String sql = "INSERT INTO Vegetarian (firstname, lastname, age, isVegetarian) VALUES ('"
                        + firstName + "', '" + lastName + "', " + ageValue + ", " + isV + ")";
                st.executeUpdate(sql);
                System.out.println("User saved!!");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
