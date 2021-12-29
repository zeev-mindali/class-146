package inheritance.targil1;

public class StreetCat extends Cat{
    private int numOfFights;

    public StreetCat(String name, int mustache, String color, int numOfFights) {
        super(name, mustache, color);
        this.numOfFights = numOfFights;
    }

    public int getNumOfFights() {
        return numOfFights;
    }

    public void setNumOfFights(int numOfFights) {
        this.numOfFights = numOfFights;
    }

    @Override
    public String toString() {
        /*
        return "StreetCat{" +
                "name='" + name + '\'' +
                ", mustache=" + mustache +
                ", color='" + color + '\'' +
                ", numOfFights=" + numOfFights +
                '}';

         */
        return super.toString()+"\n number of fights:"+this.numOfFights;
    }
}
