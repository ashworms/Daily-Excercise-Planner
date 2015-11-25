package com.example.kevin.dailyexcerciseplanner;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kevin on 25/11/2015.
 */
public class Excercise {

    private String m_name;
    private int m_amount;
    private int m_set;
    private Calendar lastUpdatedDate;

    public Excercise(String name, int amount, int set){
        m_name = name;
        m_amount = amount;
        m_set = set;
        lastUpdatedDate = Calendar.getInstance();
        int day = lastUpdatedDate.get(Calendar.DAY_OF_MONTH);
    }
}
