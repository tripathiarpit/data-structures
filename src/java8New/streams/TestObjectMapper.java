package java8New.streams;

import models.Employee;
import models.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestObjectMapper {
    public static void main(String[] args) {
//        List<Student> studentList = Stream.of(new Student("Arpit", "tripathi","tanakpur", BigDecimal.valueOf(2020303), "9388994894",
//                93, "10th",21),new Student("Arpitsasa", "tripathi","mum", BigDecimal.valueOf(2020303), "43434",
//                93, "12th",22),new Student("sasas", "tripathi","Del", BigDecimal.valueOf(2020303), "9388994843494",
//                93, "11th",14), new Student("asasas", "tripathi","tanakpur", BigDecimal.valueOf(2020303), "2323232",
//                93, "9th",10) ).collect(Collectors.toList());
        extractEmpldata(null).forEach(System.out::println);

        Function<List<Student>,List<String>>  names = getAllStudents();
        names.apply(null);

       Function<List<Student>, List<BigDecimal>> s = getStudentData(Student::getPinCode);
      List<BigDecimal> ss  = s.apply(null);


    }
    private static List<Employee> extractEmpldata(List<Student> studentList) {
        List<Employee> employeeList = studentList.stream().map(student -> {
            Employee employee = new Employee();
            employee.setName(student.getName());
            employee.setLastname(student.getLastname());
            employee.setPhoneNumber(student.getPhoneNumber());
            return employee;
        }).collect(Collectors.toList());
        return  employeeList;
    }
    private static Function<List<Student>,List<String>> getAllStudents(){
        return studenList-> studenList.stream().map(Student::getName).collect(Collectors.toList());
    }



    private static <R> Function<List<Student>, List<R>> getStudentData(Function<Student, R> extractor) {
        return studentList -> studentList.stream()
                .map(extractor)
                .collect(Collectors.toList());
    }

}
