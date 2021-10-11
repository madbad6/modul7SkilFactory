package com.madbad;

public class Generator extends Machinery{
    private String name;

    public Generator(String fuelType, String name) {
        super(fuelType);
        this.name = name;
    }

    @Override
    public String toDo() {
        return name + " Produces electricity and it is working " + getFuelType();
    }

    @Override
    public String toString() {
        return toDo();
    }
}
