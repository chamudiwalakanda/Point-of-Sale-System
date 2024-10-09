package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;


@Entity
public class userEntity {
    @Id
    private Integer id;
    @Getter
    private String username;
    @Getter
    private String password;
    private String roles; // "ROLE_USER" or "ROLE_ADMIN"

    // getters and setters


}
