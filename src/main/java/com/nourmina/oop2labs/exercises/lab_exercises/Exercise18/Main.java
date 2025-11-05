package com.nourmina.oop2labs.exercises.lab_exercises.Exercise18;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {
    public void start(Stage primaryStage) {
        TabPane tpane = new TabPane();
        Tab studentTab = new Tab("Students", new GetGuiStudent().getGUIStudent());

        TableView<Student> tableView = new TableView<>();

        TableColumn<Student, String> col1 = new TableColumn<>("First Name");
        col1.setCellValueFactory(new PropertyValueFactory<>("firstName")); // set the values of this column depending on the values of attribute firstName in Student Class

        TableColumn<Student, String> col2 = new TableColumn<>("Last Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn<Student, String> col3 = new TableColumn<>("Address");
        col3.setCellValueFactory(new PropertyValueFactory<>("address"));

        tableView.getColumns().addAll(col1, col2, col3);

        try {
            DBConnectMySQL db = new DBConnectMySQL();
            java.sql.Statement st = db.getStatement();
            String sql = "SELECT * FROM oop2.student";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");
                tableView.getItems().add(new Student(firstName, lastName, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Tab tab1 = new Tab("tab1", tableView);

        tpane.getTabs().add(studentTab);
        tpane.getTabs().add(tab1);

        Scene scene = new Scene(tpane, 400, 400);
        primaryStage.setTitle("Students Management");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
