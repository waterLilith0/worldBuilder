package com.worldbuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Saving {
    // variables
    private final Path mainPath = Paths.get(System.getProperty("user.dir") + System.getProperty("line.separator") + "worldBuilder"); // makes a new path in the working dir
    private Universe newUniverse;
    // variables end

    // methods
    Saving() {}

    Saving(Universe newUniverse) {
        this.newUniverse = newUniverse;
    }

    void initialize() {
        try {
            Files.createDirectory(mainPath);
            Files.createDirectory(Paths.get(mainPath.toUri() + ""));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    void serialize(Universe input) {
        try {
            FileOutputStream outFile = new FileOutputStream(mainPath.toUri() + System.getProperty("path.separator") + input.getName());
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

    /*Object deserialize() {
        try {
            FileInputStream inFile = new FileInputStream();
        } catch() {

        }
        return new Element("test");
    }*/
    // methods end
}
