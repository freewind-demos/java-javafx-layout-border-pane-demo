package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        BorderPane root = new BorderPane() {{
            setTop(new Button("Top") {{
                setPrefHeight(100);
                setPrefWidth(Double.MAX_VALUE);
            }});
            setBottom(new Button("Bottom") {{
                setPrefHeight(100);
                setPrefWidth(Double.MAX_VALUE);
            }});
            setLeft(new Button("Left") {{
                setPrefWidth(100);
                setPrefHeight(Double.MAX_VALUE);
            }});
            setRight(new Button("Right") {{
                setPrefWidth(100);
                setPrefHeight(Double.MAX_VALUE);
            }});
            setCenter(new Button("Center") {{
                setPrefWidth(Double.MAX_VALUE);
                setPrefHeight(Double.MAX_VALUE);
            }});
        }};
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}