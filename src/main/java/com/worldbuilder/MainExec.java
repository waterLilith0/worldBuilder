package com.worldbuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExec extends Application {
    @Override
    public void start(Stage stage) throws Exception {
/* Scene for UI
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("debugging.fxml"));
        Scene scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();
*/

        // variable declaration
        // end variables

        FileOperation test = new FileOperation();
        System.out.println(test.mainDir);   // shows main directory
        for (String i: test.showSavedFiles()) { // prints every saved file as a string
            if (i.endsWith(".sav")) {
                System.out.println(i);
            }
        }
        if (Files.exists(test.getSaveFolder())) {
            System.out.println("exists");
        } else {
            test.createSaveFolder();
        }
/*
        folder structure of the program:
        worldbuilder - main folder
            - java - this is where all the java classes are saved
            - resources - includes the css and fxml for the look of the program
            - tmp - gets created during startup, this is where the program reads from when saving, gets deleted after
            - sav - this is where the program should save the data permanently
*/
    }

/* only important for console version!!!
        // console version variables
        Scanner input = new Scanner(System.in);
        boolean run = true;
        // end console variables

        // console version logic
        while (run) {
            System.out.println("Welcome to worldBuilder! Please choose what you want to do: \n" +
                    "View saved projects: 1 \n Edit project: 2 \n Delete project: 3 \n Exit: 0 \n then press enter");
            int mainMenue = 5;
            try {
                mainMenue = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please only enter a number!");
            }
            switch (mainMenue) {
                case 1:
                    // view();
                    break;
                case 2:
                    // TODO edit(projectName);
                    break;
                case 3:
                    // TODO delete(projectName);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a number between 0 and 3 and then enter: ");
                    break;
            }
        }
        // end of console only version
*/
    public static void main(String[] args) {
        launch();
    }
}