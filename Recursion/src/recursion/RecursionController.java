/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.stage.Modality;

import javafx.stage.Stage;

/**
 *
 * @author Abdelkader
 */
public class RecursionController implements Initializable {
    
    @FXML
    private MenuBar mainMenu;
      
    @FXML
    public void testCount() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Count.fxml"));
        Parent count = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(count);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Testing Count");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
    
    @FXML
    public void testStringReplace() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestReplace.fxml"));
        Parent testReplace = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(testReplace);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Testing Text Replace");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
        
    @FXML
    public void testRecursionFactorial() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestFactorial.fxml"));
        Parent testRecursionFactorial = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(testRecursionFactorial);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Testing Recursion Factorial");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
  
    @FXML
    public void testTimeBaseFibonacci() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestTimeBaseFibonacci.fxml"));
        Parent test = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(test);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Test Time Fibonacci Base Recursion");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
    
    @FXML
    public void testBetterFibonacci() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestBetterFibonacci.fxml"));
        Parent test = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(test);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Test Better Time Fibonacci Recursion");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
    
    
    @FXML
    public void testTailRecursiveFibonacci() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestTailRecursiveFibonacci.fxml"));
        Parent test = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(test);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Test Test Tail Recursive Fibonacci");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
    
    @FXML
    public void testTimeBetterFibonacci() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TestTimeBetter.fxml"));
        Parent test = (Parent) fxmlLoader.load();
        
        Scene scene = new Scene(test);    
        Stage stage = new Stage();
        stage.getIcons().add(new Image("file:src/Recursion/WesternLogo.png"));
        
        stage.setScene(scene);
        stage.setTitle("Test Time Better and Tail Recursive Fibonacci");
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.show();
    }
    
    @FXML
    public void exit() {

        Stage stage = (Stage) mainMenu.getScene().getWindow();
        stage.close();
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
