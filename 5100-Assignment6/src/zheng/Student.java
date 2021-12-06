package zheng;

import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }

    public Student( String name, double gpa, Date dateOfBirth) {
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    static class NameComparator implements Comparator<Student> {

        // Method
        // Sorting in ascending order of roll number
        @Override
        public int compare(Student a, Student b)
        {

            return a.name.compareTo(b.name);
        }
    }

    static class DateOfBirthComparator implements Comparator<Student> {

        // Method
        // Sorting in ascending order of roll number
        @Override
        public int compare(Student a, Student b)
        {

            return a.dateOfBirth.compareTo(b.dateOfBirth);
        }
    }
    static class GpaComparator implements Comparator<Student> {

        // Method
        // Sorting in ascending order of roll number
        @Override
        public int compare(Student a, Student b)
        {
            return Double.compare(b.gpa,a.gpa);
        }
    }

}