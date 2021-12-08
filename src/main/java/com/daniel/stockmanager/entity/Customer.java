package com.daniel.stockmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity(name="customers")
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String firstname;

    private String lastname;
    private String address;
    private String photo;
    private String mail;

    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> customerOrders;

    public Customer() {
    }

    public Customer(String firstname, String lastname,
                    String address, String photo, String mail,
                    List<CustomerOrder> customerOrders) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.photo = photo;
        this.mail = mail;
        this.customerOrders = customerOrders;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", photo='" + photo + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
