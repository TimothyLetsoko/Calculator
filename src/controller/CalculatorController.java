package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnSubtract;

    @FXML
    private TextField tfDisplay;
    private int storedValue = 0;
    private char mathOperation;
    public void processButtons(int button){
        if(tfDisplay.getText().isEmpty()){
            tfDisplay.setText(String.valueOf(button));
        }else{
            int enteredNumbers = Integer.parseInt(tfDisplay.getText());
            tfDisplay.setText(String.valueOf(enteredNumbers)+button);
        }
    }

    @FXML
    void add() {
        mathOperation = '+';
        storedValue = Integer.parseInt(tfDisplay.getText());
        tfDisplay.clear();
    }

    @FXML
    void btn0() {
        processButtons(0);
    }

    @FXML
    void btn1() {
        processButtons(1);
    }

    @FXML
    void btn2() {
        processButtons(2);
    }

    @FXML
    void btn3() {
        processButtons(3);
    }

    @FXML
    void btn4() {
        processButtons(4);
    }

    @FXML
    void btn5() {
        processButtons(5);
    }

    @FXML
    void btn6() {
        processButtons(6);
    }

    @FXML
    void btn7() {
        processButtons(7);
    }

    @FXML
    void btn8() {
        processButtons(8);
    }

    @FXML
    void btn9() {
        processButtons(9);
    }

    @FXML
    void clear() {
        tfDisplay.clear();
    }

    @FXML
    void decimal() {
        //processButtons();
    }

    @FXML
    void divide() {

    }

    @FXML
    void equals() {
        if(tfDisplay.getText().isEmpty()){
            tfDisplay.setText(String.valueOf(storedValue));
        }else{
            int sum = 0;
            switch(mathOperation){
                case '+':
                    sum = storedValue + Integer.parseInt(tfDisplay.getText());
                    tfDisplay.setText(String.valueOf(sum));
                    break;
                case '-':
                    sum = storedValue - Integer.parseInt(tfDisplay.getText());
                    tfDisplay.setText(String.valueOf(sum));
                    break;
                case '*':
                    sum = storedValue * Integer.parseInt(tfDisplay.getText());
                    tfDisplay.setText(String.valueOf(sum));
                    break;
                case '/':
                    sum = storedValue / Integer.parseInt(tfDisplay.getText());
                    tfDisplay.setText(String.valueOf(sum));
                    break;
            }
        }
    }

    @FXML
    void multiply(ActionEvent event) {

    }

    @FXML
    void subtract(ActionEvent event) {

    }
}
