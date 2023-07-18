package com.blog.com.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;

}
