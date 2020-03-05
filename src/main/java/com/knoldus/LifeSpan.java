package com.knoldus;

import java.time.Duration;
import java.time.LocalDate;

public class LifeSpan {
        long getLifeSpan (LocalDate birthDate, LocalDate deathDate) {
        return Duration.between(birthDate.atStartOfDay(), deathDate.plusDays(1).atStartOfDay()).getSeconds();
    }
}
