package time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time01 {

	public static void main(String[] args) {
		Date date1 = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.out.println(date1.toString());
		System.out.println(sdf.format(date1));
	}
}
