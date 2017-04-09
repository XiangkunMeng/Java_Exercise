package java_lib.CalendarDemo;

import java.util.Calendar;

/**
 * Created by mxk94 on 2017/4/6.
 */
public class CalendarDemo {
    static String[] months = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Data: " + months[cal.get(Calendar.MONTH)] + "." + cal.get(Calendar.DATE)+ " " + cal.get(Calendar.YEAR));
        System.out.println("Current Time: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

        cal.set(Calendar.YEAR,2020);
        System.out.println("After Changed: ");
        System.out.println("Current Data: " + months[cal.get(Calendar.MONTH)] + "." + cal.get(Calendar.DATE)+ " " + cal.get(Calendar.YEAR));
        System.out.println("Current Time: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }
}
