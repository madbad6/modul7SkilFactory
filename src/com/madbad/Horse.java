package com.madbad;

public class Horse{
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " Go out to fields";
    }

}
