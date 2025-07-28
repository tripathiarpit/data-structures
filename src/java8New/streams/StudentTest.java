package java8New.streams;

import java8New.util.StudentUtil;
import models.Student;
import models.Subject;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTest {

    List<Student> studentList;
    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
        studentTest.studentList = StudentUtil.getStudents();
        List<Student> studentList = null;
//        System.out.println("Total Students::"+ studentTest.studentList .stream().count());
//        //Get Students whose percentage is greater than Specified %
//        studentList = studentTest.percentageGreaterThan(70);
//        //System.out.println("Student having % greater than 70");
//       // studentList.forEach(System.out::println);
//        studentList = studentTest.getStudentStudyingSubject("Science");
//        System.out.println("Student Studying Science");
//        studentList.forEach(System.out::println);
//        studentList = studentTest.sortTheStudentListBasedOnPercentage();
//        System.out.println("Sorted on basis of %");
//        studentList.forEach(System.out::println);

//        Optional<Student> minimumPercentage = studentTest.getStudentHavingHighestPercentage();
//        minimumPercentage.stream().forEach(student -> System.out.println(student));
//        Map<String,List<Student>> stringListMap = studentTest.groupStudentByClass();
//        stringListMap.forEach((standard,students)-> System.out.println("Class::"+ standard+ ",Students::"+ students));
        // Map<String,List<Student>> stringListMap =studentTest.getHightestThreeByClass();
        // stringListMap.forEach((standard,students)-> System.out.println("Class::"+ standard+ ",Students::"+ students));

//        studentList = studentTest.gpaMoreThanMAndEnrolledInAlteastNSubjects(70);
//        studentList.forEach(System.out::println);
//
//
//        Optional<Student> optionalStudent = studentTest.getHishestCreditsStudent();
//        if(optionalStudent.isPresent()){
//           optionalStudent.stream().forEach(System.out::println);
//        }
//    }

//       List<Student> s = studentTest.greatestNumOIfSubjects();
//        System.out.println(s);
       // System.out.println("Stuents::"+studentTest.getAllStudentFromCity("Delhi"));

        System.out.println("Stuents::"+studentTest.getStudentsBasedOnMarks(40));

    }

    public List<Student> percentageGreaterThan(double percentage) {
       return this.studentList.stream().filter(student -> student.getPercentage() > percentage).collect(Collectors.toList());
    }

    public List<Student> getStudentStudyingSubject(String subjectName) {
        Predicate<Student> studentSubject = student -> student.getEnrolledSubjects().stream().anyMatch(subject-> subject.getSubjectTitle().equalsIgnoreCase(subjectName));
       return this.studentList.stream().filter(studentSubject).collect(Collectors.toList());
    }
    public  List<Student> sortTheStudentListBasedOnPercentage(){
        return this.studentList.stream().sorted(Comparator.comparing(Student::getPercentage).reversed()).collect(Collectors.toList());
    }
    public Optional<Student> getStudentHavingMinimumPercentage(){
        return this.studentList.stream().min(Comparator.comparing(Student::getPercentage));
    }

    public Map<String,List<Student>> groupStudentByClass(){


        return this.studentList.stream().collect(Collectors.groupingBy(Student::getStandard));
    }
    public List<String> getUniqueSubjects(){
        return this.studentList.stream().flatMap(student -> student.getEnrolledSubjects().stream().map(Subject::getSubjectTitle)).collect(Collectors.toSet()).stream().toList();
    }
    public Map<String, List<Student>>  getHightestThreeByClass() {
        Map<String, List<Student>> sortedMap= new HashMap<>();
        Map<String, List<Student>> studentListMap = this.studentList.stream().collect(Collectors.groupingBy(Student::getStandard));
        studentListMap.forEach((standard, students) -> {
           List<Student> sortedStudent = students.stream().sorted(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).intValue() -
                            o2.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).intValue();
                }
            }).limit(3).collect(Collectors.toList());
            sortedMap.put(standard,sortedStudent);
        });

        return sortedMap;
    }

    public List<Student>  gpaMoreThanMAndEnrolledInAlteastNSubjects(double percentage) {
       return  this.studentList.stream().filter(student -> student.getPercentage() > percentage).filter(
                student -> student.getEnrolledSubjects().stream().count() == 2
        ).collect(Collectors.toList());

    }

    public Optional<Student>  getHishestCreditsStudent() {
        Optional<Student> sorttedSList = this.studentList.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).intValue() -
                        o1.getEnrolledSubjects().stream().collect(Collectors.summingDouble(Subject::getScoredMarks)).intValue();
            }
        }).findFirst();
      //  System.out.println(sorttedSList);
        return sorttedSList;
    }

    public List<Student>  greatestNumOIfSubjects() {
        List<Student> sorttedSList = this.studentList.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getEnrolledSubjects().stream().count() -
                         o1.getEnrolledSubjects().stream().count());
            }
        }).findFirst().stream().toList();
        //  System.out.println(sorttedSList);
        return sorttedSList;
    }


    public String getAllStudentFromCity(String cityName) {
        return this.studentList.stream().filter(student -> student.getAddress().equalsIgnoreCase(cityName)).map(Student::getName).collect(Collectors.joining(", "));
    }

    public Map<String,List<String>> getStudentsBasedOnMarks(double percentageCriteria) {
        return this.studentList.stream().collect(Collectors.groupingBy(student-> student.getPercentage() > percentageCriteria? "Higher than "+percentageCriteria: "Lower Than"+percentageCriteria, Collectors.mapping(Student::getName,Collectors.toList())));
    }

}
