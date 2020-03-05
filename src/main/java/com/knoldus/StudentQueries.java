package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class StudentQueries {
    List<Student> getStudentsWithSecondaryAddress(List<Student> students) {
        return students.stream().filter(student -> !student.address.secondaryAddress.isPresent()).collect(Collectors.toList());
    }

    List<Student> getStudentsWithSecondaryAddressAndStartingWithM(List<Student> students) {
        return students.stream().filter(student -> student.name.startsWith("M") && !student.address.secondaryAddress.isPresent()).collect(Collectors.toList());
    }

}
