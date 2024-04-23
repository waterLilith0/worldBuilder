/*
creates a hashmap with each category getting assigned a random id
includes names and colors for itself
 */

package com.worldbuilder;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;

public class Category implements Serializable {
    // variables
    private static final long serialversionuid = 1l;
    protected String name;
    protected int color;
    protected SecureRandom id = new SecureRandom(); // used to give individual numbers to each of the savedElements items
    protected int test = id.nextInt();
    protected HashMap<Integer, Element> savedElements = new HashMap<Integer, Element>(); // save elements with id
    // variables end

    // methods
    /**
     * This lets you add an element to the category, saves them with individual Hash values using SecureRandom
     * @param aElement
     */
    void addElement(Element aElement) {
        savedElements.put(id.nextInt(), aElement);
    }

    /**
     * @return reads a full HashMap of type Integer, Element from savedElements
     */
    HashMap<Integer, Element> readAllElements() {
        return savedElements;
    }

    /**
     * @return Integer Set of saved Elements
     */
    Set<Integer> hashesElements() {
        return savedElements.keySet();
    }

    /**
     * @param aElement enter the Element's id to remove from the HashMap
     */
    void removeElement(Integer aElement) {
        savedElements.remove(aElement);
    }

    /**
     * @return gives back a String with the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return int with the hexcode of color
     */
    public int getColor() {
        return color;
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(int color) {
        this.color = color;
    }
    // methods end

    // constructor

    /**
     * creates a hashmap with each Element getting assigned a random id - includes names and colors for itself
     * @id is a SecureRandom
     * @name is a simple name, can be freely chosen since the used key is id
     * @color is a simple hex code that's used to set and read a specific color
     * @savedElements this is where each of Category's objects of the Element type are saved
     */
    Category(String name) {
        this.name = name;
    }
    // constructor end
}
