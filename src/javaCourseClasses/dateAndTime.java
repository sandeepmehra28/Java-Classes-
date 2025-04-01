package javaCourseClasses;

import java.time.*;

public class dateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);//present date update

        LocalTime thisTime = LocalTime.now();
        System.out.println("This time : " + thisTime);//present time update

        LocalDate someDay = LocalDate.of(2024, Month.SEPTEMBER, 10);
        System.out.println("Someday : " + someDay);//SET YOUR DATE AND UPDATE YOUR DATE-OF-MONTH


        LocalTime someTime = LocalTime.of(23, 53);
        System.out.println("Sometime : " + someTime);

    }
}
