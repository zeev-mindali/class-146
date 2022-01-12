package Collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Tester {
    public static void main(String[] args) {
        Map<Integer,Person> students = new HashMap<>();
        Person p1 = new Person("Zeev",35_000,"052-404-3142");
        Person p2 = new Person("Omer",60_000,"052-543-3828");
        Person p3 = new Person("Golan",55_555,"050-548-3483");


        students.put(54353435,p1);
        students.put(67964545,p2);
        students.put(34534365,p3);
        //students.put(34534365,p1);


        Person pTest=students.get(34534365);
        System.out.println(pTest);

        System.out.println("we have zeev?"+(students.get(54353435)==null?"not exists":"exists"));

        for(Map.Entry<Integer,Person> item:students.entrySet()){
            System.out.println(item.getKey());
            System.out.println("==============");
            System.out.println(item.getValue());
            System.out.println();
        }

        //create vector collection
        Vector<Person> normalStudents = new Vector<>();
        Vector<Person> failedStudents = new Vector<>();
        Vector<Person> talentStudents = new Vector<>();
        //add instance to a collection
        talentStudents.add(p3);

        //create multimap collection (collection of collections)
        TreeMap<String,Vector<Person>> myStudents = new TreeMap<>();

        myStudents.put("normal",normalStudents);
        myStudents.put("failed",failedStudents);
        myStudents.put("talent",talentStudents);

        //create a new vector from multi map, that will hold only talented students
        Vector<Person> myTalent = myStudents.get("talent");
    }
}
