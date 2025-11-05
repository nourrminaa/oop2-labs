package com.nourmina.oop2labs.exercises.lab_exercises.Exercise18;

import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import java.sql.Statement;

public class GetGuiStudent {
    public FlowPane getGUIStudent(){
        DBConnectMySQL db = new DBConnectMySQL();
        Statement stmt = db.getStatement();

        Label l1 = new Label("ID");
        Label l2 = new Label("First Name");
        Label l3 = new Label("Last Name");
        Label l4 = new Label("Address");

        TextField f1 = new TextField();
        TextField f2 = new TextField();
        TextField f3 = new TextField();
        TextField f4 = new TextField();

        FlowPane f1p = new FlowPane();
        f1p.getChildren().addAll(l1, f1);
        FlowPane f2p = new FlowPane();
        f2p.getChildren().addAll(l2, f2);
        FlowPane f3p = new FlowPane();
        f3p.getChildren().addAll(l3, f3);
        FlowPane f4p = new FlowPane();
        f4p.getChildren().addAll(l4, f4);

        Button b1 = new Button("Save");
        b1.setOnAction(new SaveStudentButtonHandler(f2, f3, f4, stmt));
        Button b2 = new Button("Clear");
        b2.setOnAction(new ClearStudentButtonHandler(f1, f2, f3, f4));

        FlowPane buttonPane = new FlowPane();
        buttonPane.getChildren().addAll(b1, b2);

        FlowPane fp = new FlowPane(Orientation.VERTICAL);
        fp.getChildren().addAll(f1p, f2p, f3p, f4p, buttonPane);
        return fp;
    }
}
