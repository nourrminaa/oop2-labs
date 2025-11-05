package com.nourmina.oop2labs.exercises.lab_exercises.Exercise18;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty address;

    public Student(String firstName, String lastName, String address){
        this.firstName= new SimpleStringProperty(firstName);
        this.lastName= new SimpleStringProperty(lastName);
        this.address= new SimpleStringProperty(address);
    }

    public StringProperty firstNameProperty(){
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public StringProperty addressProperty() {
        return address;
    }
}
