package gui;

import gui.util.Alerta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewControler {
	
	@FXML
	public Button botaoAlerta;
	
	@FXML
	public void onActionButton() {
		Alerta.alerta("Um problema aconteceu","Cuidado","ERROR 565", AlertType.WARNING );
	}
	
}
