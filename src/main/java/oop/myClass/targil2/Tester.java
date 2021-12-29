package oop.myClass.targil2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car = new Car();
        car.setCarNumber(1113334);
        car.showData();

        System.out.println("Amount to increase: ");
        int amount = input.nextInt();

        for (int counter = 0; counter < amount; counter++) {
            car.speedUp();
        }
        /*
        while (amount>0){
            amount--;
            car.speedUp();
        }
       *
         */

        car.showData();
        car.slowDown();
        car.slowDown();
        car.showData();
    }
}
