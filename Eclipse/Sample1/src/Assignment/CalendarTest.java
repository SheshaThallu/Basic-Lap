package Assignment;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		/* set the 1st date of ongoing month */
		cal.set(2022, 6, 1);
		Calendar cal1 = Calendar.getInstance();
		/* set the last date of ongoing month */
		cal1.set(2022, 6, cal1.getMaximum(Calendar.DAY_OF_MONTH));
		int workingDays = 0;
		/* run the while loop until the months are same */
		while (!cal.after(cal1)) {
		      if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY
		           && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
		                System.out.println("Check >> "+ cal.getTime());
		                workingDays++;
		      }
		      cal.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(workingDays);
	}
}
