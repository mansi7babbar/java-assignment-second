package com.knoldus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYear {
    List<Integer> getleapYears() {
        return IntStream.range(1950, LocalDate.now().plusYears(1).getYear())
                .filter(year -> LocalDate.of(year, 1, 26).isLeapYear())
                .boxed().collect(Collectors.toList());
    }
}
