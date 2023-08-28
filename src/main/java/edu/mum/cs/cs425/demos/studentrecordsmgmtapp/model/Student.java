package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int studentId;
    private String name;
    private Date dateOfAdmission;

    //Default constractor
    public Student() {
    }

    //Parameterized Constructor
    public Student(int studentId, String name, Date dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    //Parameterized Constructor
    public Student(String name, Date dateOfAdmission) {
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    // StudentID getter
    public int getStudentId() {
        return studentId;
    }

    // StudentID setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Student name getter
    public String getName() {
        return name;
    }

    // Student name setter
    public void setName(String name) {
        this.name = name;
    }

    // date of admission getter
    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    // date of admission setter
    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    //Override toString method
    @Override
    public String toString() {
        return "Student Info: [" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                ']';
    }


    /*public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Student[] students = new Student[]{
                new Student(110001, "Dave", dateFormat.parse("11/18/1951")),
                new Student(110002, "Anna", dateFormat.parse("12/07/1990")),
                new Student(110003, "Erica", dateFormat.parse("01/31/1974")),
                new Student(110004, "Carlos", dateFormat.parse("08/22/2009")),
                new Student(110005, "Bob", dateFormat.parse("03/05/1990"))
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }*/
}
