package com.company;

public class SpecialNumber implements Comparable<SpecialNumber> {
    private int value;

    public SpecialNumber(int val) {
        this.value = val;
    }

    public String toString()
    {
        return String.valueOf(value);
    }

    public int compareTo(SpecialNumber sp) {
        return (this.value - sp.value);
    }
}
