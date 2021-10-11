package com.madbad;

public class Plane extends Machinery{
    private String name;
    public Plane(String fuelType, String name) {
        super(fuelType);
        this.name = name;
    }

    @Override
    public String toDo() {
        return name + " Flaying into sky and it is working " + getFuelType();
    }

    @Override
    public String toString() {
        return toDo();
    }
}
