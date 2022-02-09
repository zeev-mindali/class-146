package functional_programing_in_action;

import functional_programing_in_action.beans.Car;
import functional_programing_in_action.beans.Person;
import functional_programing_in_action.mockdata.MockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) throws IOException {
        //List<Person> people = MockData.getPeople();
        List<Car> cars = MockData.getCars();

        //people.forEach(System.out::println);

        /*
        //imperative approach
        //get all people under age 18 and only the first 10
        List<Person> youngPeople = new ArrayList<>();
        int limit=10;
        int counter=0;
        for (Person person:people){
            if (person.getAge()<=18){
                youngPeople.add(person);
                counter++;
            }
            if (counter==limit){
                break;
            }
        }

        for (Person person:youngPeople){
            System.out.println(person);
        }
         */

        /*
        List<Person> youngPeople = people.stream()
                .filter(item->item.getAge()>=24 && item.getAge()<=28)
                .filter(item->item.getGender().equals("Female"))
                .limit(10)
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
        */

        //Predicate<Car> carPrice = car->car.getPrice()<20_000.00;
        Predicate<Car> carYear = car->car.getYear()>2012;
        Predicate<Car> carColor = car -> car.getColor().equals("Red");

        List<Car> carForLea = cars.stream()
                .filter(carYear)
                //.filter(carColor)
                .limit(10)
                .collect(Collectors.toList());

        //carForLea.forEach(System.out::println);


        Stream.of(2,4,6,7,8,9,10,13,16)
                .filter(num->num%2==0)
                .forEach(item-> System.out.print(item + " "));
        System.out.println();
        Stream.of(2,4,6,8,9,10,13,16)
                .dropWhile(num->num%2==0)
                .forEach(item-> System.out.print(item + " "));
        System.out.println();
        Stream.of(2,4,6,8,9,10,13,16)
                .takeWhile(num->num%2==0)
                .forEach(item-> System.out.print(item + " "));
        System.out.println();
        int[] numbers = {1,2,3,4,5,6,8,9,10};
        int result = Arrays.stream(numbers).filter(num->num==7)
                .findFirst()
                .orElse(-1);
        System.out.println(result);

        int[] dupNumbers = {1,2,3,4,5,6,7,8,9,9,9,9,10,11,12,13,9};
        int myRes = Arrays.stream(dupNumbers).filter(num->num==9)
                .findAny()
                .orElse(-1);
        System.out.println(myRes);


    }
}
