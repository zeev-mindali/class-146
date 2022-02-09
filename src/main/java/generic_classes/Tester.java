package generic_classes;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        /*
        IntegerClass myInt = new IntegerClass(5);
        myInt.print();
        */

        //Printer<String> toPrint = new Printer<>("Gutta morgan !!!");
        //toPrint.print();

//        shout("Zeevik ");
//        shout(15560);
//        shout(15.56);
//        shout(true);

        System.out.println();

        //kiss("Zeev","Amital");
        //kiss("Omer",1200);


        List<Fish> myAnimals = new ArrayList<>();
        myAnimals.add(new Fish("Bumper"));
        myAnimals.add(new Fish("Nipo"));

        //printArray(myAnimals);

    }

    private static void printArray(List<? extends Animal> myAnimals) {
        for(Animal item:myAnimals){
            System.out.println(item.getName());
        }
    }


    public static <T> void shout(T shoutMe) {
        System.out.println(shoutMe + "!!!");
    }

    public static <T, V> void kiss(T victim1, V victim2) {
        System.out.println(victim1 + " and " + victim2);
        System.out.println("Sitting on a tree");
        System.out.println("K I S S I N G");
    }
}
