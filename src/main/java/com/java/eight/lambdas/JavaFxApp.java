package com.java.eight.lambdas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxApp extends Application {

	@SuppressWarnings("restriction")
	@Override
	public void start(Stage stage) {
		Button b = new Button();
		b.setText("Press Button");
		b.setOnAction((ActionEvent event) -> {
			stage.setTitle("λEs rock!");
		});
		StackPane root = new StackPane();
		root.getChildren().add(b);
		Scene scene = new Scene(root, 200, 50);
		stage.setScene(scene);
	}

	@SuppressWarnings("restriction")
	public void launchApplication() {
		launch();
	}

	@SuppressWarnings("restriction")
	public static void main(String[] args) {
		launch();
	}

}
