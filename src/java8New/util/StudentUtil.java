package java8New.util;

import models.Student;
import models.Subject;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StudentUtil {
    private  static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static void initializeAndConstructStudents() {
        List<Subject> subjects = Arrays.asList(new Subject("Maths"), new Subject("Science"),
                new Subject("Physics"),  new Subject("Computer"), new Subject("History"), new Subject("Arts"));
        List<String> names = Arrays.asList("Aarav", "Vihaan", "Ananya", "Ishaan", "Aditi", "Rohan", "Meera", "Kabir", "Neha", "Rahul",
                "Priya", "Arjun", "Sanya", "Kunal", "Divya", "Tushar", "Sakshi", "Varun", "Ritika", "Gaurav",
                "Simran", "Nikhil", "Sneha", "Raj", "Pooja", "Vikas", "Maya", "Amit", "Nisha", "Harsh",
                "Riya", "Krishna", "Vivek", "Isha", "Manish", "Tanvi", "Aditya", "Shreya", "Siddharth", "Kiran",
                "Yash", "Sonali", "Deepak", "Monica", "Ravindra", "Bhavana", "Tejas", "Rashmi", "Pankaj", "Jyoti");
        List<String> standards = Arrays.asList("6th", "7th", "8th", "9th", "10th", "11th", "12th");
        List<String> lastNames = Arrays.asList("Sharma", "Singh", "Tripathi", "Pandey", "Verma", "Bisht", "Karki", "Sati", "Kakde", "talpade");
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai", "Kolkata", "Pune", "Ahmedabad", "Jaipur", "Lucknow");

        Random random = new Random();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            String name = names.get(random.nextInt(names.size()));
            String lastname = "Sharma"; // Assigning a default last name, can be randomized further
            String standard = standards.get(random.nextInt(standards.size()));
            List<Subject> enrolledSubjects = subjects.stream()
                    .filter(s -> random.nextBoolean())
                    .collect(Collectors.toList());
            enrolledSubjects.stream().forEach(subject -> subject.setScoredMarks(random.nextDouble(1,100)));

            String address = cities.get(random.nextInt(cities.size()));
            String lastName =  lastNames.get(random.nextInt(cities.size()));

            BigDecimal pinCode = new BigDecimal(100000 + random.nextInt(900000)); // Generating 6-digit pinCode
            String phoneNumber = "9" + (1000000000L + random.nextInt(900000000)); // Random 10-digit number
           // double percentage = 30 + (random.nextDouble() * 50); // Percentage between 30% and 100%
            int age = 10 + random.nextInt(10); // Age between 10 and 20
           Double totalScoredMarks = enrolledSubjects.stream().collect(Collectors.summingDouble(Subject::getScoredMarks));
           Long totalMarks =  subjects.stream().count() * 100;
           double percentage = totalScoredMarks / totalMarks * 100;

            students.add(new Student(enrolledSubjects, name, age, lastName, address, pinCode, phoneNumber, percentage, standard));
        }

        StudentUtil.students = students;
    }
    public static List<Student> getStudents(){
        initializeAndConstructStudents();
        return students;
    }
}
