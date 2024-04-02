package com.tutorial.java_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExampleIterable {
    public static void main(String[] args){
        // generic -> interface/classnya memberikan kebebasan kita untuk menaruh tipedata apapun, tapi ketika kita gunakan wajib kita state diawal tipe datanya
        // generic harus diisi dengan tipe data non-primitive
//        Iterable<String> name; // collection of String
//        String[] nms; // Array of String

        // Iterable = hanya menyimpan dan menampilkan data // masih mirip dengan array, belum dinamis
        // java version 8 kebawah -> Arrays.asList()
        // java 8 -> List.of()
        // default dari array:list panjangnya 10
        Iterable<String> names = new ArrayList<>(Arrays.asList("Jhiro","Ilham","Sauqi","Abun"));
//        System.out.println(names);

        // Cara akses atau looping Iterable
        // cara lama
        // .iterator() : mengembalikan iterator yg digunakan untuk mengakses element-element collectionIterable kita secara berurutan
//        System.out.println(names.iterator());
        // methd .next() -> akan menghasilkan data dari hasil iterasi
        Iterator<String> iterator = names.iterator();
//        System.out.println(iterator.next() + " 1");
//        System.out.println(iterator.next() + " 2");
//        System.out.println(iterator.next() + " 3");
//        System.out.println(iterator.next() + " 4");
        while(iterator.hasNext()){ // hasNext() itu maksudnya apakah data setelah data kita itu masih ada data lagi tidak
            System.out.println(iterator.next() + " ++");
        }
        for(String name : names){
            System.out.println(name);
        }


    }
}
