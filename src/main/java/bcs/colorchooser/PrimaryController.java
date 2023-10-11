package bcs.colorchooser;

import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PrimaryController {

    @FXML
    private Slider redSlider;
    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;
    @FXML
    private TextField redTF;
    @FXML
    private TextField greenTF;
    @FXML
    private TextField blueTF;
    @FXML
    private TextField alphaTF;
    @FXML
    private Rectangle colorRectangle;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 1.0;
    
    public void initialize(){
        redTF.textProperty().bind(
        redSlider.valueProperty().asString("%.0f"));
        greenTF.textProperty().bind(
        greenSlider.valueProperty().asString("%.0f"));
        blueTF.textProperty().bind(
        blueSlider.valueProperty().asString("%.0f"));
        alphaTF.textProperty().bind(
        alphaSlider.valueProperty().asString("%.2f"));
        
        redSlider.valueProperty().addListener(
        new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue){
                red = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
        });
        greenSlider.valueProperty().addListener(
        new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue){
                green = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
        });
        blueSlider.valueProperty().addListener(
        new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue){
                blue = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
        });
        alphaSlider.valueProperty().addListener(
        new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                    Number oldValue, Number newValue){
                alpha = newValue.intValue();
                colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
        });
    }

}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/