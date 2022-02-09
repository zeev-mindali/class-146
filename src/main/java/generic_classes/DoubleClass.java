package generic_classes;

public class DoubleClass {
    private double thingToPrint;

    public DoubleClass(double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
