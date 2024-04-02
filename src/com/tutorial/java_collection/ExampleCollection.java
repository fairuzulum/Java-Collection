package com.tutorial.java_collection;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollection {
    public static void main(String[] args) {
        /**
         * add() -> digunakan untuk menambah data sesuai dengan tipe data yang ditentukan di awal
         * remove() -> digunakan untuk menghapus data berdasarkan value
         * contains() -> cek apakah data nya ada atau tidak
         *
         *  name[] -> seperti ini masih enggak bisa disini
         *  dicollection tidak bisa mendapatkan index
        */

        Collection<String> names = new ArrayList<>();
        names.add("Jhiro");
        names.add("Ilham");
        names.add("Sauqi");
        names.add("Abun");
        names.add("Luky");
        System.out.println(names);
        names.remove("Luky");
        names.remove("Ilham");
        System.out.println(names);
        System.out.println(names.contains("Jhiro"));

        Collection<String> newNames = new ArrayList<>();
        newNames.add("Haqi");
        newNames.add("Zarek");
        names.addAll(newNames);

        System.out.println(names);

        System.out.println(names.size() + " size");

        for (String name : names) {
            System.out.println(name);
        }
    }

}
