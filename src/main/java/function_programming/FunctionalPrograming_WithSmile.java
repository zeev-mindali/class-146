package function_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalPrograming_WithSmile {
    //parameter -> expression
    //(parameter1, parameter2)->expression
    //(parameter1, parameter2)->{ code block }

    public static void main(String[] args) {
        List<Person> pepole = List.of(
                new Person("Zeev", Person.Gender.MALE),
                new Person("Golan", Person.Gender.MALE),
                new Person("Tal", Person.Gender.FEMALE),
                new Person("Yakov", Person.Gender.MALE),
                new Person("Nipo", Person.Gender.OTHER),
                new Person("Geri", Person.Gender.FEMALE),
                new Person("Lea", Person.Gender.FEMALE)
        );

        //Imperative approach
        /*
        List<Person> females = new ArrayList<>();
        for (Person person:pepole){
            if (Person.Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female:females){
            System.out.println(female);
        }

        System.out.println("===============================================");
        //Declarative approach
        List<Person> femalesFast = pepole.stream()
                .filter(item-> Person.Gender.FEMALE.equals(item.getGender()))
                .collect(Collectors.toList());

        femalesFast.forEach(System.out::println);

         */
        int increment = incrementByOne(1);
        System.out.println(increment);

        //Function<T,T> name = <expression>
        //         arg    return
        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
        int inc2 = incrementByOneFunction.apply(9);
        System.out.println(inc2);

        //imp app.
        System.out.println(incrementByOneAndMultiply(5,10));

        //dec app./

        Function<Integer,Integer> multiplyBy10Function = number->number*10;

        Function<Integer,Integer> addAndMulti = incrementByOneFunction
                .andThen(multiplyBy10Function);
        System.out.println("golan grade exam:"+addAndMulti.apply(9));

        BiFunction<Integer,Integer,Integer> addOneToTwoNumbers =
                (duh,multi)->(duh+1)*multi;

        System.out.println("Golan salary per hour: "+addOneToTwoNumbers.apply(4,100));
        System.out.println("Tal salary per hour: "+addOneToTwoNumbers.apply(4,1000));

        List<String> phoneNumbers = Arrays.asList("052-4043142","972-52-4043142","52-4043142","0524042142222");
        System.out.println("without predicate");
        System.out.println(isPhoneValid("052-4043142"));
        System.out.println(isPhoneValid("972-52-4043142"));
        System.out.println(isPhoneValid("52-4043142"));
        System.out.println(isPhoneValid("052-4042142"));
        System.out.println("===============================================");

        Predicate<String> isValid = phoneNumber->phoneNumber.startsWith("05") && phoneNumber.length()==11;
        Predicate<String> contains3 = phoneNumber->phoneNumber.contains("3");
        System.out.println("with predicate");
        System.out.println(isValid.and(contains3).test("052-4043142"));
        System.out.println(isValid.and(contains3).test("972-52-4043142"));
        System.out.println(isValid.and(contains3).test("52-4043142"));
        System.out.println(isValid.and(contains3).test("052-4042142"));


    }

    public static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("05") && phoneNumber.length()==11;
    }

    public static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    public static int incrementByOne(int number) {
        return number + 1;
    }
}
