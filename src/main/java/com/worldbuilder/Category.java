package com.worldbuilder;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class Category {
    // variables
    protected String name;
    protected SecureRandom id = new SecureRandom();
    protected int test = id.nextInt();
    protected HashMap<Integer, Element> savedElements = new HashMap<Integer, Element>(); // save elements with id
    // variables end

    // methods
    void addElement(Element aElement) {
        savedElements.put(id.nextInt(), aElement);
    }

    HashMap<Integer, Element> readAllElements() {
        return savedElements;
    }

    Set<Integer> hashes() {
        return savedElements.keySet();
    }
    // methods end

    // constructor
    Category(String name) {
        this.name = name;
    }
    // constructor end
}
