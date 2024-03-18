package edu.sjsu.cs.java_fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;

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

        Student stud1 = new Student("Bob", 1776);

        Text studentName = new Text("Name: " + stud1.getName());

        Text studentID = new Text("ID: " + Integer.toString(stud1.getId()));


        studentTxt.setX(100);
        studentTxt.setY(100);

        studentName.setX(120);
        studentName.setY(130);

        studentID.setX(120);
        studentID.setY(160);

        root.getChildren().add(box1);
        root.getChildren().add(studentTxt);
        root.getChildren().add(studentName);
        root.getChildren().add(studentID);

        stage.setScene(scene);
        stage.show();
    }
}
