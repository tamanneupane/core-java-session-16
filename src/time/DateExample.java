package time;

import accessmodifier.Student;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date(2023 - 1900, 11, 4);
//        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder().
        System.out.println(date);

        System.out.println(date.getYear() + 1900);
        Student student = new Student();
        student.address = "ktm";
    }

    public static int getYear(Date date) {
        return date.getYear();
    }
}
