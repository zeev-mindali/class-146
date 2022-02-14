import functional_programing_in_action.beans.Person;
import functional_programing_in_action.beans.PersonDTO;
import functional_programing_in_action.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tester3 {
    public static void main(String[] args) throws IOException {
//        //DTO -> Data To Object
//        Function<Person, PersonDTO> personDTOlist = person->
//                new PersonDTO(person.getFirstName(), person.getGender(), person.getAge());
//
//        List<PersonDTO> shortList = MockData.getPeople().stream()
//                .filter(person->person.getAge()>20)
//                .filter(person -> person.getAge()<40)
//                .map(personDTOlist)
//                .collect(Collectors.toList());
//
//        shortList.forEach(System.out::println);

        List<List<String>> couples = List.of(
                List.of("Zeev","Amital"),
                List.of("Lea","kiril"),
                List.of("Tal","Alex"),
                List.of("Golan","Liz"),
                List.of("Shachar","Lior")
        );

        System.out.println(couples);

        List<String> flatCouples = couples.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatCouples);
    }
}
