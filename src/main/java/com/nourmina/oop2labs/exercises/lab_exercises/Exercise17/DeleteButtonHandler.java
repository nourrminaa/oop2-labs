package com.nourmina.oop2labs.exercises.lab_exercises.Exercise17;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteButtonHandler implements EventHandler<ActionEvent> {
    ComboBox c;
    Statement st;

    public DeleteButtonHandler(ComboBox c, Statement st){
        this.c = c;
        this.st = st;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        int id = (int) c.getValue();
        String sql = "DELETE FROM Student WHERE id = " + id + ";";
        try {
            st.executeUpdate(sql);
            System.out.println("std deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // TO REFRESH THE COMBOBOX AFTER MODIFICATION
        c.getItems().clear();
        String sql1 = "SELECT * FROM Student";
        try {
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()){
                c.getItems().add(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}