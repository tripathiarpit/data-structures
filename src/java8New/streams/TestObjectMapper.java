package java8New.streams;

import models.Employee;
import models.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestObjectMapper {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("Arpit", "tripathi","tanakpur", BigDecimal.valueOf(2020303), "9388994894",
                93, "10th"),new Student("Arpitsasa", "tripathi","mum", BigDecimal.valueOf(2020303), "43434",
                93, "12th"),new Student("sasas", "tripathi","Del", BigDecimal.valueOf(2020303), "9388994843494",
                93, "11th"), new Student("asasas", "tripathi","tanakpur", BigDecimal.valueOf(2020303), "2323232",
                93, "9th") ).collect(Collectors.toList());
        extractEmpldata(studentList).forEach(System.out::println);


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

}
