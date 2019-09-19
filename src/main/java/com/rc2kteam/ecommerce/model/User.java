package com.rc2kteam.ecommerce.model;


import java.time.LocalDateTime;

public class User {
    protected Long id;
    protected String email;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected boolean active;
    protected LocalDateTime lastConnection;
}
