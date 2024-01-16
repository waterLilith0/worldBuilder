package com.worldbuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOperation {

    /*
    TODO call to initialize to actually create the files;
        edit: check whether file already exists and try to open save file into temp, else make a new temp file
        save: save the current setup from temp file into sav file in the format of
            name universe
            <categoryid>
                <elementid>
                    -text-
                <elementid>
                    -text-
            <categoryid>
                <elementid>
                    -text-
            <categoryid>
                <categoryid>
                    <elementid>
                        -text-
                    <elementid>
                        -text-
     */

    // variables
    File chosenDir, chosenFile;   // user selection
    String mainDir = System.getProperty("user.dir");    // the main folder for the program
    Path pMainDir = Paths.get(mainDir); // main folder as a Path
    File tempDir = null;
    File tempFile = null;
    private Path saveFolder = Paths.get(mainDir, "sav");    // this is where files are permanently saved into
    private Path saveFile = saveFolder.getFileName().resolve(saveFolder );
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
            System.out.println("No files in folder");
        }
        return temp;
    }

    public void initialize() throws IOException { // creates the save folder
        try {
            Files.createDirectory(saveFolder);
        } catch (IOException e) {
            System.out.println("Error at save folder creation");
        }
        try {
            Files.createFile(saveFolder);
        } catch (IOException e) {
            System.out.println("Error at save file creation");
        }
    }

    public void save() {    // save the temp file into a permanent save file

    }

    public File edit() throws IOException { // gets called when user accesses

        try {
            tempDir = Files.createTempDirectory("tmp").toFile();
        } catch (IOException e) {
            System.out.println("Error creating temp folder");
        }
        try {
            tempFile = Files.createTempFile("edit", ".tmp").toFile();
        } catch (IOException e) {
            System.out.println("Error creating temp file");
        }
        tempDir.deleteOnExit();
        tempFile.deleteOnExit();
        return tempFile;
    }

    public void delete(File toDelete) {  // delete a file
        if (toDelete.exists() && toDelete.canWrite()) {
            toDelete.delete();
        } else {
            System.out.println("Error deleting files! Do you have the right permissions and does the file exist?");
        }
    }
    // methods end

    // constructor
    // constructor end
}
