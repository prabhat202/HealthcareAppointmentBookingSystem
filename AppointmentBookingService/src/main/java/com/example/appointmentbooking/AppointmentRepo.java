package com.example.appointmentbooking;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointmentbooking.entity.Appointment;


public interface AppointmentRepo extends JpaRepository<Appointment, Object> {

}
