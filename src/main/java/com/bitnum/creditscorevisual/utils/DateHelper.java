package com.bitnum.creditscorevisual.utils;

import com.bitnum.creditscorevisual.utils.excel.ImportExcel;
import org.apache.poi.ss.usermodel.Row;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2020/2/6.
 */
public class DateHelper {
    /**
     *  获取两个时间直接的天数
     * @param startDate
     * @param endDate
     * @return
     */
    public static int daysBetween(Date startDate, Date endDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            startDate = sdf.parse(sdf.format(startDate));

            endDate = sdf.parse(sdf.format(endDate));

            Calendar cal = Calendar.getInstance();

            cal.setTime(startDate);

            long time1 = cal.getTimeInMillis();

            cal.setTime(endDate);

            long time2 = cal.getTimeInMillis();

            long between_days = (time2 - time1) / (1000 * 3600 * 24);

            return Integer.parseInt(String.valueOf(between_days));
        }catch (ParseException p){
            return 0;
        }
    }

    /**
     * 给时间添加几个小时
     * @param date
     * @param hour
     * @return
     */
    public static Date addDateMinut(Date date, int hour){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hour);// 24小时制
        date = cal.getTime();
        cal = null;
        return date;
    }

    /**
     * 给时间加或减几天
     * @param days
     * @return
     */
    public static Date betweenNewDate(Date date,int days){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        Date startDate = calendar.getTime();
        return startDate;
    }

    public static Date stringToDate(String str){
        try{
            if(str.length()==0||str.equals("")){
                return null;
            }
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");//注意月份是MM
            Date date = simpleDateFormat.parse(str);
            return date;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static Date stringToDate2(String str){
        try{

            if(str.length()==0||str.equals("")){
                return null;
            }
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");//注意月份是MM
            Date date = simpleDateFormat.parse(str);
            return date;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) throws Throwable {


       System.out.println(stringToDate("10/17/2018"));
    }
}
