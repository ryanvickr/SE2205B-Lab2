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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abdelkader
 */
public class TestTimeBaseFibonacciController implements Initializable {

    @FXML
    Button testBaseBtn;
    @FXML
    TextField n_text;  
    @FXML
    TextArea testBaseWindow;  
    
    @FXML
    public void testBaseBtnClicked(){
        int n = Integer.parseInt(this.n_text.getText()); 
        this.testBaseWindow.clear();
        this.testBaseWindow.appendText("TIMING BASIC RECURSIVE FIBONACCI\n\n");
        timeBasic(n);
    }
        
    public void timeBasic(int n) {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        long result;
        long startTime = System.currentTimeMillis();
        result = fibonacci.basic(n);
        long diff = System.currentTimeMillis() - startTime;
       
        this.testBaseWindow.appendText("Time to compute fibonacci(" + n + ") using basic recursion was "
                + diff + " milliseconds.\n");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
