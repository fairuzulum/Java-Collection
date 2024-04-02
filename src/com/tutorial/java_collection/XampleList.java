package com.tutorial.java_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class XampleList {
    public static void main(String[] args) {
        /**
         * get(0) -> mengambil element berdasarkan index
         * set(int index, Object element) -> merubah berdasarkan index
         */

        List<String> names = new ArrayList<>();
        names.add("Jhiro");
        names.add("Ilham");
        names.add("Sauqi");
        names.add("Abun");
        names.add("Luky");
        // jika ingin mengakses method yang tidak ada di list tapi ada di array list kita bisa conversinya
//        ArrayList<String> newList = (ArrayList<String>) names;
//        newList.clone();
        System.out.println(names);
        System.out.println(names.get(0));
        names.set(0, "Sabri");
        System.out.println(names);
        names.remove("Sabri"); // menghapus data by value
        names.remove(2); // menghapus data by index
        System.out.println(names);

        List<String> names2 = new ArrayList<>();
        printList(names2);
        printList(new ArrayList<>());
        printList(names);
        printList(new Vector<>());

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " -----");
        }

        // Immutable -> gak bisa diubah
        List<String> theNames = List.of("Ilham", "Sauqi", "Luky");
//        theNames.add("Jhiro");
//        theNames.set(0, "Jhiro");
//        theNames.remove("Sauqi");
        System.out.println(theNames);
        // 1,4,5,6,7,3,6,50,5
        // angka terkecil; 1
        // angka terbesar; 50

        List<Integer> theNumbers = new ArrayList<>(List.of(1,4,5,6,7,3,6,50,5));
        int max = theNumbers.get(0);
        int min = theNumbers.get(0);
        for (int i = 0; i < theNumbers.size(); i++) {
            if (theNumbers.get(i) > max) {
                max = theNumbers.get(i);
            }
            if (theNumbers.get(i) < min) {
                min = theNumbers.get(i);
            }
        }
        System.out.println("Nilai terbesarnya adalah : " + max);
        System.out.println("Nilai terkecil adalah : " + min);

    }


    public static void printList(List<String> list) {
        // datanya kalau kita butuh method khusus dari class implementasinya tinggal kita casting
        System.out.println(list);
    }
}
