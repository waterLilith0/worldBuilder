package com.worldbuilder;

import java.io.Serializable;
import java.util.HashMap;

public class Element implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    private String name;
    private String text;
    private int color;
    // variables end

    // methods

    /**
     * @return reads text as String
     */
    public String getText() {
        return text;
    }

    /**
     * @return reads color as a hex integer
     */
    public int getColor() {
        return color;
    }

    /**
     * @return reads name as String
     */
    public String getName() {
        return name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(int color) {
        this.color = color;
    }
    // methods end

    // constructors

    /**
     * @text this is where the user's description goes into
     * @name this is the name of the Element
     * @color color as a hex code
     */
    Element(String name) {
        this.name = name;
    }
    // constructors end
}
