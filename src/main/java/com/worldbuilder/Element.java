package com.worldbuilder;

import java.io.Serializable;
import java.util.HashMap;

public class Element implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private String name;
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

    public String getName() {
        return name;
    }
    // methods end

    // constructors
    Element(String name) {
        this.name = name;
    }
    // constructors end
}
