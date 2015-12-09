package application.view;

import application.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//binding

public class Controller {
	@FXML
	private Button button;
	@FXML
	private TextField textField;
	@FXML
	private TextArea textArea;
	@FXML
	private Label nameLabel;
	Student student = new Student();

	public void changeName() {
		String oldValue = student.getName();
		nameLabel.textProperty().bind(student.nameProperty());
		student.setName(textField.getText());
		textArea.setText(oldValue + " Changed to " + nameLabel.getText());

	}

}
