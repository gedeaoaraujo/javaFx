package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable {

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

	@Override
	public void initialize(URL url, ResourceBundle bundle) {
		Constraints.setTextFieldDouble(txtFirstNumber);
		Constraints.setTextFieldDouble(txtSecondNumber);
		Constraints.setTextFieldMaxLength(txtFirstNumber, 12);
		Constraints.setTextFieldMaxLength(txtSecondNumber, 12);
	}
}
