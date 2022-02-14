package functional_programing_in_action;

import functional_programing_in_action.beans.Car;
import functional_programing_in_action.beans.Person;
import functional_programing_in_action.mockdata.MockData;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
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
        Predicate<Car> carYear = car -> car.getYear() > 2012;
        Predicate<Car> carColor = car -> car.getColor().equals("Red");

        List<Car> carForLea = cars.stream()
                .filter(carYear)
                //.filter(carColor)
                .limit(10)
                .collect(Collectors.toList());

        //carForLea.forEach(System.out::println);


//        Stream.of(2,4,6,7,8,9,10,13,16)
//                .filter(num->num%2==0)
//                .forEach(item-> System.out.print(item + " "));
//        System.out.println();
//        Stream.of(2,4,6,8,9,10,13,16)
//                .dropWhile(num->num%2==0)
//                .forEach(item-> System.out.print(item + " "));
//        System.out.println();
//        Stream.of(2,4,6,8,9,10,13,16)
//                .takeWhile(num->num%2==0)
//                .forEach(item-> System.out.print(item + " "));
//        System.out.println();
//        int[] numbers = {1,2,3,4,5,6,8,9,10};
//        int result = Arrays.stream(numbers).filter(num->num==7)
//                .findFirst()
//                .orElse(-1);
//        System.out.println(result);
//
//        int[] dupNumbers = {1,2,3,4,5,6,7,8,9,9,9,9,10,11,12,13,9};
//        int myRes = Arrays.stream(dupNumbers).filter(num->num==9)
//                .findAny()
//                .orElse(-1);
//        System.out.println(myRes);
//
//        int[] evenNumbers = {2,4,6,8,10,12,15,16,18,20};
//        boolean allEven = Arrays.stream(evenNumbers).allMatch(num->num%2==0);
//        System.out.println("All is even: "+allEven);

        List<Integer> numbers = List.of(1, 5, 7, 2, 9, 6, 8, 4, 3, 0, 3, 5, 5, 5, 4, 8, 6, 9, 7, 3, 1, 5, 7, 6, 5, 7, 1, 3, 5, 9, 7, 6, 1, 3, 2, 6, 4, 5, 8, 7, 9);
        //impertave / declartive
//        List<Integer> distNumbers = new ArrayList<>();
//        for (int counter = 0; counter < numbers.size(); counter++) {
//            for (int counter2 = counter; counter2 < numbers.size(); counter2++) {
//                if (distNumbers.get(counter2)==distNumbers.get(counter)){
//
//                }
//            }
//        }
//        List<Integer> distNumbers = numbers.stream().distinct().collect(Collectors.toList());
//        Set<Integer> talNumbers = new HashSet<>(numbers);
//
//        System.out.println(distNumbers);
//        System.out.println(talNumbers);

        /*
        Map<Integer, List<Car>> map = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getYear));

        //SELECT * FROM `cars` GROUP BY cars.year

        for(Map.Entry<Integer, List<Car>> item:map.entrySet()){
            System.out.println(item.getKey());
        }
        System.out.println();
        List<Car> all_minis = map.get(2012);
        all_minis.forEach(System.out::println);

         */


        List<String> names = List.of("Zeev","Amital","Golan","Tal","Amital",
                "Saar","Saar","Saar","Amital","Shacher","Shacher","Amital");

        Map<String,Long> allPersons = names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(allPersons);

        //תרגיל כיתה, תספרו כמה פעמים מופיע שם בתוך הגייסון


        Map<String,Long> talSolution = MockData.getPeople().stream()
                .collect(Collectors.groupingBy(Person::getFirstName,Collectors.counting()));


        System.out.println(talSolution);

        int year = LocalDate.now().getYear();

        Map<Integer,Long> talBetterSolution = MockData.getPeople().stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));

        talBetterSolution.forEach((key,value)->System.out.println("Year :"+(year-key)+" born :"+value) );


        /*
        for (Map.Entry<Integer,Long> item:talBetterSolution.entrySet()){
            System.out.println("Year :"+(year-item.getKey())+" born :"+item.getValue());
        }
        */


    }
}
