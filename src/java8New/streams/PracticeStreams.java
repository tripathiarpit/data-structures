package java8New.streams;
import java.util.*;
import java8New.util.StudentUtil;
import models.Student;
import models.Subject;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeStreams {
    List<Student> studentList;
    public static void main(String[] args) {
        PracticeStreams studentTest = new PracticeStreams();
        studentTest.studentList = StudentUtil.getStudents();
        // Get a list of student names.
        System.out.println("-------------------Names of All Students--------------------------");
        System.out.println(studentTest.getNameOfAllStudents());
        System.out.println("--------------------------------------------");
        // Get a list of students who have a percentage greater than 75%.
        System.out.println("-------------------Names of All Students with percentage greater than 75%--------------------------");
        System.out.println(studentTest.getNameOfAllPercentageGreaterThan(75));
        System.out.println("--------------------------------------------");
        // Count how many students are from a given city (match with address).
        System.out.println("-------------------Names of All Students with City Name Delhi--------------------------");
        System.out.println(studentTest.getNameOfStudentsFromCity("Delhi"));
        System.out.println("--------------------------------------------");

        // Check if any student belongs to standard "10th".
        System.out.println("------------------Check if any student belongs to standard 10th--------------------------");
        System.out.println(studentTest.testWhetherStudentsExistForClass("10th"));

        System.out.println("--------------------------------------------");

        // Group students by standard.
        System.out.println("------------------Group students by standard.--------------------------");
        System.out.println(studentTest.groupStudentsByClass());

        System.out.println("--------------------------------------------");

        // Average Age of All Students
        System.out.println("------------------Average Age of All Students.--------------------------");
        System.out.println(studentTest.getAverageAgeOfAllStudents());
        System.out.println("--------------------------------------------");

        // Get the student with the maximum percentage.
        System.out.println("------------------Get the student with the maximum percentage.--------------------------");
        System.out.println(studentTest.getHighestScoringStudent());
    }
    // Get a list of student names.
    public List<String> getNameOfAllStudents(){
        return this.studentList.stream().map(Student::getName).collect(Collectors.toList());
    }
    public List<String> getNameOfAllPercentageGreaterThan(Integer percentage){
        return this.studentList.stream().filter(student -> {
            return student.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).intValue() > percentage;
        }).map(Student::getName).collect(Collectors.toList());
    }
    public List<String> getNameOfStudentsFromCity(String cityName){
        return this.studentList.stream().filter(student -> {
            return student.getAddress().toLowerCase().equals(cityName.toLowerCase());
        }).map(Student::getName).collect(Collectors.toList());
    }
    public boolean testWhetherStudentsExistForClass(String className) {
        return this.studentList.stream().anyMatch(student -> {
            return student.getStandard().equals("10th");
        });
    }
    public Map<String, List<String>> groupStudentsByClass() {
       return this.studentList.stream().collect(Collectors.groupingBy(Student::getStandard,Collectors.mapping(Student::getName, Collectors.toList())));
    }
    public Double getAverageAgeOfAllStudents() {
       return this.studentList.stream().collect(Collectors.summarizingInt(Student::getAge)).getAverage();
    }
    public List<Student> getHighestScoringStudent() {
        return this.studentList.stream().sorted((o1, o2)->{
            Double studentOnePercentage =
                    o1.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).doubleValue()/
                            (o1.getEnrolledSubjects().stream().collect(Collectors.counting()).intValue() * 100) * 100;
                    Double studentTwoPercentage =
                            o2.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).doubleValue()/
                                    (o1.getEnrolledSubjects().stream().collect(Collectors.counting()).intValue() * 100) * 100;
            return  studentTwoPercentage.intValue()-studentOnePercentage.intValue();
        }).findFirst().map(List::of)
                .orElse(List.of());
    }

    public Map<String,List<Student>> getTopScorerPerStandard() {
        this.studentList.stream().collect(Collectors.toList()(Collectors.groupingBy(Student::getStandard))
    }
}
