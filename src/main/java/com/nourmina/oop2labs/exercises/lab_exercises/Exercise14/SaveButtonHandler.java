package com.nourmina.oop2labs.exercises.lab_exercises.Exercise14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.sql.Statement;

public class SaveButtonHandler implements EventHandler<ActionEvent> {
    private TextField usernameField;
    private TextField passwordField;
    private Statement st;

    public SaveButtonHandler(Statement st, TextField usernameField, TextField passwordField) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.st = st;
    }

    @Override
    public void handle(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String sql = "INSERT INTO Person (fn, ln) VALUES ('" + username + "', '" + password + "')";
        try {
            st.executeUpdate(sql);
            System.out.println("User saved!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}