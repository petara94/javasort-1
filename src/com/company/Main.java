package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        var x = new ArrayList<myObj>();
        x.add(new myObj());
        x.add(new myObj());
        x.add(new myObj());
        x.add(new myObj());
        x.add(new myObj());

        for (var i : x) {
            System.out.println(i);
        }
        System.out.println("\nSorted:");

        Collections.sort(x, new myCompare());


        for (var i : x) {
            System.out.println(i);
        }

    }
}
