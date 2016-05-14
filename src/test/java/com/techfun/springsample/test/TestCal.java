package com.techfun.springsample.test;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author luzhengfu
 */

public class TestCal {

    @Test
    public void testCalendar(){
        Calendar cal = Calendar.getInstance();
        System.out.println("-------------" + cal.get(Calendar.YEAR) + "," + cal.get(Calendar.MONTH) + "," + cal.get(Calendar.DATE) + "," + cal.get(Calendar.HOUR) + "," + cal.get(Calendar.MINUTE) + "," + cal.get(Calendar.SECOND));
        cal.add(Calendar.WEEK_OF_YEAR, 1);
        System.out.println("-------------" + cal.get(Calendar.YEAR) + "," + cal.get(Calendar.MONTH) + "," + cal.get(Calendar.DATE) + "," + cal.get(Calendar.HOUR) + "," + cal.get(Calendar.MINUTE) + "," + cal.get(Calendar.SECOND));

    }

    @Test
    public  void test11(){
        System.out.println(new DateTime(new Date()).toString("yyyy-MM-dd HH:mm:ss"));
    }

}
