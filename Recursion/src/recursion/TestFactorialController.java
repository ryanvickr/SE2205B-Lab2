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
public class TestFactorialController implements Initializable {

    @FXML
    Button testBasicBtn;
    @FXML
    Button testTrailBtn;
    @FXML
    TextArea testBasicWindow;
    @FXML
    TextArea testTrialWindow;
    @FXML
    public void testBasicBtnClicked() {
        this.testBasicWindow.clear();
        testBasic();
    }

    @FXML
    public void testTrailBtnClicked() {
        this.testTrialWindow.clear();
        testTailRecursive();
    }

    public void testBasic() {
        RecursiveFactorial factorial = new RecursiveFactorial();
        long result;
        this.testBasicWindow.appendText("TESTING BASIC RECURSIVE FACTORIAL\n");

        this.testBasicWindow.appendText("Confirm we get a result for a negative value\n");
        result = factorial.basic(-5);
        this.testBasicWindow.appendText("    Passed - got result\n");

        this.testBasicWindow.appendText("Testing factorial(0)\n");
        result = factorial.basic(0);

        if (result == 1) {
            this.testBasicWindow.appendText("     Passed\n");
        } else {
            this.testBasicWindow.appendText("**** Fails " + result + " is not the expected result of 1\n");
        }

        this.testBasicWindow.appendText("Testing factorial(1)\n");
        result = factorial.basic(1);
        if (result == 1) {
            this.testBasicWindow.appendText("     Passed\n");
        } else {
            this.testBasicWindow.appendText("**** Fails " + result + " is not the expected result of 1\n");
        }

        this.testBasicWindow.appendText("Testing factorial(3)\n");
        result = factorial.basic(3);
        if (result == 6) {
            this.testBasicWindow.appendText("     Passed\n");
        } else {
            this.testBasicWindow.appendText("**** Fails " + result + " is not the expected result of 6\n");
        }

        this.testBasicWindow.appendText("Testing factorial(10)\n");
        result = factorial.basic(10);
        if (result == 3628800) {
            this.testBasicWindow.appendText("     Passed\n");
        } else {
            this.testBasicWindow.appendText("**** Fails " + result + " is not the expected result of 3628800\n");
        }

    }

    public void testTailRecursive() {
        RecursiveFactorial factorial = new RecursiveFactorial();
        long result;
        this.testTrialWindow.appendText("TESTING TAIL RECURSIVE FACTORIAL\n");

        this.testTrialWindow.appendText("Confirm we get a result for a negative value\n");
        result = factorial.tailRecursive(-5);
        this.testTrialWindow.appendText("    Passed - got result\n");

        this.testTrialWindow.appendText("Testing factorial(0)\n");
        result = factorial.tailRecursive(0);
        if (result == 1) {
            this.testTrialWindow.appendText("     Passed\n");
        } else {
            this.testTrialWindow.appendText("**** Fails " + result + " is not the expected result of 1\n");
        }

        this.testTrialWindow.appendText("Testing factorial(1)\n");
        result = factorial.tailRecursive(1);
        if (result == 1) {
            this.testTrialWindow.appendText("     Passed\n");
        } else {
            this.testTrialWindow.appendText("**** Fails " + result + " is not the expected result of 1\n");
        }

        this.testTrialWindow.appendText("Testing factorial(3)\n");
        result = factorial.tailRecursive(3);
        if (result == 6) {
            this.testTrialWindow.appendText("     Passed\n");
        } else {
            this.testTrialWindow.appendText("**** Fails " + result + " is not the expected result of 6\n");
        }

        this.testTrialWindow.appendText("Testing factorial(10)\n");
        result = factorial.tailRecursive(10);
        if (result == 3628800) {
            this.testTrialWindow.appendText("     Passed\n");
        } else {
            this.testTrialWindow.appendText("**** Fails " + result + " is not the expected result of 3628800\n");
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
