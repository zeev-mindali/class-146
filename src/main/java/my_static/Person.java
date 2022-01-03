package my_static;

public class Person {
    private int id;
    private String name;
    private String nfc;
    public static int counter=100;
    public final boolean is24=true;

    public Person(String name, String nfc) {
        this.id = counter++;
        this.name = name;
        this.nfc = nfc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNfc() {
        return nfc;
    }

    public void setNfc(String nfc) {
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nfc='" + nfc + '\'' +
                '}';
    }
}
