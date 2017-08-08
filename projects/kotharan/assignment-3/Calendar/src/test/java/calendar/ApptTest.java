package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

	@Test
	public void test01()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test02()  throws Throwable  {
		int startHour=-1;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(-1, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test03()  throws Throwable  {
		int startHour=25;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(25, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test04()  throws Throwable  {
		int startHour=1;
		int startMinute=-1;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(-1, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test05()  throws Throwable  {
		int startHour=1;
		int startMinute=61;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(61, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test06()  throws Throwable  {
		int startHour=1;
		int startMinute=60;
		int startDay=-1;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(-1, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertEquals(0,appt.getRecurNumber());
	}
	@Test
	public void test07()  throws Throwable  {
		int startHour=1;
		int startMinute=60;
		int startDay=32;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(32, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test08()  throws Throwable  {
		int startHour=1;
		int startMinute=60;
		int startDay=30;
		int startMonth=0;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(0, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}
	@Test
	public void test09()  throws Throwable  {
		int startHour=1;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		appt.setStartHour(1);
		appt.setStartMinute(1);
		appt.setStartDay(5);
		appt.setStartMonth(1);
		appt.setStartYear(2018);
		appt.setTitle(null);
		appt.setDescription(null);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(1, appt.getStartHour());
		assertEquals(1, appt.getStartMinute());
		assertEquals(5, appt.getStartDay());
		assertEquals(1, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());

		int [] hhhhhh = null;
		appt.setRecurrence(hhhhhh,0,0,0);

		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());

		assertEquals(0,appt.getRecurNumber());
		assertEquals(0,appt.getRecurBy());
		//assertTrue(appt.getRecurNumber()());
		assertEquals(0,appt.getRecurIncrement());

	}
	@Test
	public void test11()  throws Throwable  {
		int startHour=0;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		assertTrue(appt.getValid());
		assertEquals(0, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());



	}

	@Test
	public void test12()  throws Throwable  {
		int startHour=24;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}
	@Test
	public void test13()  throws Throwable  {
		int startHour=24;
		int startMinute=0;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(0, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}
	@Test
	public void test14()  throws Throwable  {
		int startHour=24;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}
	@Test
	public void test15()  throws Throwable  {
		int startHour=24;
		int startMinute=60;
		int startDay=1;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(1, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}
	@Test
	public void test16()  throws Throwable  {
		int startHour=24;
		int startMinute=60;
		int startDay=30;
		int startMonth=10;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);


		// assertions

		assertTrue(appt.getValid());
		assertEquals(24, appt.getStartHour());
		assertEquals(60, appt.getStartMinute());
		assertEquals(30, appt.getStartDay());
		assertEquals(10, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());


	}


	@Test
	public void test17()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

int [] recurDays=null;
int recurBy=10;
int recurIncrement=5;
int recurNumber=15;
		// assertions

		 appt.setRecurrence(recurDays,10,5,15);


	assertNotNull(appt.getRecurDays());

	Appt a;
	 appt.setStartHour(24);
	 if(appt.getValid())
	 {
	 	a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
	 	assertTrue(a.getValid());
	 }
	 }
	 public void test18()  throws Throwable  {
		int startHour=2;
		int startMinute=40;
		int startDay=11;
		int startMonth=5;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		Appt ab;
		appt.setStartHour(2);
		 if(appt.getValid())
		{
			ab=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(ab.getValid());

		}

	}

	@Test
	public void test19()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

		int [] recurDays=null;
		int recurBy=10;
		int recurIncrement=5;
		int recurNumber=15;
		// assertions

		appt.setRecurrence(recurDays,10,5,15);


		assertNotNull(appt.getRecurDays());
		assertEquals(10,appt.getRecurBy());
		assertEquals(5,appt.getRecurIncrement());
		assertEquals(15,appt.getRecurNumber());
		Appt a;
		appt.setStartHour(24);
		if(appt.getValid())
		{
			a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(a.getValid());
		}
	}
	@Test
	public void test20()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title=null;
		String description=null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				null,
				null);
		assertNull(appt.toString());

		int [] recurDays=null;
		int recurBy=10;
		int recurIncrement=5;
		int recurNumber=15;
		// assertions

		appt.setRecurrence(recurDays,10,5,15);


		assertNotNull(appt.getRecurDays());
		assertEquals(10,appt.getRecurBy());
		assertEquals(5,appt.getRecurIncrement());
		assertEquals(15,appt.getRecurNumber());
		Appt a;
		appt.setStartHour(24);
		if(appt.getValid())
		{
			a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
			assertTrue(a.getValid());
		}

		a=new Appt(appt.getStartHour(),40,11,5,2017,appt.getTitle(),appt.getDescription());
		assertTrue(a.getValid());

		System.out.println(a.toString());
	    assertEquals("\t5/11/2017 at 12:40pm ,, \n",a.toString());
	 }
	@Test
	public void test21()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 207;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");

appt.setStartHour(-3);
assertFalse(appt.getValid());


	}

	@Test
	public void test22()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");

		appt.setStartHour(-3);

		assertFalse(appt.getValid());

		appt.setStartMinute(-3);

		assertFalse(appt.getValid());

	}

	@Test
	public void test23()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartMinute(-3);
		assertFalse(appt.getValid());

	}

	@Test
	public void test24()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartDay(-3);
		assertFalse(appt.getValid());

	}

	@Test
	public void test25()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartMonth(0);
		assertFalse(appt.getValid());

	}

	@Test
	public void test26()  throws Throwable {
		int startHour = 3;
		int startMinute = 5;
		int startDay = 8;
		int startMonth = 5;
		int startYear = 0;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.setStartYear(1992);
		assertEquals(true,appt.getValid());

	}

	@Test
	public void test27()  throws Throwable {
		int startHour = 15;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 3:40pm ,, \n",appt.toString());

	}

	@Test
	public void test28()  throws Throwable {
		int startHour = 12;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 12:40pm ,, \n",appt.toString());

	}

	@Test
	public void test29()  throws Throwable {
		int startHour = 0;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 12:40am ,, \n",appt.toString());

	}

	@Test
	public void test30()  throws Throwable {
		int startHour = 2;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 2:40am ,, \n",appt.toString());

	}

	@Test
	public void test31()  throws Throwable {
		int startHour = 11;
		int startMinute = 40;
		int startDay = 5;
		int startMonth = 5;
		int startYear = 2017;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				"",
				"");
		appt.toString();
		assertEquals("\t5/5/2017 at 11:40am ,, \n",appt.toString());

	}
	@Test
	public void test32() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(2, appt.getRecurBy());
//add more unit tests as you needed
	}
	@Test
	public void test33() throws Throwable {

		int startHour = 24;
		int startMinute = 30;
		int startDay = 31;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(24,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.isRecurring();
		assertFalse(appt.isRecurring());

//add more unit tests as you needed
	}
}
