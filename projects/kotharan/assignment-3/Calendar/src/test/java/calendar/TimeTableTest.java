package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test01()  throws Throwable  {
		TimeTable t=new TimeTable();


		//create linked list of Appt type
		//create Appt objects
		//add the object to the linked list
		//create first day and last day of type GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		int startHour=15;
		int startMinute=30;
		int startDay=11;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";

		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);

		//Set default recurring information
		int[] recurringDays =  new int[1];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);


		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
		try {
			t.getApptRange(appts, firstDay, lastDay);
		}
		catch( NullPointerException e)
		{
			System.out.println("--------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< *There is a bug* >>>>>>>>>>>>>>>>>>>>>>>>");

		}

	}
	@Test
	public void test02()  throws Throwable  {
		TimeTable t=new TimeTable();

		int startHour=16;
		int startMinute=31;
		int startDay=12;
		int startMonth=5;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";


		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);


		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);
		GregorianCalendar today = new GregorianCalendar(2, 4, 5);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
		try {
			t.getApptRange(appts, lastDay,firstDay);
		}
		catch( DateOutOfRangeException e)
		{
			System.out.println("--------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< *There is a bug* >>>>>>>>>>>>>>>>>>>>>>>>");

		}



	}
	@Test
	public void test03()  throws Throwable {

		TimeTable t = new TimeTable();

		int startHour = 17;
		int startMinute = 70;
		int startDay = 12;
		int startMonth = 5;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";


		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);


		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);
		GregorianCalendar today = new GregorianCalendar(2, 4, 5);
		GregorianCalendar firstDay = new GregorianCalendar(2017, 12, 10);
		GregorianCalendar lastDay = new GregorianCalendar(2018, 12, 10);
		try {
			t.getApptRange(appts, lastDay, firstDay);
		} catch (DateOutOfRangeException e) {
			System.out.println("--------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< *There is a bug* >>>>>>>>>>>>>>>>>>>>>>>>");

		}

		t.deleteAppt(appts, appt);

		Appt appt_null = null;

		LinkedList<Appt> appts_null = null;

		t.deleteAppt(appts_null, appt);
		t.deleteAppt(appts, appt_null);
		t.deleteAppt(appts_null, appt_null);

	}
	@Test
	public void test04()  throws Throwable {

		TimeTable t = new TimeTable();

		int startHour = 17 ;
		int startMinute = 70;
		int startDay = 12;
		int startMonth = 5;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";


		Appt appt1 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
		startHour = 5 ;
		startMinute = 6;
		startDay = 17;
		startMonth = 7;
		startYear = 2018;
		title = "Birthday Party";
		description = "This is my birthday party.";


		Appt appt2 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);




		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt1);
		appts.add(appt2);
		GregorianCalendar today = new GregorianCalendar(2, 4, 5);
		GregorianCalendar firstDay = new GregorianCalendar(2017, 12, 10);
		GregorianCalendar lastDay = new GregorianCalendar(2018, 12, 10);

		try {
			t.getApptRange(appts, lastDay, firstDay);
		} catch (DateOutOfRangeException e) {
			System.out.println("--------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< *There is a bug* >>>>>>>>>>>>>>>>>>>>>>>>");

		}

		int [] pv = {1,0};
		t.permute(appts,pv);


	}

	@Test

	public void test05()  throws Throwable  {
		TimeTable t=new TimeTable();

		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		int startHour=15;
		int startMinute=30;
		int startDay=thisDay;  	//11
		int startMonth=thisMonth; 	//4
		int startYear=thisYear; 	//2017
		String title="Birthday Party";
		String description="This is my birthday party.";
		// Create a valid appointment!
		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);

		//Change the  default recurring information in the object appt using setRecurrence method in the Appt class
		int[] recurringDays =  new int[0];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);
		//get a list of appointments for one day that are occurred between today and tomorrow!
		GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
		//Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
		try {
			// Retrieves a range of appointments between two dates (i.e., today and tomorrow).
			t.getApptRange(appts, firstDay, lastDay);
		}
		catch( NullPointerException e)
		{

		}

	}
	@Test

	public void test06()  throws Throwable  {
		TimeTable t=new TimeTable();

		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		int startHour=15;
		int startMinute=30;
		int startDay=8;  	//11
		int startMonth=6; 	//4
		int startYear=2017; 	//2017
		String title="Birthday Party";
		String description="This is my birthday party.";
		// Create a valid appointment!
		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);

		//Change the  default recurring information in the object appt using setRecurrence method in the Appt class
		int[] recurringDays =  new int[0];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);
		//get a list of appointments for one day that are occurred between today and tomorrow!
		GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
		//Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
		try {
			// Retrieves a range of appointments between two dates (i.e., today and tomorrow).
			t.getApptRange(appts, firstDay, lastDay);
		//	assertNull(t.getApptRange(appts, lastDay, firstDay));
		}
		catch( NullPointerException e)
		{

		}

	}
	@Test

	public void test07()  throws Throwable  {
		TimeTable t=new TimeTable();

		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		int startHour=15;
		int startMinute=30;
		int startDay=8;  	//11
		int startMonth=6; 	//4
		int startYear=2017; 	//2017
		String title="Birthday Party";
		String description="This is my birthday party.";
		// Create a valid appointment!
		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);

		//Change the  default recurring information in the object appt using setRecurrence method in the Appt class
		int[] recurringDays =  new int[0];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 1, 0);
		//get a list of appointments for one day that are occurred between today and tomorrow!
		GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
		//Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
		try {
			// Retrieves a range of appointments between two dates (i.e., today and tomorrow).
			t.getApptRange(appts, firstDay, lastDay);
			//	assertNull(t.getApptRange(appts, lastDay, firstDay));
		}
		catch( NullPointerException e)
		{

		}
		t.deleteAppt(appts,appt);
		assertNull(t.deleteAppt(appts,appt));
	}
	@Test

	public void test08()  throws Throwable  {
		TimeTable t=new TimeTable();

		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		int startHour=15;
		int startMinute=30;
		int startDay=8;  	//11
		int startMonth=6; 	//4
		int startYear=2017; 	//2017
		String title="Birthday Party";
		String description="This is my birthday party.";
		// Create a valid appointment!
		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);

		//Change the  default recurring information in the object appt using setRecurrence method in the Appt class
		int[] recurringDays =  new int[0];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 1, 0);
		//get a list of appointments for one day that are occurred between today and tomorrow!
		GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
		//Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
		try {
			// Retrieves a range of appointments between two dates (i.e., today and tomorrow).
			t.getApptRange(appts, firstDay, lastDay);
			//	assertNull(t.getApptRange(appts, lastDay, firstDay));
		}
		catch( NullPointerException e)
		{

		}
		t.deleteAppt(appts,appt);
		assertNull(t.deleteAppt(appts,appt));
		t.deleteAppt(appts,appt);
		assertNotNull(appt.getValid());

	}

	@Test

	public void test09()  throws Throwable  {
		TimeTable t=new TimeTable();

		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		int startHour=15;
		int startMinute=30;
		int startDay=8;
		int startMonth=6;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		// Create a valid appointment!
		Appt appt = new Appt(startHour, startMinute , startDay , startMonth , startYear , title, description);
		/** Collection of all of the appointments for the calendar day */
		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(appt);

		//Change the  default recurring information in the object appt using setRecurrence method in the Appt class
		int[] recurringDays =  new int[0];
		appt.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 1, 0);
		//get a list of appointments for one day that are occurred between today and tomorrow!
		GregorianCalendar firstDay = new GregorianCalendar(thisYear,thisMonth,thisDay);
		//Create an identical object for the firstDay
		GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
		//Increase today day to 1
		lastDay.add(Calendar.DAY_OF_MONTH,1);
		try {
			// Retrieves a range of appointments between two dates (i.e., today and tomorrow).
			t.getApptRange(appts, firstDay, lastDay);
			//	assertNull(t.getApptRange(appts, lastDay, firstDay));
		}
		catch( NullPointerException e)
		{

		}


		assertEquals(null,t.deleteAppt(appts,appt));


	}


	@Test
	public void test010()  throws Throwable  {

		TimeTable t = new TimeTable();

		LinkedList<Appt> appts = new LinkedList<Appt>();
		appts.add(new Appt(13,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party."));


		assertTrue(t.deleteAppt(appts, null) == null);
		assertTrue(t.deleteAppt(null,
				new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
		assertTrue(t.deleteAppt(appts, new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
		assertTrue(t.deleteAppt(appts, new Appt(0, 0, 0, 0, 0, "", "")) == null);

	}

	@Test

	public void test11()  throws Throwable  {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(15, 20, 5, 3, 2017, "Birthday Party", "This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(10, 20, 5, 5, 2017, "Birthday Party", "This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		//GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
	GregorianCalendar lastday = (GregorianCalendar)today.clone();
		lastday.add(Calendar.DAY_OF_MONTH,20);

	LinkedList<CalDay> range = table.getApptRange(list,today,lastday);

		System.out.print(range);
	}
	@Test

	public void test12()  throws Throwable  {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(5,
				13,
				11,
				8,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		//GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
		GregorianCalendar lastday = (GregorianCalendar)today.clone();
		lastday.add(Calendar.DAY_OF_MONTH,2);

		LinkedList<CalDay> print = table.getApptRange(list,today,lastday);
		assertEquals(2, print.size());

		table.deleteAppt(list, appt);


	}
	@Test

	public void test13()  throws Throwable  {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(5,
				13,
				11,
				8,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		//GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
		GregorianCalendar lastday = (GregorianCalendar)today.clone();
		lastday.add(Calendar.DAY_OF_MONTH,2);

		try	{
			LinkedList<CalDay> print = table.getApptRange(list,today,lastday);
			assertEquals(2, print.size());

			list = table.deleteAppt(list,appt);
			assertEquals(0, list.size());
		}
		catch( NullPointerException e) {
		}
		}
	@Test

	public void test14()  throws Throwable  {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(0,
				0,
				0,
				0,
				0,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		//GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		GregorianCalendar firstDay = new GregorianCalendar(2017,12,10);
		GregorianCalendar lastDay = new GregorianCalendar(2018,12,10);
		GregorianCalendar lastday = (GregorianCalendar)today.clone();
		lastday.add(Calendar.DAY_OF_MONTH,2);

		try	{
			LinkedList<CalDay> print = table.getApptRange(list,today,lastday);
			assertEquals(2, print.size());

			list = table.deleteAppt(list,appt);
			assertEquals(0, list.size());
		}
		catch( NullPointerException e) {
		}
	}

//add more unit tests as you needed











	@Test
	public void test15() throws Throwable {
		TimeTable tt = new TimeTable();

		LinkedList<Appt> appts = new LinkedList<Appt>();

		Appt appt1 = new Appt(16,
				16,
				2,
				2,
				2017,
				"",
				"");

		appts.add(appt1);
		int[] recurringDays = new int[0];
		appt1.setRecurrence(recurringDays, Appt.RECUR_BY_MONTHLY, 0, 1);
		GregorianCalendar firstDay = new GregorianCalendar(2017, 5, 5);
		GregorianCalendar lastDay = new GregorianCalendar(2017, 5, 6);

		try {


			tt.getApptRange(appts, firstDay, lastDay);

			assertTrue(tt.deleteAppt(appts, null) == null);
			assertTrue(tt.deleteAppt(null,
					new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			assertTrue(tt.deleteAppt(appts, new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			assertTrue(tt.deleteAppt(appts, new Appt(0, 0, 0, 0, 0, "", "")) == null);
		} catch (NullPointerException e) {
		}

	}

	@Test
	public void test16() throws Throwable {
		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(8,
				30,
				15,
				7,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar lastday = (GregorianCalendar) today.clone();
		lastday.add(Calendar.DAY_OF_MONTH, 20);

		try {
			LinkedList<CalDay> range = table.getApptRange(list, today, lastday);
			System.out.print(range);
		} catch (NullPointerException e) {
		}
	}


	@Test
	public void test17() throws Throwable {
		LinkedList<Appt> appts = new LinkedList<Appt>();
		TimeTable table = new TimeTable();
		Appt appt1 = new Appt(16, 16, 2, 2, 2017,
				"",
				"");

		Appt appt2 = new Appt(15, 15, 4, 5, 2017,
				"",
				"");

		appts.add(appt1);
		appts.add(appt2);
		int[] pv = {1, 0};
		table.permute(appts, pv);


	}

	@Test
	public void test18() throws Throwable {
		TimeTable timetable = new TimeTable();
	}


	@Test
	public void test19()  throws Throwable  {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 5 , 3 , 0 , 2017 ,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 11 , 6 , 0 , 2017 ,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(5, 20 , 6 , 0 , 2017 ,
				"Appt_3",
				"");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);

		assertFalse(appt_1.getValid());
		assertFalse(appt_2.getValid());
		assertFalse(appt_3.getValid());
		//create first and last days
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 7);

		try    {
			timetable.getApptRange(ApptsList, first, last);
		} catch(DateOutOfRangeException e) {

		}


	}

	@Test
	public void test20()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {};
		appt_1.setRecurrence(arr, 1, 1, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());


		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try  {
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)  {

		//}
	}

	@Test
	public void test21()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {1,2};
		appt_1.setRecurrence(arr, 2, 2, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());


		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try  {
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)  {

		//}
	}
	@Test
	public void test22()  throws Throwable  {
		TimeTable timetable = new TimeTable();


		Appt appt_1 = new Appt(1,
				10 ,
				5 ,
				6 ,
				2017 ,
				"Appt_1",
				"");

		int [] arr = {1,2};
		appt_1.setRecurrence(arr, 3, 3, 10);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		assertTrue(appt_1.isRecurring());
		//GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar first = new GregorianCalendar(2017, 6, 5);
		GregorianCalendar last = new GregorianCalendar(2017, 6, 6);

		//try  {
		timetable.getApptRange(ApptsList, first, last);
		//} catch(NullPointerException e)  {

		//}
	}
	@Test
	public void test23() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 6, 7);

		try {
			timetable.getApptRange(ApptsList, last, first);
		} catch (DateOutOfRangeException e) {

		}
	}

	@Test
	public void test24() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");


		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 6, 7);

		try {
			timetable.getApptRange(ApptsList, last, first);
		} catch (DateOutOfRangeException e) {

		}

		}

	@Test
	public void test25() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7};
		appt_1.setRecurrence(arr, 2, 2, 100);
		appt_2.setRecurrence(arr, 1, 1, 100);
		appt_3.setRecurrence(arr, 3, 3, 100);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}

	}

	@Test
	public void test26() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7};
		appt_1.setRecurrence(arr, 2, 2, 100);
		appt_2.setRecurrence(arr, 1, 1, 100);
		appt_3.setRecurrence(arr, 3, 3, 100);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}

		try {
		LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_1);
		assertEquals(0, ApptsList_1.size());
		} catch (NullPointerException e) {

		}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}

	}

	@Test
	public void test27() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7};
		appt_1.setRecurrence(arr, 2, 2, 100);
		appt_2.setRecurrence(arr, 1, 1, 100);
		appt_3.setRecurrence(arr, 3, 3, 100);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}

		try {
			LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_2);
			assertEquals(2, ApptsList_1.size());
		} catch (NullPointerException e) {

		}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}

	}

	@Test
	public void test28() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		Appt appt_4 = new Appt(1, 25, 6, 0, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7};
		appt_1.setRecurrence(arr, 2, 2, 100);
		appt_2.setRecurrence(arr, 1, 1, 100);
		appt_3.setRecurrence(arr, 3, 3, 100);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2017, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}

		try {
			LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_4);
			assertEquals(2, ApptsList_1.size());
			assertNull(ApptsList_1);
			 ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_3);
			assertEquals(2, ApptsList_1.size());
			assertNotNull(timetable.deleteAppt(ApptsList ,appt_3));
		} catch (NullPointerException e) {

		}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}

	}


	@Test
	public void test29() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		Appt appt_4 = new Appt(1, 25, 6, 0, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7};
		appt_1.setRecurrence(arr, 2, 2, 1);
		appt_2.setRecurrence(arr, 1, 1, 0);
		appt_3.setRecurrence(arr, 3, 3, -1);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}

		try {
			LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_4);
			assertEquals(2, ApptsList_1.size());
			assertNull(ApptsList_1);
			ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_3);
			assertEquals(2, ApptsList_1.size());
			assertNotNull(timetable.deleteAppt(ApptsList ,appt_3));
		} catch (NullPointerException e) {

		}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}

	}

	@Test
	public void test31() throws Throwable {
		TimeTable timetable = new TimeTable();

		//Create a linked list of appts to be used
		Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
				"Appt_3",
				"");

		Appt appt_4 = new Appt(1, 25, 6, 0, 2017,
				"Appt_3",
				"");

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		appt_1.setRecurrence(arr, 2, 20, 1);
		appt_2.setRecurrence(arr, 1, 10, 20);
		appt_3.setRecurrence(arr, 3, 30, -1);

		LinkedList<Appt> ApptsList = new LinkedList<Appt>();
		ApptsList.add(appt_1);
		ApptsList.add(appt_2);
		ApptsList.add(appt_3);


		GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
		GregorianCalendar last = new GregorianCalendar(2018, 7, 7);

		try {
			LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
			assertEquals(0, t.size());
		} catch (NullPointerException e) {

		}

		try {
			LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList, appt_4);
			assertEquals(2, ApptsList_1.size());
			assertNull(ApptsList_1);
			ApptsList_1 = timetable.deleteAppt(ApptsList, appt_3);
			assertEquals(2, ApptsList_1.size());
			assertNotNull(timetable.deleteAppt(ApptsList, appt_3));
		} catch (NullPointerException e) {

		}
	}
		//LinkedList<Appt> Appts = new LinkedList<Appt>();
		//Appts.add(appt_1);
		//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
		//}
		@Test
		public void test30() throws Throwable {
			TimeTable timetable = new TimeTable();

			//Create a linked list of appts to be used
			Appt appt_1 = new Appt(1, 1, 3, 5, 2017,
					"Appt_1",
					"");

			Appt appt_2 = new Appt(5, 14, 8, 4, 2017,
					"Appt_2",
					"");

			Appt appt_3 = new Appt(1, 25, 6, 3, 2017,
					"Appt_3",
					"");

			Appt appt_4 = new Appt(1, 25, 6, 0, 2017,
					"Appt_3",
					"");

			int [] arr = {1,2,3,4,5,6,7,8,9,0};
			appt_1.setRecurrence(arr, 0, 0, 0);
			appt_2.setRecurrence(arr, 1, 10, 20);
			appt_3.setRecurrence(arr, 3, 30, -1);

			LinkedList<Appt> ApptsList = new LinkedList<Appt>();
			ApptsList.add(appt_1);
			ApptsList.add(appt_2);
			ApptsList.add(appt_3);


			GregorianCalendar first = new GregorianCalendar(2017, 6, 4);
			GregorianCalendar last = new GregorianCalendar(2018, 7, 7);

			try {
				LinkedList<CalDay> t = timetable.getApptRange(ApptsList, first, last);
				assertEquals(0, t.size());
			} catch (NullPointerException e) {

			}

			try {
				LinkedList<Appt> ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_4);
				assertEquals(2, ApptsList_1.size());
				assertNull(ApptsList_1);
				ApptsList_1 = timetable.deleteAppt(ApptsList ,appt_3);
				assertEquals(2, ApptsList_1.size());
				assertNotNull(timetable.deleteAppt(ApptsList ,appt_3));
			} catch (NullPointerException e) {

			}
			//LinkedList<Appt> Appts = new LinkedList<Appt>();
			//Appts.add(appt_1);
			//timetable.getApptRange(Apptslist,first,last)throws DateOutOfRangeException {
			//}

	}

}
