package models;

import java.math.BigDecimal;

public class Student {
    public Student(String name, String lastname, String address, BigDecimal pinCode, String phoneNumber, double percentage, String standard) {
        super();
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.percentage = percentage;
        this.standard = standard;
    }

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", percentage=" + percentage +
                ", standard='" + standard + '\'' +
                '}';
    }

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
}
