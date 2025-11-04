module com.nourmina.oop2labs {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.nourmina.oop2labs to javafx.fxml;
    exports com.nourmina.oop2labs.exercises.lab_exercises;
    exports com.nourmina.oop2labs.exercises.course_exercises;
    exports com.nourmina.oop2labs.exercises.lab_exercises.Exercise10;
    exports com.nourmina.oop2labs.exercises.lab_exercises.Exercise9;
    exports com.nourmina.oop2labs.exercises.lab_exercises.Exercise11;
    exports com.nourmina.oop2labs.exercises.lab_exercises.Exercise12;
    exports com.nourmina.oop2labs.exercises.lab_exercises.Exercise13;
//    exports com.nourmina.oop2labs.exercises.lab_exercises.MySQLConfig;

}

