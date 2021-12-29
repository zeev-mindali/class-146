package polymorphizem;

public class Tester {
    public static void main(String[] args) {
        Lion luva = new Lion("Luva",120,"Roar !!!!!");
        Cow mush = new Cow("Mush Mush",500,"Muuuuuuuuuuuuuuuuu");
        Cat kot = new Cat("Kot",10,"Miyouuuu chatuuuuula");
        Mouse mishka = new Mouse("Mishka",1,"Sqwissssssssss");

        kot.drinkMilk(mush);
        kot.makeSound();
        luva.eat(mush);
        kot.drinkMilk(mush);
        mishka.makeSound();
        kot.eat(mishka);
    }
}
