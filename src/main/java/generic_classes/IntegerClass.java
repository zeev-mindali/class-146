package generic_classes;

public class IntegerClass {
    private int thingToPrint;

    public IntegerClass(int thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
