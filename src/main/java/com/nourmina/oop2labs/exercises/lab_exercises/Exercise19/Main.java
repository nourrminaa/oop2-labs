package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import com.nourmina.oop2labs.exercises.lab_exercises.Exercise19.GetGuiStudent;
import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {
    public void start(Stage primaryStage){
        DBConnectMySQL db = new DBConnectMySQL();
        Statement st = db.getStatement();

        TabPane tPane = new TabPane();
        Tab addPersonTab = new Tab("Add Person", new GetGuiStudent().getGUIStudent());
        tPane.getTabs().add(addPersonTab);

        TableView<Veg> tableView = new TableView<>();

        TableColumn<Veg, String> col1 = new TableColumn<>("First Name");
        col1.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Veg, String> col2 = new TableColumn<>("Last Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Veg, Integer> col3 = new TableColumn<>("Age");
        col3.setCellValueFactory(new PropertyValueFactory<>("age"));

        TableColumn<Veg, Boolean> col4 = new TableColumn<>("IsVegetarian");
        col4.setCellValueFactory(new PropertyValueFactory<>("isVeg"));
        col4.setCellFactory(CheckBoxTableCell.forTableColumn(col4));

        tableView.getColumns().addAll(col1, col2, col3, col4);

        Button refresh = new Button("refresh");
        refresh.setOnAction(new RefreshButtonHandler(tableView, st));

        try{
            String sql = "SELECT * FROM Vegetarian";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                Integer age = rs.getInt("age");
                Boolean is = rs.getInt("isVegetarian") != 0;
                tableView.getItems().add(new Veg(firstName, lastName, age, is));
            }
        }
        catch (SQLException e){
            System.out.println("Error");
        }

        FlowPane pane = new FlowPane(Orientation.VERTICAL);
        pane.getChildren().addAll(refresh, tableView);

        Tab peopleTab = new Tab("View People", pane);
        tPane.getTabs().add(peopleTab);

        Scene scene = new Scene(tPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise 19");
        primaryStage.show();
    }
}