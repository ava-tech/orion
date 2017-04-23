package com.core.chapter7;

import java.util.Calendar;

public class DateCheck {

    public static void main(String args[]){

        Calendar c = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTime());
    }
}
