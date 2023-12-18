package org.production.opencvwithfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.opencv.core.Core;
import org.opencv.videoio.VideoCapture;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            BorderPane rootElement = (BorderPane) loader.load();
            Scene scene = new Scene(rootElement, 800, 600);
            primaryStage.setTitle("OpenCV");
            primaryStage.setScene(scene);
            primaryStage.show();

            HelloController controller = loader.getController();
            primaryStage.setOnCloseRequest((new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent windowEvent) {
                    controller.setClosed();
                }
            }));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        launch(args);
    }
}