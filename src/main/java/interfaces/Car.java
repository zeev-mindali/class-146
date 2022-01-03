package interfaces;

public class Car implements Soundable{
    @Override
    public String makeSound() {
        return "Beep beep";
    }
}
