package oop.Collections.list;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zeev");
        names.add("Golan");
        names.add("Tal");
        names.add("Omer");
        names.add("Saar");
        names.add("Omer");
        names.add("Saar");

        //omer in year 2002
        for (int counter = 0; counter < names.size(); counter++) {
            System.out.println(names.get(counter));
        }
        System.out.println("-------------------------------------------");

        //omer in year 2012
        for (String item:names){
            System.out.println(item);
        }
        System.out.println("-------------------------------------------");

        //omer in year 2022
        names.forEach(System.out::println); //Functional programming
    }
}
