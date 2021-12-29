package inheritance.targil1;

public class Tester {
    public static void main(String[] args) {
        Cat bumper = new Cat("Bumper",10,"Asphalt");
        SiamiCat manyak = new SiamiCat("Manyak",5,"offwhite","tuna");
        StreetCat gibur = new StreetCat("Gibur",1,"multi color",50);

        System.out.println(bumper);
        System.out.println(manyak);
        System.out.println(gibur);
    }
}
