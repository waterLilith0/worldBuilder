package com.worldbuilder;

import java.security.SecureRandom;

public class Category {
    protected String name;
    protected SecureRandom random = new SecureRandom();
    protected int catID = random.nextInt(); // this is a random number; each category has it's own individual id in the object

    Category(String name) {
        this.name = name;
    }

    Category() {}

    public int getCatID() {
        return catID;
    }
}
