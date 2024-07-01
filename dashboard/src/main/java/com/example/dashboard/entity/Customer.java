package com.example.dashboard.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "firstName", length = 45)
    private String firstName;

    @Column(name = "lastName", length = 45)
    private String lastName;

    @Column(name = "email", length = 40)
    private String email;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "address", length = 45)
    private String address;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String password, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}

