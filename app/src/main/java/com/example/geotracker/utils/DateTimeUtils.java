package com.example.geotracker.utils;

import android.support.annotation.NonNull;

import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeUtils {
    public static final long INVALID_CONVERSION_MILLIS = Long.MIN_VALUE;

    public static long isoUTCDateTimeStringToMillis(@NonNull String iso8601UTCDateTimeString) {
        long result = INVALID_CONVERSION_MILLIS;
        try {
            result = ISODateTimeFormat.dateTime()
                    .parseDateTime(iso8601UTCDateTimeString)
                    .withZone(DateTimeZone.UTC)
                    .getMillis();
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return result;
    }

    @NonNull
    public static String utcMillisToDateTimeIsoString(long millis) {
        return ISODateTimeFormat
                .dateTime()
                .withZone(DateTimeZone.UTC)
                .print(millis);
    }
}
