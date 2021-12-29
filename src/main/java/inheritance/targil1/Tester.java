package inheritance.targil1;

public class Tester {
    public static void main(String[] args) {
        /*
        Cat bumper = new Cat("Bumper",10,"Asphalt");
        SiamiCat manyak = new SiamiCat("Manyak",5,"offwhite","tuna");
        StreetCat gibur = new StreetCat("Gibur",1,"multi color",50);

        System.out.println(bumper);
        System.out.println(manyak);
        System.out.println(gibur);
        */

        Cat[] myCats = new Cat[3];
        myCats[0] = new Cat("Bumper",10,"Asphalt");
        myCats[1] = new SiamiCat("Manyak",5,"offwhite","tuna");
        myCats[2] = new StreetCat("Gibur",1,"multi color",50);

        for (Cat item:myCats){
            System.out.println("=================");
            System.out.println(item);
        }
        Cat newCat = (Cat)myCats[2];
        StreetCat s = (StreetCat)myCats[2];

        ((StreetCat)myCats[2]).getNumOfFights();

        System.out.println(myCats[2] instanceof SiamiCat);
    }
}
