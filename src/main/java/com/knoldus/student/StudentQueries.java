package com.knoldus.student;

import com.knoldus.student.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentQueries {
    public List<Student> getStudentsWithSecondaryAddress(List<Student> students) {
        return students.stream().filter(student -> !student.address.secondaryAddress.isPresent())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsWithSecondaryAddressAndStartingWithM(List<Student> students) {
        return students.stream().filter(student -> student.name.startsWith("M")
                && !student.address.secondaryAddress.isPresent())
                .collect(Collectors.toList());
    }

}
