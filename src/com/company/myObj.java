package com.company;

import java.util.Comparator;
import java.util.Random;

public class myObj implements Comparable<myObj> {
    public int n1, n2;

    public myObj() {
        var r = new Random();
        n1 = r.nextInt() % 100;
        n2 = r.nextInt() % 100;
    }

    @Override
    public int compareTo(myObj o) {
        return (n1 + n2) - (o.n1 + o.n2);
    }

    @Override
    public String toString() {
        return "myObj { n1 = " + n1 + ", n2 = " + n2 + ", sum = " + (n1 + n2) + " }";
    }

}

class myCompare implements Comparator<myObj> {
    @Override
    public int compare(myObj o1, myObj o2) {
        return o1.compareTo(o2);
    }
}