package com.example.notification.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notification.entity.Appointment;

@Service
public class NotificationService {

	@Autowired
	private EmailService emailService;
    @RabbitListener(queues = "notificationQueue")
    public void sendNotification(Appointment appointment) {
        // Logic to send notification to patient and doctor
        // This can be email, SMS, push notification, etc.
    	emailService.sendMail();
        System.out.println("Notification sent for appointment: " + appointment);
    }
}

