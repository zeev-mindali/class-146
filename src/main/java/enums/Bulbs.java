package enums;

public enum Bulbs {
    W5(40),   //0
    W8(60),   //1
    W12(75),  //2
    W18(100); //3

    private int oldBulb;

    Bulbs(int oldBulb){
        this.oldBulb=oldBulb;
    }

    public int getOldBulb() {
        return oldBulb;
    }
}
