package com.knoldus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    DateTimeFormatter getTime (String timeZone){
        ZonedDateTime timeZoneCurrentTime = ZonedDateTime.now(ZoneId.of(timeZone));
        return DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }
}
