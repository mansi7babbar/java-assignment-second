package com.knoldus;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AppDriver {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        LocalDate dob = LocalDate.of(1998, 5, 7);
        System.out.println(dayOfWeek.getDayOfWeek(dob));

        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.getleapYears());

        LifeSpan lifeSpan = new LifeSpan();
        LocalDate birthDate = LocalDate.of(1998, 5, 7);
        LocalDate deathDate = LocalDate.of(2020, 3, 4);
        System.out.println(lifeSpan.getLifeSpan(birthDate, deathDate));

        StudentQueries studentQueries = new StudentQueries();
        Student mansi = new Student(1, "Mansi", 21, new Address("Rohini", Optional.of("Delhi")));
        Student ayush = new Student(2, "Ayush", 24, new Address("Delhi", Optional.empty()));
        Student ruchika = new Student(3, "Ruchika", 28, new Address("Gzb", Optional.of("UP")));
        Student minnie = new Student(2, "Minnie", 18, new Address("Chennai", Optional.empty()));
        List<Student> students = Arrays.asList(mansi, ayush, ruchika, minnie);
        System.out.println(studentQueries.getStudentsWithSecondaryAddress(students));
        System.out.println(studentQueries.getStudentsWithSecondaryAddressAndStartingWithM(students));

        TimeZone timeZone = new TimeZone();
        String zoneId = "Australia/Sydney";
        System.out.println(timeZone.getTime(zoneId));

        WordCount wordCount = new WordCount();
        String fileName = "./src/main/resources/intro.txt";
        System.out.println(wordCount.getWordCount(fileName));
    }
}
