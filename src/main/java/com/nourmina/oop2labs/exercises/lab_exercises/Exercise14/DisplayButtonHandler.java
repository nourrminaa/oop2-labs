package com.nourmina.oop2labs.exercises.lab_exercises.Exercise14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayButtonHandler implements EventHandler<ActionEvent> {
    Statement st;

    public DisplayButtonHandler (Statement st){
        this.st = st;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String sql = "SELECT * FROM oop2.person";
        try{
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println("ID:" + rs.getInt("id") + "\nFirst Name:" +rs.getString("fn")+"\nLast Name:"+ rs.getString("ln") );
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
