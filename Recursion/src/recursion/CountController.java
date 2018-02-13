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
public class CountController implements Initializable {
    @FXML
    Button countDownBtn;
    @FXML
    Button countUpBtn;
    @FXML
    TextField n_text;  
    @FXML
    TextArea countDownWindow;  
    @FXML
    TextArea countUpWindow;  
        
    public void countUpBtnClicked(){
        int n = Integer.parseInt(this.n_text.getText()); 
        this.countUpWindow.clear();
        countUp(n);
    }
        
    public void countDownBtnClicked(){
        int n = Integer.parseInt(this.n_text.getText()); 
        this.countDownWindow.clear();
        countDown(n);
    }

       /**
     * countUp - A recursive function that counts up from 1 to n.
     *
     * @param n    The integer value to count up to,
     */
    private void countUp(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
        //this.countUpWindow.appendText("Please implement this method " + "\n");
        if (n == 1){
            this.countUpWindow.appendText("1\n");
            return;
        } else {
            countUp(n - 1);
            this.countUpWindow.appendText(Integer.toString(n) + "\n");
        }
    }
    
     /**
     * countDown - A recursive function that counts down from n to 1.
     *
     * @param n    The integer value to count down from.
     */
    private void countDown(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
        //this.countDownWindow.appendText("Please implement this method " + "\n");
        if (n == 1){
            this.countDownWindow.appendText("1\n");
            return;
        } else {
            this.countDownWindow.appendText(Integer.toString(n) + "\n");
            countDown(n - 1);
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
