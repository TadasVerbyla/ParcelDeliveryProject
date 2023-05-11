package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sentParcels;
    private String incomingParcels;
    private String password;
    private String username;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(Long id, String password, String username, String email, String address) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public Customer(String password, String username, String email, String address) {
        this.password = password;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSentParcels() {
        return sentParcels;
    }

    public void setSentParcels(String sentParcels) {
        this.sentParcels = sentParcels;
    }

    public String getIncomingParcels() {
        return incomingParcels;
    }

    public void setIncomingParcels(String incomingParcels) {
        this.incomingParcels = incomingParcels;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sentParcels='" + sentParcels + '\'' +
                ", incomingParcels='" + incomingParcels + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
