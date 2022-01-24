package junit_demo_classes;

public class MyCalculator {
    public static int power_ver1(int number1, int number2){
        int result=0;
        for (int counter=0;counter<number2;counter++){
            result*=number1;
        }
        return result;
    }
    public static int power_ver2(int number1, int number2){
        int result=1;
        for (int counter=0;counter<number2;counter++){
            result*=number1;
        }
        return result;
    }
}
