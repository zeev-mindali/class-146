package junit_demo;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest1(){
        int arr[] = {1,2,3,4,5};
        System.out.println(arr[20]);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest2(){
        int arr[] = {1,2,3,4,5};
        System.out.println(arr[0]);
    }
}
