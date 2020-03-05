package com.knoldus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    String getTimeFromTimeZone(String timeZone) {
        ZonedDateTime timeZoneCurrentTime = ZonedDateTime.now(ZoneId.of(timeZone));
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        return timeZoneCurrentTime.format(timeFormat);
    }
}
