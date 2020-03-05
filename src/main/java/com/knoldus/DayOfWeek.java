package com.knoldus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DayOfWeek {
    List<String> getDayOfWeek(LocalDate dob) {
        return IntStream.range(dob.getYear(), LocalDate.now().getYear())
                .mapToObj(year -> LocalDate.of(year, dob.getMonth(), dob.getDayOfMonth()).getDayOfWeek().name())
                .collect(Collectors.toList());
    }
}
