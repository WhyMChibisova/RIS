package com.example.lab8rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "fax_Number")
    private String faxNumber;

    public Customer() {
    }

    public Customer(int id, String name, String address1, String address2, String faxNumber) {
        this.id = id;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.faxNumber = faxNumber;
    }

    public Customer(String name, String address1, String address2, String faxNumber) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.faxNumber = faxNumber;
    }
}
