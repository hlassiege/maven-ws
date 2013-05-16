package com.developpez.hugo.ws.adapters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter
{
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    private static final ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat(DATE_FORMAT);
        }
    };

    public static Date unmarshal(String value) {
        if (value == null){
            return null;
        }
        SimpleDateFormat sf = dateFormatter.get();
        try {
            return sf.parse(value);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String marshal(final Date value) {
        if (value == null) {
            return null;
        }
        SimpleDateFormat sf = dateFormatter.get();
        return sf.format(value);
    }


}
