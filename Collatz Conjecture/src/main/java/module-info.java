module com.example.collatz_conjecture {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.collatz_conjecture to javafx.fxml;
    exports com.example.collatz_conjecture;
}