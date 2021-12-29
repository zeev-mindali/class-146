package inheritance.targil1;

public class Cat {
    protected String name;
    protected int mustache;
    protected String color;

    public Cat(String name, int mustache, String color) {
        this.name = name;
        this.mustache = mustache;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMustache() {
        return mustache;
    }

    public void setMustache(int mustache) {
        this.mustache = mustache;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mustache=" + mustache +
                ", color='" + color + '\'' +
                '}';
    }
}
