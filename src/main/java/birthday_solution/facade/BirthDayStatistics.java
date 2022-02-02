package birthday_solution.facade;

import birthday_solution.beans.Person;

import java.util.HashMap;
import java.util.Map;

public class BirthDayStatistics {
    public static int countMembers() {
        return BirthdaySystemReminder.getPeople().size();
    }

    public static int getHappyMonth() {
        Map<Integer, Integer> events = getEvents();
        int month = 0;
        int sum = 0;
        for (Map.Entry<Integer, Integer> item : events.entrySet()) {
            if (item.getValue() > sum) {
                sum = item.getValue();
                month = item.getKey();
            }
        }
        return month;
    }

    public static int getsadlyMonth() {
        Map<Integer, Integer> events = getEvents();
        int month = 0;
        int sum = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> item : events.entrySet()) {
            if (item.getValue() < sum) {
                sum = item.getValue();
                month = item.getKey();
            }
        }
        return month;
    }

    public static Map<Integer, Integer> getEvents() {
        Map<Integer, Integer> returnMap = new HashMap<>();
        int[] months = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Person item : BirthdaySystemReminder.getPeople()) {
            /*
            int month = item.getBirthday().getMonthValue();
            int size = returnMap.get(month);
            size++;
            returnMap.put(month,size);
            */
            months[item.getBirthday().getMonthValue() - 1]++;
        }

        for (int counter = 0; counter < months.length; counter++) {
            returnMap.put(counter + 1, months[counter]);
        }
        return returnMap;
    }
}
