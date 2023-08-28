package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Comparator;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        Student[] students = new Student[]{
                new Student(110001, "Dave", dateFormat.parse("11/18/1951")),
                new Student(110002, "Anna", dateFormat.parse("12/07/1990")),
                new Student(110003, "Erica", dateFormat.parse("01/31/1974")),
                new Student(110004, "Carlos", dateFormat.parse("08/22/2009")),
                new Student(110005, "Bob", dateFormat.parse("03/05/1990"))
                // ... add more students
        };

        printListOfStudents(students); // Calling to print list of students

        System.out.println("\nPlatinum Alumni Students (descending order of their dates of admission):");
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students); // Return list of platinum students
        for (Student student : platinumAlumni) {
            System.out.println(student);
        }
    }

    // Print list of students
    public static void printListOfStudents(Student[] students) {
        System.out.println("List of Students (Name ascending order):");

        List<Student> studentlist = new ArrayList<Student>();
        for (Student student : students) {
            studentlist.add(student);
        }

        // Using Lambdae xpression to sort the Students Names in ascending order
        studentlist.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName()));
        studentlist.forEach((s)->System.out.println(s));

        /*for (Student student : students) {
            System.out.println(student);
        }*/

    }

    // Return list of platinum students
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumni = new ArrayList<>();
        Date currentDate = new Date();

        for (Student student : students) {
            long yearsSinceAdmission = (currentDate.getTime() - student.getDateOfAdmission().getTime()) / (1000 * 60 * 60 * 24 * 365);
            if (yearsSinceAdmission >= 30) {
                platinumAlumni.add(student); //student who gained admission into the University at least 30 years ago.
            }
        }

        // Using Lambdae xpression to sort the Pltinum students in
        //descending order of their dates of admission
        platinumAlumni.sort((s1, s2) -> s2.getDateOfAdmission().compareTo(s1.getDateOfAdmission()));

        return platinumAlumni;
    }
}
