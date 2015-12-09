package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
	private SimpleStringProperty name = new SimpleStringProperty();

	public Student() {

	}

	public Student(String name, int age) {
		this.name.setValue(name);
	}

	public String getName() {
		return name.getValue();
	}

	public void setName(String name) {
		this.name.setValue(name);
	}

	public StringProperty nameProperty() {
		return name;
	}

}
