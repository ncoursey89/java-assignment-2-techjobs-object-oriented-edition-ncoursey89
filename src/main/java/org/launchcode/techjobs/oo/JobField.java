package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    //Fields
    public int id;
    private static int nextId = 1;
    private String value;

    //Constructors
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    //Methods

    //ToString Method
    @Override
    public String toString() {
        return value;
    }

    // Hashcode Method
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters & Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
