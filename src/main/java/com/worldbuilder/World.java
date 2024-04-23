package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;

public class World extends Category implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private SecureRandom id = new SecureRandom();
    private HashMap<Integer, Category> saved = new HashMap<Integer, Category>();
    // variables end

    // methods
    public void addSaved(Category newCategory) {
        saved.put(id.nextInt(), newCategory);
    }

    
    // methods end

    // constructors
    World(String name) {
        super(name);
    }
    // constructors end
}
