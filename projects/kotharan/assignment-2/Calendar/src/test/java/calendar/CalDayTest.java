package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


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


	}

//add more unit tests as you needed	

