package com.tutorial.java_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class XampleMap {
    public static void main(String[] args) {
//        Map<Key, Value> sebuahVariable;
        // put() -> untuk menambha data kedalam map
        Map<String, String> country = new HashMap<>();
        country.put("Indonesia", "Jakarta");
        country.put("Philipina", "Manila");
        country.put("Japan", "Tokyo");
//        country.put("Indonesia", "IKN"); // ini tidak tepat. Hati" kalau keynya sama. dia akan replace
        country.replace("Indonesia", "IKN");

        System.out.println(country);
        System.out.println(country.get("Japan")); // sama seperti array list untuk dapetin indexnya, tapi di map namanya berubah jadi key
        System.out.println(country.size());
        System.out.println(country.get("Jap"));
        System.out.println(country.values()); // ini mengubah semua valuenya menjadi array
        System.out.println(country.keySet()); // ini mengubah semua keynya menjadi array

        // Cara looping
        // entrySet(0 : agar bisa dilooping datanya diubah ke set)
        for (Map.Entry<String, String> data : country.entrySet()) {
            System.out.println(data.getKey() + ": " + data.getValue());
        }

        System.out.println("===========");
        for (String key : country.keySet()) {
            System.out.println(key + ": " + country.get(key));
        }

        Map<String, Object> newData = new HashMap<>();
        newData.put("Number", 100);
        newData.put("Bool", true);
        newData.put("String", "Si String");
        newData.put("Object", new Hero("Jhiro"));

        System.out.println(newData);
        for (Map.Entry<String, Object> data : newData.entrySet()) {
            System.out.println(data.getKey() + ": " + data.getValue());
        }

        // Immutable
        Map<Integer, Hero> listHero = Map.of(
                1,new Hero("Jhiro"),
                2,new Hero("Sabri")
        );
        listHero.get(1).setName("Orij");
//        listHero.replace(1, new Hero("Adit"));
        System.out.println(listHero);

    }

    public static class Hero{
        private String name;

        public Hero(String name) {
            this.name = name;
        }

        public void setName(String name) {
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
