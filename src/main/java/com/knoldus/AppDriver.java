package com.knoldus;

import com.knoldus.student.Address;
import com.knoldus.student.Student;
import com.knoldus.student.StudentQueries;
import com.knoldus.user.User;
import com.knoldus.user.UserCRUDDriver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AppDriver {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        LocalDate dob = LocalDate.of(1998, 5, 7);
        System.out.println(dayOfWeek.getDayOfWeek(dob));

        LeapYear leapYear = new LeapYear();
        LocalDate startDate = LocalDate.of(1950, 1, 26);
        System.out.println(leapYear.getleapYears(startDate));

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
        System.out.println(timeZone.getTimeFromTimeZone(zoneId));

        UserCRUDDriver userCRUDDriver = new UserCRUDDriver();
        User ross = new User(1, "Ross", "Delhi", 18);
        User chandler = new User(2, "Chandler", "Chennai", 24);
        User phoebe = new User(3, "Phoebe", "Goa", 22);
        User monica = new User(4, "Monica", "Pune", 30);
        List<User> users = new ArrayList<>(Arrays.asList(ross, chandler, phoebe, monica));
        userCRUDDriver.createUser(users).thenAccept(System.out::println);
        userCRUDDriver.deleteUser(users).thenAccept(System.out::println);
        userCRUDDriver.retrieveUser(users).thenAccept(System.out::println);
        userCRUDDriver.updateUser(users).thenAccept(System.out::println);

        WordCount wordCount = new WordCount();
        String fileName = "./src/main/resources/intro.txt";
        System.out.println(wordCount.getWordCount(fileName));
    }
}
