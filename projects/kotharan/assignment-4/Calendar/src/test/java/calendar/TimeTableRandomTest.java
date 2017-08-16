package calendar;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
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
				 Appt appt = null;

				 TimeTable t=new TimeTable();
				 LinkedList<Appt> appts = new LinkedList<Appt>();
				 for (int i = 0; i < NUM_TESTS; i++) {
					 int startHour = ValuesGenerator.RandInt(random);
					 int startMinute = ValuesGenerator.RandInt(random);
					 int startDay = ValuesGenerator.RandInt(random);
					 int startMonth = ValuesGenerator.RandInt(random);
					 int startYear = ValuesGenerator.RandInt(random);
					 String title = "Birthday Party";
					 String description = "This is my birthday party.";
					 //Construct a new Appointment object with the initial data

					 appt = new Appt(startHour,
							 startMinute,
							 startDay,
							 startMonth,
							 startYear,
							 title,
							 description);

					 appts.add(appt);
					 c.addAppt(appt);
					 t.deleteAppt(appts,appt);
				 }

				 GregorianCalendar firstDay = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 0, 2017), ValuesGenerator.getRandomIntBetween(random, 0, 31),ValuesGenerator. getRandomIntBetween(random, 0, 12));
				 GregorianCalendar lastDay = new GregorianCalendar(ValuesGenerator.getRandomIntBetween(random, 0, 2017),ValuesGenerator. getRandomIntBetween(random, 0, 31),ValuesGenerator. getRandomIntBetween(random, 0, 12));

				 try {

					 t.getApptRange(appts, firstDay, lastDay);
				 }catch(DateOutOfRangeException e){}
				 	if(ValuesGenerator.getBoolean(.40f,random)) appts = null;
				 	if(ValuesGenerator.getBoolean(.40f,random)) appt = null;
				 	t.deleteAppt(appts,appt);
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }
		 }catch(NullPointerException e){

		 }

		 System.out.println("Done testing...");
/*
		 for (int i = 0; i < NUM_TESTS; i++) {
			 LinkedList<Appt> appts = new LinkedList<Appt>();
			 appts.add(appt);
			 GregorianCalendar today = new GregorianCalendar(getRandomIntBetween(random, 0, 2017), getRandomIntBetween(random, 0, 31), getRandomIntBetween(random, 0, 12));
			 GregorianCalendar firstDay = new GregorianCalendar(getRandomIntBetween(random, 0, 2017), getRandomIntBetween(random, 0, 31), getRandomIntBetween(random, 0, 12));
			 ;
			 GregorianCalendar lastDay = new GregorianCalendar(getRandomIntBetween(random, 0, 2017), getRandomIntBetween(random, 0, 31), getRandomIntBetween(random, 0, 12));
			 ;
			 try {
				 t.getApptRange(appts, firstDay, lastDay);
			 } catch (NullPointerException e) {
				 System.out.println("--------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< *There is a bug* >>>>>>>>>>>>>>>>>>>>>>>>");

			 }*/
		 }
	 }


	

