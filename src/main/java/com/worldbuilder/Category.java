package com.worldbuilder;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Category {
    // variables
    protected String name;
    protected SecureRandom random = new SecureRandom();
    protected int catID = random.nextInt(); // this is a random number; each category has its own individual id in the object
    protected ArrayList<Element> savedElements = new ArrayList<Element>(); // this is where actual text gets saved into
    // variables end

    // methods
    public int getCatID() {
        return catID;
    }

    public ArrayList<Element> getSavedElements() {
        return savedElements;
    }

    public void addElement(Element toAdd) {
        savedElements.add(toAdd);
    }
    // methods end

    // constructor
    Category(String name) {
        this.name = name;
    }

    Category() {}
    // constructor end
}
