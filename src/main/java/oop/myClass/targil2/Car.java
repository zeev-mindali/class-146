package oop.myClass.targil2;

public class Car {
    private int carNumber, carSpeed;
    private final int MIN_NUMBER=5,MAX_NUMBER=8;

    public int getCarNumber() {
        return carNumber;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
        int carDigit = digitNumber();
        if (carDigit<MIN_NUMBER || carDigit>MAX_NUMBER){
            System.out.println("Your car number is invalid");
            this.carNumber=0;
        }

    }

    public void speedUp() {
        this.carSpeed++;
    }

    public void slowDown() {
        if (this.carSpeed > 0) {
            this.carSpeed--;
        }
    }

    public void stopCar() {
        /*
        for (int counter = this.carSpeed; counter > 0; counter--) {
            slowDown();
        }
        */
        while (this.carSpeed>0){
            slowDown();
        }
    }

    private int digitNumber(){
        int counter=0;
        int temp=this.carNumber;
        while (temp>0){
            temp/=10;
            counter++;
        }
        return counter;
    }

    public void showData(){
        //System.out.println("Car number: "+this.carNumber+" speed: "+this.carSpeed);
        System.out.printf("Car Number: %d  Car Speed: %d \n",this.carNumber,this.carSpeed);
    }

}
