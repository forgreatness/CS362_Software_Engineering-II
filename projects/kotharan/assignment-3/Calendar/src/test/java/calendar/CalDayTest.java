package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	@Test
	public void test01() throws Throwable {
		CalDay ab = new CalDay();
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);

	}

	@Test
	public void test02() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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
		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
	}

	@Test
	public void test03() throws Throwable {
		int startHour = 1;
		int startMinute = 80;
		int startDay = 0;
		int startMonth = 5;
		int startYear = 2012;
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
		startHour = 12;
		startMinute = 60;
		startDay = 7;
		startMonth = 8;
		startYear = 2012;
		title = "Birthday Party";
		description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt_2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt_2);
	}

	@Test
	public void test04() throws Throwable {
		int startHour = 1;
		int startMinute = 1;
		int startDay = 1;
		int startMonth = 6;
		int startYear = 2017;
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
		startHour = 11;
		startMinute = 30;
		startDay = 7;
		startMonth = 8;
		startYear = 2017;
		title = "Birthday Party";
		description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt_2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt_2);
		c.isValid();
		c.getDay();
		c.getMonth();
		c.getYear();
		c.toString();
		c.iterator();

	}

	@Test
	public void test05() throws Throwable {
		int startHour = 1;
		int startMinute = 1;
		int startDay = 1;
		int startMonth = 6;
		int startYear = 2017;
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


		startHour = 110;
		startMinute = 30;
		startDay = 7;
		startMonth = 8;
		startYear = 2017;
		title = "Birthday Party";
		description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt_2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertFalse(appt_2.getValid());



		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt_2);
		c.isValid();
		c.getDay();
		c.getMonth();
		c.getYear();
		c.toString();
		c.iterator();

//appt.iterator();
assertNotNull(c.iterator());

	}

	@Test
	public void test06() throws Throwable {
		int startHour = 70;
		int startMinute =82 ;
		int startDay = 1;
		int startMonth = 6;
		int startYear = 2017;
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


		startHour = 11;
		startMinute = 30;
		startDay = 7;
		startMonth = 8;
		startYear = 2017;
		title = "Birthday Party";
		description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt_2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);





		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);

		c.addAppt(appt_2);
		c.isValid();
		c.getDay();
		c.getMonth();
		c.getYear();
		c.toString();
		c.iterator();

//appt.iterator();
		c.iterator();
		assertNotNull(c.iterator());

		CalDay c1 = new CalDay();
		assertNull(c1.iterator());

	}

	@Test
	public void test07() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
	}

	@Test
	public void test08() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getMonth();
		assertEquals(3,c.getMonth());
	}

	@Test
	public void test09() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());
	}
	@Test
	public void test10() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(13,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		Appt appt2 = new Appt(13,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());


		CalDay c2 = new CalDay();

		assertEquals(0,c2.getYear());

		assertNotNull(c2.toString());
		c2.toString();
		Appt baap = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		c.addAppt(baap);
		assertNotNull(appt.getStartHour());


	}

	@Test
	public void test011() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());

		assertNotNull(c.getAppts().add(appt));
	}

	@Test
	public void test012() throws Throwable {
		int startHour = 11;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
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

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(2, 3, 4);
		CalDay c = new CalDay(today);
		c.addAppt(appt);
		c.addAppt(appt2);

		assertEquals(1,c.getSizeAppts());
		c.getDay();
		assertEquals(3,c.getDay());

		c.getYear();
		assertEquals(2,c.getYear());


		assertNotNull(c.toString());

		assertNotNull(c.getAppts().add(appt));
	//CalDay:c.setDay(2);
	}

	@Test
	public void test013() throws Throwable {
		Appt appt_1 = new Appt(1, 1, 5, 5, 2017,
				"Appt_1",
				"");

		Appt appt_2 = new Appt(5, 14, 5, 5, 2017,
				"Appt_2",
				"");

		Appt appt_3 = new Appt(1, 25, 5, 5, 2017,
				"Appt_3",
				"");

		Appt appt_4 = new Appt(1, 25, 5, 5, 2017,
				"Appt_3",
				"");

		int [] arr = {1,2,3,4,5,6,7,8,9,0};
		appt_1.setRecurrence(arr, 0, 0, 0);
		appt_2.setRecurrence(arr, 1, 10, 20);
		appt_3.setRecurrence(arr, 3, 30, -1);

		GregorianCalendar today = new GregorianCalendar(2017, 5, 5);
		CalDay c = new CalDay(today);

		c.addAppt(appt_1);
		c.addAppt(appt_2);
		c.addAppt(appt_3);
		c.addAppt(appt_4);

		assertEquals(3, c.getSizeAppts());
	}

	@Test
	public void test014() throws Throwable {
		Appt appt_1 = new Appt(1, 1, 5, 5, 2017,
				"Appt_1",
				"1");

		Appt appt_2 = new Appt(1, 1, 5, 5, 2017,
				"Appt_2",
				"2");

		Appt appt_3 = new Appt(3, 50, 5, 5, 2017,
				"Appt_3",
				"3");

		Appt appt_4 = new Appt(2, 25, 5, 5, 2017,
				"Appt_4",
				"4");

		//int [] arr = {1,2,3,4,5,6,7,8,9,0};
		//appt_1.setRecurrence(arr, 0, 0, 0);
		//appt_2.setRecurrence(arr, 1, 10, 20);
		//appt_3.setRecurrence(arr, 3, 30, -1);

		GregorianCalendar today = new GregorianCalendar(2017, 5, 5);
		CalDay c = new CalDay(today);

		c.addAppt(appt_1);
		c.addAppt(appt_2);
		c.addAppt(appt_3);
		c.addAppt(appt_4);

		assertEquals(3, c.getSizeAppts());
		LinkedList<Appt> appt0 =  c.getAppts();
		assertEquals(appt_1.getDescription(), appt0.get(0).getDescription());
		assertEquals(appt_2.getDescription(), appt0.get(1).getDescription());
		assertEquals(appt_3.getDescription(), appt0.get(3).getDescription());
		assertEquals(appt_4.getDescription(), appt0.get(2).getDescription());
	}
	//add more unit tests as you needed
	//Create a linked list of appts to be used

}
