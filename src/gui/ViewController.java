package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button button;
	
	@FXML
	public void onButtonAction() {
		System.out.println("Button clicked");
	}
}
