package com.madbad;

abstract class Machinery {
    private String fuelType;

    public Machinery(String fuelType) {
        this.fuelType = fuelType;
    }
    public abstract String toDo();

    public String getFuelType() {
        return fuelType;
    }
}
