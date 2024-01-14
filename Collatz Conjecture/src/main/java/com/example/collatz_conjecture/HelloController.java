package com.example.collatz_conjecture;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextArea inputText;
    @FXML
    private Button enterButton;
    @FXML
    private LineChart chart;


    @FXML
    public void enterButtonPressed(ActionEvent actionEvent) {
        XYChart.Series series = new XYChart.Series();
        int number = Integer.parseInt(inputText.getText());
        series.getData().add(new XYChart.Data("0", number));
        int counter = 0;

        while (number != 1){
            counter += 1;
            if ((number% 2) == 1){
                number = number * 3 + 1;
                series.getData().add(new XYChart.Data(String.valueOf(counter), number));
            } else {
                number = number / 2;
                series.getData().add(new XYChart.Data(String.valueOf(counter), number));
            }
        }

        chart.getData().add(series);
    }


}