package functional_programing_in_action;

import functional_programing_in_action.beans.Car;
import functional_programing_in_action.beans.Person;
import functional_programing_in_action.mockdata.MockData;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tester2 {
    public static void main(String[] args) throws IOException {
//        System.out.println("with fori");
//
//        for (int counter=1;counter<=10;counter++){
//            System.out.print (counter+" ");
//        }
//        System.out.println();
//        System.out.println("with int stream exclusive");
//
//        IntStream.range(0,10).forEach(System.out::println);
//        IntStream.rangeClosed(0,10).forEach(System.out::println);


        List<Person> people = MockData.getPeople();
//
//        IntStream.range(0,5)
//                .forEach(index-> System.out.println(people.get(index)));
//
//        for (int index = 0; index < 5; index++) {
//            System.out.println(people.get(index));
//
//        }

//      people.stream()
//              .limit(5)
//              .forEach(System.out::println);
//
//      IntStream.iterate(100, value -> value+1)
//              .limit(11)
//              .forEach(System.out::println);

        //phase I - building list of names...
        List<String> peopleString = List.of("zeev", "amital", "tal", "gabi", "jacob");
        //phase II - building a string builder
        StringBuilder join = new StringBuilder();
        //phase III - iterate on collection
        for (String name : peopleString) {
            //phase IV - first char in name, make it upper case  z -> Z
            join.append(name.substring(0, 1).toUpperCase())
                    //phase V - add the name without the first letter
                    .append(name.substring(1))
                    //phase VI - add ,
                    .append(", ");
        }
        //phase VII - print the string and decrease 2 char from the end....
        System.out.println(join.substring(0, join.length() - 2));

        String leaStyle = peopleString.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.joining(" : "));

        System.out.println(leaStyle);

        List<String> sorted = people.stream()
                .map(Person::getFirstName)
                .sorted()
                .limit(25)
                .collect(Collectors.toList());

        List<String> revSorted = people.stream()
                .map(Person::getFirstName)
                .sorted(Comparator.reverseOrder())
                .limit(25)
                .collect(Collectors.toList());

        Comparator<Person> comparing = Comparator
                .comparing(Person::getFirstName)
                .reversed()
                .thenComparing(Person::getLastName);


        Comparator<Person> comparingEmail = Comparator.comparing(Person::getEmail);

        Comparator<Person> compareAge = Comparator.comparing(Person::getAge);

        Comparator<Person> choosenCompare = compareAge;

        List<Person> personByAge = people.stream()
                .sorted(choosenCompare)
                .collect(Collectors.toList());


//        System.out.println(sorted);
//        System.out.println(revSorted);

        List<Car> topTen = MockData.getCars().stream()
                .filter(car->car.getColor().equals("Red"))
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(10)
                .collect(Collectors.toList());

        //topTen.forEach(System.out::println);

        List<Integer> numbers = List.of(10,2,3,100,23,93,99);
        Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        Integer max = numbers.stream().max(Comparator.naturalOrder()).get();

        //System.out.println(max);

        long count = MockData.getCars().stream()
                .filter(car->car.getMake().equalsIgnoreCase("BuIck"))
                .filter(car->car.getYear()>2010)
                .count();

        //System.out.println(count);

        double lowPriceForLea = MockData.getCars().stream()
                .filter(car->car.getMake().equalsIgnoreCase("Zeev"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(-1);

        //System.out.println(lowPriceForLea);

        Double avg = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        Double sum = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println(sum);

    }
}
