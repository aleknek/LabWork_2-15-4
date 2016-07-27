package com.brainacad.oop.testmygen;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);
        List<Integer> list = myNumGenerator.generate();
        Set<Integer> set = myNumGenerator.generateDistinct();

        printCollection(list);
        printCollection(set);

    }

    public static void printCollection(Collection<Integer> collection) {

        System.out.println("print " + collection.getClass());
        Iterator<Integer> iterator = collection.iterator();
        System.out.print("[");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(",");
            }
        }
        System.out.println("]");

    }
}
