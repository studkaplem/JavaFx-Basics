package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

       Button btn = new Button("submit");
       Button exit = new Button("exit");
       exit.setOnAction(e -> {
           System.out.println("u leaved the App");
           System.exit(0);
       });
       btn.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {

               System.out.println("hello");
           }
       });

       VBox root = new VBox();
       root.getChildren().addAll(btn, exit);


        TextField textField = new TextField();
        BorderPane root2 = new BorderPane();
        root2.setTop(textField);

       Scene scene = new Scene(root,250,250);
       primaryStage.setTitle("Hello World!");
       primaryStage.show();
       primaryStage.setScene(scene);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
