package com.worldbuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOperation {

    // variables
    String chosenDir, chosenFile;   // user selection
    String mainDir = System.getProperty("user.dir");    // the main folder for the program
    Path pMainDir = Paths.get(mainDir); // main folder as a Path
    private Path saveFolder = Paths.get(mainDir, "sav");    // this is where files are permanently saved into
    // variables end

    // methods
    public Path getSaveFolder() {
        return saveFolder;
    }

    public ArrayList<String> showSavedFiles() {   // adds all files and folders in main directory to temp as string if they exist
        ArrayList<String> temp = new ArrayList<String>();
        try {
            DirectoryStream<Path> files = Files.newDirectoryStream(saveFolder);
            for (Path found: files) {
                temp.add(found.toString());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return temp;
    }

    public void createSaveFolder() throws IOException { // creates the save folder
        try {
            Files.createDirectory(saveFolder);
        } catch (IOException e) {
            System.out.println("Error at file creation");
        }
    }

    public void save() {    // save the temp file into a permanent save file

    }

    public File edit() throws IOException {
        File tempDir = null;
        try {
            tempDir = Files.createTempDirectory("tmp").toFile();
        } catch (IOException e) {
            System.out.println("Error creating temp folder");
        }
        tempDir.deleteOnExit();
        return tempDir;
    }

    public void delete() {  // delete a file

    }
    // methods end

    // constructor
    // constructor end
}
