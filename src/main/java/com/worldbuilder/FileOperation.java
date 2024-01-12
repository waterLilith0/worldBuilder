package com.worldbuilder;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileOperation {
    // variables
    String chosenDir, chosenFile;   // user selection
    String mainDir = System.getProperty("user.dir");
    Path pMainDir = Paths.get(mainDir);
    private Path tempFolder = Paths.get(mainDir, "tmp");    // temporary folder that gets saved into save folder once finished with editing
    private Path saveFolder = Paths.get(mainDir, "sav");    // this is where files are permanently saved into
    // variables end

    // methods
    public Path getTempFolder() {
        return tempFolder;
    }

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

    public void createSaveFolder() throws IOException {
        try {
            Files.createDirectory(saveFolder);
        } catch (IOException e) {
            System.out.println("Error at file creation");
        }
    }
    public void edit() {

    }

    public void save() {

    }

    public void delete() {

    }
    // methods end

    // constructor
    // constructor end
}
