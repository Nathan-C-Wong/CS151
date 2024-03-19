package edu.sjsu.cs.java_fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class SimpleGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 500, Color.LIGHTBLUE);

        stage.setTitle("Student GUI");

        Rectangle box1 = new Rectangle(100, 101, 100, 120);
        box1.setFill(Color.LIGHTCORAL);

        Text studentTxt = new Text("Student Info: ");

        Student stud1 = new Student("Lebron", 23);

        Text studentName = new Text("Name: " + stud1.getName());

        Text studentID = new Text("ID: " + Integer.toString(stud1.getId()));

        Image image = new Image("https://cdn.nba.com/headshots/nba/latest/1040x760/2544.png");

        studentTxt.setX(100);
        studentTxt.setY(100);

        studentName.setX(120);
        studentName.setY(130);

        studentID.setX(120);
        studentID.setY(160);

        ImageView imageView = new ImageView(image);
        imageView.setX(120);
        imageView.setY(170);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        root.getChildren().addAll(box1, studentTxt, studentName, studentID, imageView);


        stage.setScene(scene);
        stage.show();
    }
}
