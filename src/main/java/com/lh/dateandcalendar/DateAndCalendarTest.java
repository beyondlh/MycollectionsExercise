package com.lh.dateandcalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lh on 2016/10/31.
 */
public class DateAndCalendarTest {
    public static void main(String[] args) {
        //Date类对象表示当前日期和时间
        //划横线的为过时的方法 就是java不建议再使用的
        Date nowDate = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("当前时间:" + simpleDateFormat.format(nowDate) + "\n");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, 10, 1);


        Calendar targetCalendar = Calendar.getInstance();
        targetCalendar.set(2014, 10, 1);

        System.out.println("日期比较：" + (calendar.compareTo(targetCalendar)));

        System.out.println("当前年：" + (calendar.get(Calendar.YEAR)));
        System.out.println("当前月：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("当前日：" + (calendar.get(Calendar.DATE)));


//        DAY_OF_WEEK: 指一个星期中的某天
//        DAY_OF_WEEK_IN_MONTH: 指当前月中的第几个星期
        System.out.println("当前周第几天：" + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("当前日(月中的)：" + (calendar.get(Calendar.DAY_OF_MONTH)));
        System.out.println("当前日(年中的)：" + Calendar.getInstance().get(Calendar.DAY_OF_YEAR));
        System.out.println("当前第几周：" + (calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)));

        System.out.println("================================");
        System.out.println("当前时：" + Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        System.out.println("当前分：" + Calendar.getInstance().get(Calendar.MINUTE));
        System.out.println("当前秒：" + Calendar.getInstance().get(Calendar.SECOND));
        System.out.println("================================");

        System.out.println("================================");
        Calendar muBirthday = Calendar.getInstance();
        muBirthday.set(Calendar.YEAR, 1958);
        muBirthday.set(Calendar.MONTH, 10);
        muBirthday.set(Calendar.DAY_OF_MONTH, 7);

        DateFormat ddf = DateFormat.getDateInstance();
        System.out.println("我的生日是在一年中的第:" + muBirthday.get(Calendar.DAY_OF_YEAR) + "天");
        System.out.println("我的生日是:" + (ddf.format(new Date(muBirthday.getTimeInMillis()))));

        System.out.println("================================");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("2");
//        stringBuilder.toString();
        System.out.println(stringBuilder.getClass().getSimpleName());
        //转换成String
        System.out.println(stringBuilder.getClass().getSimpleName());
        System.out.println(stringBuilder.toString().getClass().getSimpleName());
    }
}
