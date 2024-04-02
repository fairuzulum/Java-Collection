package com.tutorial.java_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class XampleSet {
    public static void main(String[] args) {

        // Bedanya set dan list, set itu tidak bisa menyimpan data yang sama
        // set hanya sebatas menyimpan data yang unik
        // get(), set() nya, ini tidak ada, jadi tidak bisa mengases index dan memanipulasi datanya
        // set itu himpunan kalau dibahasa indonesia
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        System.out.println(integerSet);
        System.out.println("Size: " + integerSet.size());

        Set<String> names = new HashSet<>();
        names.add("Alex");
        names.add("Arif");
        names.add("Fahrul");
        names.add("Ayu");
        names.add("Ayu2");
        names.remove("Ayu2");
        System.out.println(names);


        Set<String> newNames = Set.of("Sheila","Alsa","Ayu");
//        newNames.add("Jhiro");
        System.out.println(newNames);

        Hero sabri = new Hero("Sabri");
        Hero sabrina = new Hero("Sabri");
        Hero ferdy = new Hero("Ferdy");
        Hero adit = new Hero("Adit");

        Set<Hero> heroes = new HashSet<>();
        heroes.add(sabri);
        heroes.add(sabrina);
        heroes.add(ferdy);
        heroes.add(adit);
        System.out.println(heroes);

        // immutable
        Set<Hero> newHeroes = Set.of(sabri,ferdy,adit);
        System.out.println(newHeroes);
    }


    public static class Hero{
        private String name;

        public Hero(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Hero hero = (Hero) o;
            return Objects.equals(name, hero.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
