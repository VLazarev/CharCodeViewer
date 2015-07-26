/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcodeviewerfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Витя
 */
public class CharCodeViewerFXController implements Initializable {
    
   
//-----------------------------------------------------------
    @FXML
    private TextField charCodeForSymbol;
    
    @FXML
    private TextField resultSymbol;
    
    @FXML
    private TextField charSymbolForCode;
    
    @FXML
    private TextField resultCode;
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        //if(charCodeForSymbol.getText()!= null) {
            String s1 = charCodeForSymbol.getText();
            int codeChar1 = new Integer(s1);
            s1 = "" + (char)codeChar1;
            resultSymbol.setText(s1);
        //}
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        //if(charSymbolForCode.getText()!= null) {
            String s = charSymbolForCode.getText();
            char c = s.charAt(0);
            Integer codeChar = (int)s.charAt(0);
            resultCode.setText(codeChar.toString());
        //}
      
    }
    
    /*
    @FXML
    private Label lab1;
    
     @FXML
    private void handleButtonAction1(ActionEvent event) {
        lab1.setText("Vasya");
    }    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    */
    
//------------------------------------------------------------
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
