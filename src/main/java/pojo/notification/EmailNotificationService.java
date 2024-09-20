package pojo.notification;

import pojo.customer.Customer;

public interface EmailNotificationService {
    void sendEmailSpam(Customer customer);
}