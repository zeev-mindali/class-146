package polymorphizem;

public class Animal {
    protected String name;
    protected int weight;
    protected boolean isAlive = true;
    protected String sound = "shhhhhhh";

    public Animal(String name, int weight, String sound) {
        this.name = name;
        this.weight = weight;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

    public void eat(Animal animal) {
        if (!animal.isAlive) {
            System.out.println("איכס, זה מת");
            return;
        }

        if (this instanceof Lion && animal instanceof Cow ||
                this instanceof Cat && animal instanceof Mouse) {
            animal.isAlive = false;
        } else {
            System.out.println("You can touch this....");
        }
    }

    public void drinkMilk(Cow cow){
        if (!cow.isAlive){
            System.out.println("Yakkk, it's blood !!!!");
            return;
        }
        if (this instanceof Cat){
            System.out.println("Milk, yami yammmmmi");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                ", sound='" + sound + '\'' +
                '}';
    }
}
