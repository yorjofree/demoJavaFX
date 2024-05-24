package com.freiorio.demo;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle(50, 50, Color.GREEN);

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), rectangle);
        translateTransition.setByX(100);

        translateTransition.play();

        StackPane root = new StackPane(rectangle);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Animation Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}