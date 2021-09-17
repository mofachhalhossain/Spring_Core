package com.reference;

public class firstClass {
    private int a;
    private secondClass obj;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public secondClass getObj() {
        return obj;
    }

    public void setObj(secondClass obj) {
        this.obj = obj;
    }

    public firstClass() {
        super();
    }

    @Override
    public String toString() {
        return "firstClass{" +
                "a=" + a +
                ", obj=" + obj +
                '}';
    }
}
