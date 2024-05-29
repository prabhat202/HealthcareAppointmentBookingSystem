package com.example.appointmentbooking.services;

import java.util.ArrayList;
import java.util.List;

import com.example.appointmentbooking.entity.Appointment;
import com.example.appointmentbooking.entity.Doctor;
import com.example.appointmentbooking.entity.Patient;

public class AppointmentService {
    private List<Appointment> appointments;

    public AppointmentService() {
        this.appointments = new ArrayList<>();
    }

    // Method to add a new appointment
    public Appointment createAppointment(Appointment appointment) {
        appointments.add(appointment);
        return appointment;
    }

    // Method to cancel an appointment
    public Appointment cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
        return appointment;
    }

    // Method to get all appointments
    public List<Appointment> getAppointments() {
        return appointments;
    }

    // Method to get appointments for a specific doctor
    public List<Appointment> getAppointmentsForDoctor(Doctor doctor) {
        List<Appointment> doctorAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().equals(doctor)) {
                doctorAppointments.add(appointment);
            }
        }
        return doctorAppointments;
    }

    // Method to get appointments for a specific patient
    public List<Appointment> getAppointmentsForPatient(Patient patient) {
        List<Appointment> patientAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().equals(patient)) {
                patientAppointments.add(appointment);
            }
        }
        return patientAppointments;
    }

}
