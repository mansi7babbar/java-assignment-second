package com.knoldus;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeapYear {
    List<Integer> getleapYears(LocalDate startDate) {
        return IntStream.range(startDate.getYear(), LocalDate.now().plusYears(1).getYear())
                .filter(year -> LocalDate.of(year, startDate.getMonthValue(), startDate.getDayOfMonth()).isLeapYear())
                .boxed().collect(Collectors.toList());
    }
}
