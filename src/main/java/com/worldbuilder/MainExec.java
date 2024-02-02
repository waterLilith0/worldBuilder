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
        FileOperation newFiles = new FileOperation();   // test
        // end variables

        System.out.println(newFiles.mainDir);   // shows main directory

        if (Files.exists(newFiles.getSaveFolder())) {    // does save folder exist? if no -> create
            System.out.println("exists");
        } else {
            newFiles.initialize();
        }

        Universe newUniverse = new Universe();
        Category cat1 = new Category("animals");
        Category cat2 = new Category("plants");
        World wrld1 = new World("alta");
        Element testEl = new Element();
        Element testEl2 = new Element();
        testEl.setText("This is some text in this file");

        newUniverse.addSaved(cat1);
        newUniverse.addSaved(cat2);
        newUniverse.addSaved(wrld1);
        cat1.addElement(testEl);
        cat1.addElement(testEl2);

        newFiles.edit(testEl.getText().getBytes());
        System.out.println(newFiles.getTempFile());



        for (int id: newUniverse.getCatID()) {
            System.out.println("ID of Category: " + id);
        }
        for (Element i: cat1.getSavedElements()) {
            System.out.println(i.getId());
        }

/*
        folder structure of the program:
        worldbuilder - main folder
            - java - this is where all the java classes are saved
            - resources - includes the css and fxml for the look of the program
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