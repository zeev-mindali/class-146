package oop.if_examples;

public class _Printf {
    public static void main(String[] args) {
        String name="Omer",city="moddin",age="28";

        System.out.printf("My name is %s and i am from %s and my age is %s\n",name,city,age);

        name="Tal";
        city="Ramat gan";
        age="22";
        System.out.printf("My name is %s and i am from %s and my age is %s\n",name,city,age);

        name="Gerry";
        city="Ramat hagolan";
        age="[not nice to ask a lady her age]";
        System.out.println("My name is "+name+" and i am from "+city+" and my age is "+age);


    }
}
