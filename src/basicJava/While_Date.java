package basicJava;

import java.util.Calendar;
import java.util.Date;

public class While_Date {

	public static void main(String[] args) throws InterruptedException {
		
		// Trevor Page
		// Control structure video-4 

		Date today = new Date();
		System.out.println(today);

		Calendar cal = Calendar.getInstance();
		cal.set(2018, 8, 13, 17, 49, 0);

		while (today.before(cal.getTime())) // this will do on and on until defined time
		{
			System.out.println("Waiting");
			today = new Date();
			Thread.sleep(1000);
			System.out.println(today);
		}
		System.out.println("Date / Time arrived");
	}

}
