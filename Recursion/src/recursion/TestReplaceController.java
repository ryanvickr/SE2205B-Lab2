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
public class TestReplaceController implements Initializable {

    @FXML
    Button testReplaceBtn;
    @FXML
    TextArea testReplaceWindow;

    @FXML
    public void testReplaceBtnClicked() {
        this.testReplaceWindow.clear();
        testReplace();
    }

    public void testReplace() {
        RecursiveStringReplace rs = new RecursiveStringReplace();
        String result;

        this.testReplaceWindow.appendText("TESTING RECURSIVE STRING REPLACE\n");

        this.testReplaceWindow.appendText("Testing with an empty string\n");
        result = rs.replace("", 'a', 'b');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not the empty string\n");
            }
        }
        this.testReplaceWindow.appendText("Testing a string of size one - no replacement\n");
        result = rs.replace("c", 'a', 'b');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("c")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not c\n");
            }
        }

        this.testReplaceWindow.appendText("Testing a string of size one -  replacement\n");
        result = rs.replace("a", 'a', 'b');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("b")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not b\n");
            }
        }

        this.testReplaceWindow.appendText("Testing a string with no replacement\n");
        result = rs.replace("ABC cdefgh", 'a', 'b');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("ABC cdefgh")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not the string ABC cdefgh\n");
            }
        }
        this.testReplaceWindow.appendText("Testing a string with replacement\n");
        result = rs.replace("ABC bcadefgah", 'a', 'b');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("ABC bcbdefgbh")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not the string ABC bcbdefgbh\n");
            }

        }
        this.testReplaceWindow.appendText("Testing a string with replacement\n");
        result = rs.replace("dddddddddd", 'd', 'a');
        if (result == null) {
            this.testReplaceWindow.appendText(" >>>   Please implment this feature   <<<\n");
        } else {
            if (result.equals("aaaaaaaaaa")) {
                this.testReplaceWindow.appendText("     Passed\n");
            } else {
                this.testReplaceWindow.appendText("**** Fails " + result + " is not the string aaaaaaaaaa\n");
            }
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
