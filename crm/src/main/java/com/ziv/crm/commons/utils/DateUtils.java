package com.ziv.crm.commons.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 对指定的date对象进行格式化：yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String formatDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    /**
     * 对指定的date对象进行格式化：yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    /**
     * 对指定的date对象进行格式化：HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String formatTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());
    }
}
