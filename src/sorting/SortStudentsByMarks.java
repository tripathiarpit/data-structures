package sorting;

import models.Student;

import java.util.Arrays;

public class SortStudentsByMarks {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pinky");
        student.setAddress("RJ");
        student.setPercentage(79);
        Student student1 = new Student();
        student1.setName("ARPIT");
        student1.setAddress("RJfdf");
        student1.setPercentage(69);
        Student student2 = new Student();
        student2.setName("SRK");
        student2.setAddress("RJ5fddf");
        student2.setPercentage(46);
        Student student3 = new Student();
        student3.setName("NSA");
        student3.setAddress("RJS");
        student3.setPercentage(87);
        Student student4 = new Student();
        student4.setName("STUDE");
        student4.setAddress("RJ");
        student4.setPercentage(85);

        Student arrays[] = new Student[5];
        arrays[0] = student;
        arrays[1] = student1;
        arrays[2] = student2;
        arrays[3] = student3;
        arrays[4] = student4;
        System.out.println("BEFORE SORT");

        for (Student stu: arrays) {
            System.out.println(stu);

        }
        Arrays.sort(arrays, new NameSorter());
        System.out.println("AFTER SORT");
        for (Student stu: arrays) {
            System.out.println(stu);

        }

    }
}
