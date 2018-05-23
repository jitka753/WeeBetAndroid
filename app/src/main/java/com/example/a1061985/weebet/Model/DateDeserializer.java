package com.example.a1061985.weebet.Model;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
        String rawDate = element.getAsString();
        String[] dateParts = rawDate.split("T");
        String date = dateParts[0] + " " + dateParts[1];
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            Date res = formatter.parse(date);
            return res;
        } catch (ParseException e) {

            return null;
        }
    }
}