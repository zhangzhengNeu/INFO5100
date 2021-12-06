package zheng;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void getDateOfBirthFromUser() throws ageException {
        SimpleDateFormat sdf = new SimpleDateFormat(" yyyy-MM-dd " );
        String s= "2022-07-09";

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Drivers Birth date in format DD/MM/YYYY");

        String strDate = myObj.nextLine();
        String[] dateArr = strDate.split("/");
        String day = dateArr[0];
        String month = dateArr[1];
        if(day.charAt(0) == 0){
            day = day.substring(1);
        }
        if(month.charAt(0) == 0){
            month = month.substring(1);
        }
        int strDay = Integer.parseInt(dateArr[0]);

        if(strDay < 0 || strDay > 32){
            System.out.println("day error");
            return;
        }
        int strMonth = Integer.parseInt(dateArr[1]) - 1;
        if(strMonth < 0 || strMonth > 12){
            System.out.println("month error");
            return;
        }
        int strYear = Integer.parseInt(dateArr[2]);
        if(strYear < 0 || strYear > 2021){
            System.out.println("year error");
            return;
        }
        Date dateNow = new Date();
        Date date2 = new GregorianCalendar(strYear, strMonth, strDay).getTime();

        int difference = (int) ChronoUnit.DAYS.between( date2.toInstant(), dateNow.toInstant());
        if(365* 16 < difference){
            System.out.println("User is above age limit");
        }
        if(365* 16 > difference){
            throw new ageException(difference);
        }

    }
    static class ageException extends Exception
    {
        private int difference ;
        public ageException(int difference)
        {
            this.difference = difference;
        }
        public int getDifference() {
            return difference;
        }

    }


}

