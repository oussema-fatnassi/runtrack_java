package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane root = new FlowPane();

        root.setVgap(8);
        root.setHgap(4);
        root.setPrefWrapLength(300);

        Label label = new Label("NAME:");
        TextField textField = new TextField();
        Button button = new Button("SEND");

        root.getChildren().addAll(label, textField, button);
        button.setOnAction(e -> {
            System.out.println("Hello, " + textField.getText());
            textField.clear();
        });
        
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Hello!");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
