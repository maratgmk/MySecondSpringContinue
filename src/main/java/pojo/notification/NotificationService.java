package pojo.notification;

import pojo.customer.Customer;

import java.time.LocalDate;

public class NotificationService {
    private final EmailNotificationService emailNotificationService;
    private final SmsNotificationService smsNotificationService;

    public NotificationService(EmailNotificationService emailNotificationService, SmsNotificationService smsNotificationService) {
        this.emailNotificationService = emailNotificationService;
        this.smsNotificationService = smsNotificationService;
    }

    public void sendSpam(Customer customer) {
        if (customer.getDateOfLastNotification().plusDays(30).isBefore(LocalDate.now())) {
            smsNotificationService.sendSmsSpam(customer);
            emailNotificationService.sendEmailSpam(customer);

        }
    }
}
