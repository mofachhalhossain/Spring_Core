package com.reference;

public class secondClass {
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public secondClass(int b) {
        this.b = b;
    }

    public secondClass() {
        super();
    }

    @Override
    public String toString() {
        return "secondClass{" +
                "b=" + b +
                '}';
    }
}
