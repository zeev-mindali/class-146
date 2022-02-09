package generic_classes;

public class Printer<Tal>{
    private Tal thingPrint;

    public Printer(Tal thingPrint) {
        this.thingPrint = thingPrint;
    }

    public void print(){
        System.out.println(this.thingPrint);
    }
}
