package calendar;


import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Random;
import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	@Test
	public void radnomtest()  throws Throwable  {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		System.out.println("Start testing...");

		try{
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
				//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				GregorianCalendar today = new GregorianCalendar(ValuesGenerator.RandInt(random), ValuesGenerator.RandInt(random), ValuesGenerator.RandInt(random));
				CalDay c = new CalDay(today);
				for (int i = 0; i < NUM_TESTS; i++) {
					int startHour = ValuesGenerator.RandInt(random);
					int startMinute = ValuesGenerator.RandInt(random);
					int startDay = ValuesGenerator.RandInt(random);
					;
					int startMonth = ValuesGenerator.RandInt(random);
					;
					int startYear = ValuesGenerator.RandInt(random);
					String title = "Birthday Party";
					String description = "This is my birthday party.";
					//Construct a new Appointment object with the initial data
					Appt appt = new Appt(startHour,
							startMinute,
							startDay,
							startMonth,
							startYear,
							title,
							description);


					c.addAppt(appt);
				}
				elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				if((iteration%10000)==0 && iteration!=0 )
					System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			}
		}catch(NullPointerException e){

		}

		System.out.println("Done testing...");
	}


	
}
