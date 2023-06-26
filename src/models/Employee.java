package models;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String lastname;
    private String address;
    BigDecimal pinCode;
    private String phoneNumber;
    private double salary;
    private String emailAddress;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
