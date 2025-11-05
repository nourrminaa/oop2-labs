package com.nourmina.oop2labs.exercises.lab_exercises.Exercise19;

import javafx.beans.property.*;

public class Veg {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final IntegerProperty age;
    private final BooleanProperty isVeg;

    public Veg(String fn, String ln, int age, boolean isV) {
        this.firstName = new SimpleStringProperty(fn);
        this.lastName = new SimpleStringProperty(ln);
        this.age = new SimpleIntegerProperty(age);
        this.isVeg = new SimpleBooleanProperty(isV);
    }

    public StringProperty firstNameProperty() { return firstName; }
    public StringProperty lastNameProperty() { return lastName; }
    public IntegerProperty ageProperty() { return age; }
    public BooleanProperty isVegProperty() { return isVeg; }

    public String getFirstName() { return firstName.get(); }
    public String getLastName() { return lastName.get(); }
    public int getAge() { return age.get(); }
    public boolean isVeg() { return isVeg.get(); }
}