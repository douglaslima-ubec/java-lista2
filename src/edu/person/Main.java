package edu.person;

import java.util.function.Consumer;
import java.util.HashSet;
import edu.person.school.Student;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // creates a set of elements of type Student
        // it doesn't allow duplicate elements based on the studentID attribute
        Set<Student> students = new HashSet<>() {
            {
                add(new Student("Ana", 24, 12));
                add(new Student("Gisele", 19, 10));
                add(new Student("Carlos", 32, 8));
                add(new Student("James", 22, 7));
                add(new Student("Karoline", 23, 3));
                add(new Student("Vanessa", 29, 15));
                add(new Student("Matthew", 27, 9));
                add(new Student("Josh", 26, 5));
                add(new Student("Smith", 28, 13));
                add(new Student("Misha", 30, 2));
            }
        };
        // creates a consumer to print all the elements of type Student
        Consumer<Student> printStudents = student -> {
            System.out.printf("%10d %20s %10d%n", student.getStudentID(), student.getName(), student.getAge());
        };
        System.out.println();
        System.out.printf("%10s %20s %10s%n", "ID", "NAME", "AGE");
        System.out.printf("%10s %20s %10s%n", "--", "----", "---");
        students.forEach(printStudents);
    }

}