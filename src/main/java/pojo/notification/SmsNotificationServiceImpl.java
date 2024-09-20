package pojo.notification;

import pojo.customer.Customer;

public class SmsNotificationServiceImpl implements SmsNotificationService{
    @Override
    public void sendSmsSpam(Customer customer) {
        System.out.println("Sms Spam to the phone " + customer.getPhone() + " Miss " +customer.getName() + " Грузите апельсины бочками");

    }
}
