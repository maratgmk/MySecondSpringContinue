import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.customer.Customer;
import pojo.notification.NotificationService;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer customer1 = context.getBean("first", Customer.class);
        System.out.println(customer1);
        Customer customer2 = context.getBean("second", Customer.class);
        System.out.println(customer2);
        System.out.println(customer1 == customer2);

        System.out.println(customer1.equals(customer2));
        NotificationService notificationService = context.getBean("notificationService", NotificationService.class);


        notificationService.sendSpam(customer1);
        notificationService.sendSpam(customer2);

    }
}
/**
 * 1.1 Создайте класс Customer с полями id, name, dateOfLastNotification, phone, email,
 * геттрами и сеттерами. В приложении создайте два бина типа Customer (используйте scope
 * ???Prototype???). "?Получите бины?"  из контекста и установите первому параметры {1L, “Bob”,
 * LocalDate.now(), “+19138445656”, null }, второму {2L, “Sarah”, 2024-16-01 , “+19158455617”,
 * ”sarah-sweet@candy.com”} и только затем получите бины из контекста.
 *
 * 1.2 Создайте класс NotificationService, который выполняет оповещение клиентов с
 * помощью метода sendSpam(Customer customer): если с последней отправки прошло
 * больше 30 дней, то он отправляет спам по имеющимся контактам (метод делегирует эту
 * работу ???интерфейсам??? от которых зависит - SmsNotificationService и EmailNotificationService).
 * Получите NotificationService из контекста и передайте ему бины клиентов.
 * SmsNotificationService и EmailNotificationService должны внедряться в NotificationService.
 * 1.3 Создайте класс SmsNotificationServiceImpl, следующий интерфейсу
 * SmsNotificationService, и класс EmailNotificationServiceImpl, следующий интерфейсу
 * EmailNotificationService И ТОЛЬКО ПОТОМ создавайте метод sendSpam(Customer customer) в классе NotificationService!!!!
 */