package oop.myClass.Targil3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person[] persons = new Person[2];

        for (int counter = 0; counter < persons.length; counter++) {
            System.out.println("please enter name height and weight:");
            persons[counter] = new Person();
            persons[counter].setName(input.nextLine());
            persons[counter].setHeight(input.nextInt());
            persons[counter].setWeight(input.nextInt());
            //init of the Scanner
            input.nextLine();
        }

        for (int counter = 0; counter < persons.length; counter++) {
            System.out.println(persons[counter]);
        }
        
    }
}
