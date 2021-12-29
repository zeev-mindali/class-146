package oop.myClass.Targil3;

public class Person {
    private String name;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show(){
        System.out.printf("%s  height:%d  weight:%d",this.name,this.height,this.weight);
    }

    public void thin2fat(Person[] persons){
        for (int counter = 0; counter < persons.length-1; counter++) {
            if (persons[counter].weight>persons[counter+1].weight){
                Person temp = persons[counter];
                persons[counter]=persons[counter+1];
                persons[counter+1]=temp;
        }

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


}
