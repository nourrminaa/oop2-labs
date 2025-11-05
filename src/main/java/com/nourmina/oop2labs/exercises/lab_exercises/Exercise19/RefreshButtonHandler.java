package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RefreshButtonHandler implements EventHandler<ActionEvent> {
    TableView t;
    Statement st;

    public RefreshButtonHandler(TableView t, Statement st) {
        this.t = t;
        this.st = st;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try {
            t.getItems().clear();
            String sql = "SELECT * FROM Vegetarian";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                Integer age = rs.getInt("age");
                Boolean is = rs.getInt("isVegetarian") != 0;
                t.getItems().add(new Veg(firstName, lastName, age, is));
            }
        } catch (SQLException e) {
        }
    }
}
