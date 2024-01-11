package com.worldbuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperation {
    String mainDir = System.getProperty("user.dir");
    private Path tempFolder = Paths.get(mainDir, "tmp");

    // methods

    public void setTempFolder(Path tempFolder) {
        this.tempFolder = tempFolder;
    }
}
