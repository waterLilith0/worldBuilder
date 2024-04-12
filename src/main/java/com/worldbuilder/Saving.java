package com.worldbuilder;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saving {
    // variables
    private Path mainPath = Paths.get(System.getProperty("user.home") + File.separator + "Documents" + File.separator + "worldBuilder"); // makes a new path in the working dir
    private Universe newUniverse;
    // variables end

    // methods
    void initialize() {
        try {
            Files.createDirectory(mainPath);
        } catch(FileAlreadyExistsException io) {
            System.out.println("Main folder structure already exists");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    void save(Universe input) {
        try {
            FileOutputStream outFile = new FileOutputStream(mainPath.toUri() + File.separator + input.getName());
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

    /*Object open() {
        try {
            FileInputStream inFile = new FileInputStream();
        } catch() {

        }
        return new Element("test");
    }*/
    // methods end
}
