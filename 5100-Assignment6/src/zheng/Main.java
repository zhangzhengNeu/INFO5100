package zheng;

import zheng.Student.NameComparator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            DrivingLicenseApplication.getDateOfBirthFromUser();
        } catch (DrivingLicenseApplication.ageException e) {
            System.out.println("Sorry, User is below age limit ");
            e.printStackTrace();
        }


        // creating a Calendar object
        Calendar c = Calendar.getInstance();
        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        c.set(Calendar.MONTH, 10);

        // set Date
        c.set(Calendar.DATE, 05);

        // set Year
        c.set(Calendar.YEAR, 2000);

        // creating a date object with specified time.
        Date date1 = c.getTime();


        // creating a Calendar object
        Calendar d = Calendar.getInstance();
        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        d.set(Calendar.MONTH, 1);

        // set Date
        d.set(Calendar.DATE, 8);

        // set Year
        d.set(Calendar.YEAR, 1986);

        // creating a date object with specified time.
        Date date2 = d.getTime();



        // creating a Calendar object
        Calendar e = Calendar.getInstance();
        // set Month
        // MONTH starts with 0 i.e. ( 0 - Jan)
        e.set(Calendar.MONTH, 11);

        // set Date
        e.set(Calendar.DATE, 6);

        // set Year
        e.set(Calendar.YEAR, 1996);

        // creating a date object with specified time.
        Date date3 = e.getTime();


        Student Mark = new Student("Mark", 3.2, date1);
        Student Bill = new Student("Bill", 3.4, date2);
        Student Tom = new Student("Tom", 3.5, date3);

        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(Mark);
        arr.add(Bill);
        arr.add(Tom);

        Collections.sort(arr, new NameComparator());
        System.out.println("NameComparator**************");
        for (Student student : arr) {
            System.out.println(" name : " + student.getName() + " gpa : " + student.getGpa() + "BirthDate :" + student.getDateOfBirth());
        }

        Collections.sort(arr, new Student.DateOfBirthComparator());
        System.out.println("DateOfBirthComparator**************");
        for (Student student : arr) {
            System.out.println(" name : "  + student.getName() + " gpa : " + student.getGpa() + "BirthDate :" + student.getDateOfBirth());
        }

        Collections.sort(arr, new Student.GpaComparator());
        System.out.println("GpaComparator**************");
        for (Student student : arr) {
            System.out.println(" name : "  + student.getName() + " gpa : " + student.getGpa() + "BirthDate :" + student.getDateOfBirth());
        }
    }
}
