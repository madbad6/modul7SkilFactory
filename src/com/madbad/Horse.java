package com.madbad;

public class Horse implements Transported{
    private String name;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " Go out to fields" + toTrans();
    }


    @Override
    public String toTrans() {
        return " ride the kids";
    }
}
