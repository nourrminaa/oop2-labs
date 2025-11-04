package com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig;

import java.sql.*;

public class DBConnectMySQL {
    private Statement stmt;

    public DBConnectMySQL(){
        final String DB_HOST = "jdbc:mysql://localhost/oop2";
        final String DB_USER = "root";
        final String DB_PWD = "";

        try{
            Connection con = DriverManager.getConnection(DB_HOST, DB_USER, DB_PWD);
            this.stmt = con.createStatement();
            System.out.println("Connected to MySQL database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return this.stmt;
    }
}