package junit_demo;

import org.junit.Test;

public class TimeOutTest {
    @Test(timeout = 3)
    public void timeOutExample1(){
        long count=0;
        for (int counter = 0; counter < 10_000_000; counter++) {
            count++;
        }
    }
    @Test(timeout = 3)
    public void timeOutExample2(){
        long count=0;
        for (int counter = 0; counter < 100; counter++) {
            count++;
        }
    }
}
