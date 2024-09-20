package pojo.notification;

import pojo.customer.Customer;

public class EmailNotificationServiceImpl implements EmailNotificationService{

    @Override
    public void sendEmailSpam(Customer customer) {
        System.out.println("Email spam to email " + customer.getEmail() + " Miss " + customer.getName() + " Ответьте внимательно на все тесты");

    }
}
