package arrays;

import java.util.Arrays;

public class ForEach_Example {
    public static void main(String[] args) {
        String names[] = {"zeev","Omer","Saar","Tal","Yoav","Elad","Mark","Chris","Amiel (si)","Aviv","Geri","Omer","Lea","Saar"};

        //Geri yesterday
//        for (int index=0;index< names.length;index++){
//            System.out.println(names[index]);
//        }

        //Geri today (Junior)
//        for (String item:names){
//            System.out.println(item);
//        }

        //Gery tomorrow (Senior) - functional programming
        Arrays.stream(names).forEach(System.out::println);
    }
}
