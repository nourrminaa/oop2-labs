package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import com.nourmina.oop2labs.exercises.lab_exercises.Exercise19.ClearStudentButtonHandler;
import com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig.DBConnectMySQL;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import java.sql.Statement;

public class GetGuiStudent {
    public FlowPane getGUIStudent(){
        DBConnectMySQL db = new DBConnectMySQL();
        Statement st = db.getStatement();

        Label l1 = new Label("First Name");
        TextField t1 = new TextField();
        Label l2 = new Label("Last Name");
        TextField t2 = new TextField();
        Label age = new Label("Age");
        TextField t3 = new TextField();
        CheckBox isV = new CheckBox("isVegetarian?");
        Button b = new Button("add");
        b.setOnAction(new SaveStudentButtonHandler(t1,t2,t3,isV,st));
        Button c = new Button("clear");
        c.setOnAction(new ClearStudentButtonHandler(t1,t2,t3,isV));

        FlowPane fp = new FlowPane(Orientation.VERTICAL);
        fp.getChildren().addAll(new FlowPane(l1,t1), new FlowPane(l2,t2), new FlowPane(age,t3),isV,new FlowPane(b,c));
        return fp;
    }
}
