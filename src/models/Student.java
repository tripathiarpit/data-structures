package models;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    public Student(){

    }

    public Student(List<Subject> enrolledSubjects, String name, int age, String lastname, String address, BigDecimal pinCode, String phoneNumber, double percentage, String standard) {
        this.enrolledSubjects = enrolledSubjects;
        this.name = name;
        this.age = age;
        this.lastname = lastname;
        this.address = address;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.percentage = percentage;
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrolledSubjects=" + enrolledSubjects +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", percentage=" + percentage +
                ", standard='" + standard + '\'' +
                '}';
    }

    List<Subject> enrolledSubjects;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student getSelfReference(){
        return this;
    }
    private int age;



    private String lastname;
    private String address;
    BigDecimal pinCode;
    private String phoneNumber;
    private double percentage;
    private String standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPinCode() {
        return pinCode;
    }

    public void setPinCode(BigDecimal pinCode) {
        this.pinCode = pinCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public List<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<Subject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }


}
