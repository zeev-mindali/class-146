package my_exception;

public class ShrikerTester {
    public static void main(String[] args) {
        try {
            MyTest.test();
        } catch (TalException err) {
            System.out.println(err.getMessage());
        }
    }
}
