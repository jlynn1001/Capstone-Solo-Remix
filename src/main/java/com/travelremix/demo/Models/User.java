package com.travelremix.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @Column(name="user_id")
    Integer userId;
    @Getter
    @Setter
    @Column(name="username")
    private String username;
    @Getter
    @Setter
    @Column(name="first_name")
    private String firstName;
    @Getter
    @Setter
    @Column(name="last_name")
    private String lastName;
    @Getter
    @Setter
    @Column(name="password")
    private String password;
    @Getter
    @Setter
    @Column(name="email")
    private String email;

}
