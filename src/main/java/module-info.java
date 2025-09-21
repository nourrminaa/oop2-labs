module com.nourmina.oop2labs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nourmina.oop2labs to javafx.fxml;
    exports com.nourmina.oop2labs;
}