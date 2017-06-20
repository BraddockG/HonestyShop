package honesty.controllers;

import honesty.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class AccommodationsController extends ControlledView {

    @FXML
    void barnClicked(MouseEvent event) {
    	System.out.println("Barn Clicked");
    	this.getControllerParent().setScreen(Main.checkoutScreenID);
    }
    
    @FXML
    void staffSettingsClicked(ActionEvent event) {
    	System.out.println("Staff Settings Clicked");
    	this.getControllerParent().setScreen(Main.adminScreenID);
    }
}