package edu.person.school;

import java.util.Objects;
import edu.person.Person;

public class Student extends Person implements Comparable<Student> {

    private int studentID;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student [name='" + super.getName() + "', age=" + super.getAge() + ", studentID=" + this.studentID + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.studentID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student s = (Student) o;
        return this.studentID == s.getStudentID();
    }

    @Override
    public int compareTo(Student student) {
        return super.getName().compareToIgnoreCase(student.getName());
    }

}