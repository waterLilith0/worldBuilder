package com.worldbuilder;

import java.security.SecureRandom;

public class Element {
    // variables
    private String name;
    private SecureRandom rand;
    private int id = rand.nextInt();
    private String text;
    // variables end

    // methods
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    // methods end
}
