package pojo.customer;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
    private long id;
    private String name;
    private String phone;
    private String email;
    private LocalDate dateOfLastNotification;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfLastNotification() {
        return dateOfLastNotification;
    }

    public void setDateOfLastNotification(LocalDate dateOfLastNotification) {
        this.dateOfLastNotification = dateOfLastNotification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(phone, customer.phone) && Objects.equals(email, customer.email) && Objects.equals(dateOfLastNotification, customer.dateOfLastNotification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email, dateOfLastNotification);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfLastNotification=" + dateOfLastNotification +
                '}';
    }
}