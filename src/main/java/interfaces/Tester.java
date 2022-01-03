package interfaces;

public class Tester {
    public static void main(String[] args) {
        Soundable[] myList = {new Car(),new Dog(), new Student(), new Tv()};
        String myName = "hacmon amar yoav israel";
        String[] splitName = myName.split(" ");
        System.out.println(splitName[2]);
        /*
        for (Soundable item:myList){
            System.out.println(item.getClass().getName().split("\\.")[1]);
            System.out.println(item.makeSound());
            System.out.println("====================");
        }
        */
    }
}
