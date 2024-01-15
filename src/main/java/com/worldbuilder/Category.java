package com.worldbuilder;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Category {
    protected String name;
    protected SecureRandom random = new SecureRandom();
    protected int catID = random.nextInt(); // this is a random number; each category has its own individual id in the object
    protected ArrayList<Element> savedElements; // this is where actual text gets saved into
    Category(String name) {
        this.name = name;
    }

    Category() {}

    public int getCatID() {
        return catID;
    }

    public ArrayList<Element> getSavedElements() {
        return savedElements;
    }

    public void addElement(Element toAdd) {
        savedElements.add(toAdd);
    }
}
