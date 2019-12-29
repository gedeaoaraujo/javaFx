package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private TextField txtFirstNumber;
	
	@FXML
	private TextField txtSecondNumber;
	
	@FXML
	private Button btnCalculate;
	
	@FXML
	private Label labelResult;
	
	@FXML
	public void onButtonAction() {
		try {
			Double first = Double.parseDouble(txtFirstNumber.getText());
			Double second = Double.parseDouble(txtSecondNumber.getText());
		
			labelResult.setText(String.format("%.2f", first + second));
		}
		catch(NumberFormatException e){
			Alerts.showAlert("Number Exception", null, e.getMessage(), AlertType.WARNING);
		}
	}
}
