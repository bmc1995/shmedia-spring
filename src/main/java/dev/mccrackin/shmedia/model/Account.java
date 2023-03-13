package dev.mccrackin.shmedia.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "DOB",  nullable = false)
    private Date dateOfBirth;
    @Column
    private boolean deleted;
}
