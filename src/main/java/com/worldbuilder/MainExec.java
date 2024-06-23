package com.worldbuilder;

import com.worldbuilder.Controller.CreateController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;

public class MainExec extends Application {
    Stage c_stage = new Stage();
    @Override
    public void start(Stage stage) throws Exception {
        Parent loader = FXMLLoader.load(getClass().getResource("menue.fxml"));
        Scene scene = new Scene(loader);
        stage.setScene(scene);
        stage.show();

        // variable declaration
        Saving running = new Saving();
        Universe testUniverse = new Universe("test");
        Universe mt = new Universe();
        Category testCat = new Category("tester");
        Element testEL1 = new Element("testl1");
        Element testEL2 = new Element("testl2");
        World testW = new World("Luma");
        // end variables

        // initial processes needed (file creation etc.)
        running.initialize();   // creates the main folder structure
        running.save(testUniverse);
        System.out.println(running.getUniverses());
        mt = (Universe) running.open(running.getUniverses().get(0));
        // done with initial processes

        // use methods
        //testCat.addElement(testEL1);
        //testCat.addElement(testEL2);
        //testEL2.setText("this \n is \n a \n test to see whether it works!");

        // end use of methods



/*
        folder structure of the program:
        worldbuilder - main folder
            - java - this is where all the java classes are saved
            - resources - includes the css and fxml for the look of the program
            - sav - this is where the program should save the data permanently
            - Controller - Fxml controller for views
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

    public void showCreate()throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Create.fxml"));

        Parent root = loader.load();
        CreateController controller = loader.getController();

        controller.setMainExec(this);
        controller.inGroup();

        c_stage = new Stage();
        Scene scene = new Scene(root);
        c_stage.setScene(scene);
        c_stage.show();
    }

    public void closeCreate(){
        c_stage.close();
    }
}

