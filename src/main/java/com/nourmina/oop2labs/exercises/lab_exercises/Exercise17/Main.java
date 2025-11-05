package com.nourmina.oop2labs.exercises.lab_exercises.Exercise17;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Flow;

public class Main extends Application {
    DBConnectMySQL db = new DBConnectMySQL();
    Statement st = db.getStatement();

    public void start(Stage primaryStage) {
        Text t = new Text("Select an id:");
        ComboBox c = new ComboBox();
        String sql = "SELECT id FROM Student;";
        try{
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                c.getItems().add(rs.getInt("id"));
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }

        Button deleteBtn = new Button("delete std");
        deleteBtn.setOnAction(new DeleteButtonHandler(c,st));

        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.setPadding(new Insets(30));
        pane.getChildren().addAll(t, c, deleteBtn);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise 17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
