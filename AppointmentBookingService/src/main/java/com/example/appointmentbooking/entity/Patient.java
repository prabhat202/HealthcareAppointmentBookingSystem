package com.example.appointmentbooking.entity;

public class Patient {
    private String name;
    private int age;
    private String patientId;

    public Patient(String name, int age, String patientId) {
        this.name = name;
        this.age = age;
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", patientId='" + patientId + '\'' +
                '}';
    }
}

