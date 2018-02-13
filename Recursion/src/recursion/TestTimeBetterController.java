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
public class TestTimeBetterController implements Initializable {
  @FXML
    Button testBtertn;
    @FXML
    TextField n_text;  
    @FXML
    TextField trials_text;  
    @FXML
    TextArea testBetterWindow;  
    @FXML
    TextArea testTailWindow;  
    
    @FXML
    public void testBetterBtnClicked(){
        int n = Integer.parseInt(this.n_text.getText()); 
        int trials = Integer.parseInt(this.trials_text.getText()); 
        this.testBetterWindow.clear();
        this.testTailWindow.clear();

        timeBetter(n, trials);        
        timeTailRecursive(n, trials);
    }
    
    public void timeBetter(int n, int trials)
    {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        
        long result;
        this.testBetterWindow.appendText("TIMING BETTER RECURSIVE FIBONACCI\n\n");
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< trials; i++)
            result = fibonacci.better(n);
        long diff = System.currentTimeMillis() - startTime;
        
        this.testBetterWindow.appendText("Total time in milliseconds was: " + diff + "\n");
        this.testBetterWindow.appendText("Time to compute a single call of fibonacci(" + n + ")\nusing better recursion was " 
            + ((double)diff)/trials + " milliseconds.\n");
    }


    public void timeTailRecursive(int n, int trials)
    {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        long result;
        this.testTailWindow.appendText("TIMING TAIL RECURSIVE FIBONACCI\n\n");
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< trials; i++)
            result = fibonacci.tailRecursive(n);
        long diff = System.currentTimeMillis() - startTime;

        this.testTailWindow.appendText("Total time in milliseconds was: " + diff +"\n");

        this.testTailWindow.appendText("Time to compute a single call of fibonacci(" + n + ")\nusing tail recursion was " 
            + ((double)diff)/trials + " milliseconds.\n");
    }


    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
