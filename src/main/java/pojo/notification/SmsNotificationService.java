package pojo.notification;

import pojo.customer.Customer;

public interface SmsNotificationService {
    void sendSmsSpam(Customer customer);

}
