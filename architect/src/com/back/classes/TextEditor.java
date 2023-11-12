package com.back.classes;

import java.io.File;
import java.util.Scanner;

/*
TODO    to use for the text editor; opens a previously written file and saves it into a bufferFile. This buffer file
        can be viewed in the actual editor. Once edits have been made, the buffer file overwrites the actual file. This
        only gets applied once the user has chosen to "save" -> idea for implementation: file versioning?
*/

public class TextEditor {
    // -- variables --
    private File bufferFile = new File("");
    private Scanner input = new Scanner(System.in);

    // -- set --
    public void setInput(Scanner input) {
        this.input = input;
    }

    // -- get --

}
