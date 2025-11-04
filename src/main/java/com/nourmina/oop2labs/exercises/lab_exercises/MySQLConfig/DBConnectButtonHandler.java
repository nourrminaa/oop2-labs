package com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.sql.Statement;

public class DBConnectButtonHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent t) {
        DBConnectMySQL db = new DBConnectMySQL();
        Statement st = db.getStatement();
    }
}

