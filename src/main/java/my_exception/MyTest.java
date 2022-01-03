package my_exception;

public class MyTest {
    public static void test() throws TalException{
        System.out.println("I see dead people !!!");
        throw new TalException("Tal iz in the house !!!");
    }
}
