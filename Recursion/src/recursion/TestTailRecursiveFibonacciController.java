/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Abdelkader
 */
public class TestTailRecursiveFibonacciController implements Initializable {

    @FXML
    Button testBtn;
    @FXML
    TextArea testWindow;

    @FXML
    public void testBtnClicked() {
        this.testWindow.clear();
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        long result;
        this.testWindow.appendText("TESTING TAIL RECURSIVE FIBONACCI\n\n");

        this.testWindow.appendText("Confirm we get a result for a negative value\n");
        result = fibonacci.tailRecursive(-5);
        this.testWindow.appendText("    Passed - got result\n");

        this.testWindow.appendText("Testing fibonacci(0)\n");
        result = fibonacci.tailRecursive(0);
        if (result == 0) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 0\n");
        }

        this.testWindow.appendText("Testing fibonacci(1)\n");
        result = fibonacci.tailRecursive(1);
        if (result == 1) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 1\n");
        }

        this.testWindow.appendText("Testing fibonacci(3)\n");
        result = fibonacci.tailRecursive(3);
        if (result == 2) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 2\n");
        }

        this.testWindow.appendText("Testing fibonacci(9)\n");
        result = fibonacci.tailRecursive(9);
        if (result == 34) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 34\n");
        }

        this.testWindow.appendText("Testing fibonacci(10)\n");
        result = fibonacci.tailRecursive(10);
        if (result == 55) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 55\n");
        }

        this.testWindow.appendText("Testing fibonacci(48)\n");
        result = fibonacci.tailRecursive(48);
        if (result == 4807526976l) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 4807526976\n");
        }

        this.testWindow.appendText("Testing fibonacci(49)\n");
        result = fibonacci.tailRecursive(49);
        if (result == 7778742049l) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 7778742049\n");
        }

        this.testWindow.appendText("Testing fibonacci(50)\n");
        result = fibonacci.tailRecursive(50);
        if (result == 4807526976l + 7778742049l) {
            this.testWindow.appendText("     Passed\n");
        } else {
            this.testWindow.appendText("**** Fails " + result + " is not the expected result of 12586269025\n");
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
