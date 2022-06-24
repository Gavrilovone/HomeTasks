package HomeTaskLesson29;

import java.time.*;
import java.time.format.*;

public class TimeHome {

    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
    

    public void smena(LocalDateTime ld1, LocalDateTime ld2, Period p, Duration d) {
        while (ld1.isBefore(ld2)) {
            System.out.print(" Работаем с: " + ld1.format(d1));
                ld1 = ld1.plus(p);
                System.out.println(" До: " + ld1.format(d1));
                System.out.print(" Отдыхаем с : " + ld1.format(d2));
                ld1 = ld1.plus(d);
                System.out.println(" До: " + ld1.format(d2));
                
        }
    }
    
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2022, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        TimeHome t = new TimeHome();
        t.smena(ldt1, ldt2, p, d);
    }
}

/**
 * output:
 *          Работаем с: 2022, января-01 !! 09:00 До: 2022, февраля-03 !! 09:00
            Отдыхаем с : 09:00, 03/февр./22 До: 07:00, 03/февр./22
            Работаем с: 2022, февраля-03 !! 07:00 До: 2022, марта-05 !! 07:00
            Отдыхаем с : 07:00, 05/мар./22 До: 05:00, 06/мар./22
            Работаем с: 2022, марта-06 !! 05:00 До: 2022, апреля-08 !! 05:00
            Отдыхаем с : 05:00, 08/апр./22 До: 03:00, 08/апр./22
            Работаем с: 2022, апреля-08 !! 03:00 До: 2022, мая-10 !! 03:00
            Отдыхаем с : 03:00, 10/мая/22 До: 01:00, 11/мая/22
            Работаем с: 2022, мая-11 !! 01:00 До: 2022, июня-13 !! 01:00
            Отдыхаем с : 01:00, 13/июн./22 До: 11:00, 13/июн./22
            Работаем с: 2022, июня-13 !! 11:00 До: 2022, июля-15 !! 11:00
            Отдыхаем с : 11:00, 15/июл./22 До: 09:00, 15/июл./22
            Работаем с: 2022, июля-15 !! 09:00 До: 2022, августа-17 !! 09:00
            Отдыхаем с : 09:00, 17/авг./22 До: 07:00, 18/авг./22
            Работаем с: 2022, августа-18 !! 07:00 До: 2022, сентября-20 !! 07:00
            Отдыхаем с : 07:00, 20/сент./22 До: 05:00, 20/сент./22
            Работаем с: 2022, сентября-20 !! 05:00 До: 2022, октября-22 !! 05:00
            Отдыхаем с : 05:00, 22/окт./22 До: 03:00, 23/окт./22
            Работаем с: 2022, октября-23 !! 03:00 До: 2022, ноября-25 !! 03:00
            Отдыхаем с : 03:00, 25/нояб./22 До: 01:00, 25/нояб./22
 */
