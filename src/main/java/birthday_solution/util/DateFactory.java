package birthday_solution.util;

import java.time.LocalDate;

public class DateFactory {
    public static LocalDate getLocalDate() {
        /*
        int day,month,year;
        day=(int)((Math.random()*28)+1);
        month=(int)((Math.random()*12)+1);
        year=(int)((Math.random()*50)+1960);

        return LocalDate.of(year,month,day);
         */

        return LocalDate.of(
                (int) ((Math.random() * 50) + 1960),
                (int) ((Math.random() * 12) + 1),
                (int) ((Math.random() * 28) + 1)
                );
    }
}
