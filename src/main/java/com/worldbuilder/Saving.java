package com.worldbuilder;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saving {
    // variables
    private Path mainPath =
            Paths.get(System.getProperty("user.home") + File.separator + "Documents" + File.separator + "worldBuilder"); // makes a new path in the working dir
    private Universe newUniverse;
    // variables end

    // methods
    /**
     * creates the necessary folders on the system in the main path
     */
    void initialize() {
        try {
            Files.createDirectory(mainPath);
        } catch(FileAlreadyExistsException io) {
            System.out.println("Main folder structure already exists at " + mainPath);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    /**
     * @param input the Universe to be saved into a file, including all its associated Objects
     */
    void save(Universe input) {
        try {
            FileOutputStream outFile = new FileOutputStream(mainPath + File.separator + input.getName());
            ObjectOutputStream outStream = new ObjectOutputStream(outFile);
            outStream.writeObject(input);
            outStream.close();
            outFile.close();
        } catch(FileNotFoundException f) {
            System.out.println(f);
        } catch(IOException g) {
            System.out.println(g);
        }
    }

    /**
     * @param chosenFile the file to be opened
     * @return reads the Universe that was previously saved in the file to be read
     */
    Object open(File chosenFile) {
        try {
            FileInputStream inFile = new FileInputStream(chosenFile);
            ObjectInputStream inStream = new ObjectInputStream(inFile);
            inFile.close();
            inStream.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException f) {
            throw new RuntimeException(f);
        }
        return new Universe(chosenFile.getName());
    }

    public Path getMainPath() {
        return mainPath;
    }

    public void setMainPath(Path mainPath) {
        this.mainPath = mainPath;
    }

    // methods end
}
