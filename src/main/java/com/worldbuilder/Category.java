package com.worldbuilder;

public class Category {
    protected String name;
    protected int catID; // this is a random number; each category has it's own individual id in the object

    Category(int catID, String name) {
        this.catID = catID;
        this.name = name;
    }

    Category() {}
}
