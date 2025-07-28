package sorting;

import models.Student;

import java.util.Comparator;

public class NameSorter implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
