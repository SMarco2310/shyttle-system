package com.ashesi.shuttle.util;
import java.time.DayOfWeek;
import java.time.LocalDate;
public abstract  class utilClass {
    public static LocalDate getNextFriday() {
        LocalDate today = LocalDate.now();
        LocalDate nextFriday = today.with(DayOfWeek.FRIDAY);
        if (!nextFriday.isAfter(today)) {
            nextFriday = nextFriday.plusWeeks(1);
        }
        return nextFriday;
    }
}
