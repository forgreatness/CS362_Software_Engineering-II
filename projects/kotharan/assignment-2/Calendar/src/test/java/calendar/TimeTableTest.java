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
    }

//add more unit tests as you needed

