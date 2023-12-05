package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
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
        //code goes here
    }

    @FXML
    void equals() {
        if(tfDisplay.getText().isEmpty()){
            tfDisplay.setText(String.valueOf(storedValue));
        }else{
            int sum ;
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
    void multiply() {
        //code goes here
    }

    @FXML
    void subtract() {
        //code goes here
    }
}
